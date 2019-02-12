(ns bma-website.blog
  (:require [stasis.core :as stasis]
            [secretary.core :as secretary]
            [markdown-to-hiccup.core :as md]
            [clj-time.core :as t]
            [clj-time.format :as f]))
(use 'clojure.java.io)

(defn remove-md-extension [paths]
  (mapv #(subs % 0 (- (count %) 3)) paths))


(def blog-info-directory "./src/cljs/bma_website/blog_info")
(def bma-posts-directory (clojure.java.io/file "./resources/public/blog_posts/Blue_Moon_Analytics"))
(def aerolyze-posts-directory (clojure.java.io/file "./resources/public/blog_posts/Aerolyze"))

;;file-seq chooses files alphabetically, so we sort slurp-directory to match our paths with our files.
(def bma-blog-files (file-seq bma-posts-directory))
(def aerolyze-blog-files (file-seq aerolyze-posts-directory))

(def bma-paths (remove-md-extension (sort (keys (stasis/slurp-directory bma-posts-directory #"\.md$")))))
(def aerolyze-paths (remove-md-extension (sort (keys (stasis/slurp-directory aerolyze-posts-directory #"\.md$")))))


(defn string-to-int [str]
  (Integer. (re-find #"\d+" str)))

(defn string-to-date [str]
  (let [date_parts (clojure.string/split str #" ")
        year (string-to-int (nth date_parts 0))
        month (string-to-int (nth date_parts 1))
        day (string-to-int (nth date_parts 2))
        converted_dates []]

    (t/date-time year month day)))


;;Markdown files need to be structured as:
;;Line 1: Title
;;Line 2: Date
;;Line 3: Author
;;Line 4: Thumbnail
;;Lines 5-(first blank line): Tags
;;Blog Body is the rest of the file.
(defn extract-file-title [file]
  (with-open [rdr (clojure.java.io/reader file)]
    (nth (line-seq rdr) 0)))

(defn extract-file-date [file]
  (with-open [rdr (clojure.java.io/reader file)]
    (string-to-date (nth (line-seq rdr) 1))))

(defn extract-file-author [file]
  (with-open [rdr (clojure.java.io/reader file)]
    (nth (line-seq rdr) 2)))

(defn extract-file-thumbnail [file]
  (with-open [rdr (clojure.java.io/reader file)]
    (nth (line-seq rdr) 3)))

(defn get-tags-end [file]
  (with-open [rdr (clojure.java.io/reader file)]
    (.indexOf (line-seq rdr) "")))


;;Generates a comma separated string of the blog's tags
(defn extract-file-tags [file]
  (let [tags-end (get-tags-end file)]
    (with-open [rdr (clojure.java.io/reader file)]
      (clojure.string/join ", " (subvec (vec (line-seq rdr)) 4 tags-end)))))


;;Returns the line that the blog body starts.
;;Since the tags end right before the blog body starts, just add one to get-tags-end.
(defn get-blog-start [file]
  (+ 1 (get-tags-end file)))


(defn extract-blog-body [file]
  (with-open [rdr (clojure.java.io/reader file)]
    (clojure.string/join "\n" (subvec (vec (line-seq rdr)) (get-blog-start file)))))


;;Removes img markdown from the beginning of the preview body
(defn remove-preview-img [body]
  (if (clojure.string/starts-with? body "!")
    (subs body (+ 1 (clojure.string/index-of body ")")) 450)
    (subs body 0 450)))



;;Sorts the blog posts by date.
;;Most recent will be earlier in the vector.
(defn sort-blog-parts [parts]
  (reverse (sort-by :date parts)))


(def custom-formatter (f/formatter "yyyy MM dd"))


;;converts the date object of each blog entry into a string
;;input - a map of all blog meta data
(defn dates-to-string [parts]
  (mapv #(assoc % :date (f/unparse custom-formatter (:date %))) parts))


;;Generates a map for each blog post.
(defn combine-blog-parts [title path date author thumbnail tags body]
  (let [map {}]
    (-> map
        (assoc :title title)
        (assoc :path path)
        (assoc :date date)
        (assoc :author author)
        (assoc :thumbnail thumbnail)
        (assoc :tags tags)
        (assoc :body body)
        (assoc :preview (str (remove-preview-img body) "...")))))


(defn format-cljs [blog-info ns]
  (str "(ns " ns  ") (def info " blog-info ")"))


;;Ignores the first entry in blog-files (the folder)
;;Goes through each file and extracts the information from each
;;Returns a vector of every blog file's information
(defn build-blog-vector [blog-files blog-paths]
  (let [files (vec (drop 1 blog-files))]
    (mapv #(combine-blog-parts (extract-file-title %1)
                               %2
                               (extract-file-date %1)
                               (extract-file-author %1)
                               (extract-file-thumbnail %1)
                               (extract-file-tags %1)
                               (extract-blog-body %1)) files blog-paths)))


;;goes through the file-sec
;;Inputs:
;;@blog-files: file-sec of all the blog markdown files
;;@blog-paths: a list of blog file names without .md
;;@ns: the clojurescript namespace where the exported vector will be
;;@vector-path: the .cljs file name that holds the blog vector
(defn export-blog-info [blog-files blog-paths ns vector-path]
  (stasis/export-pages {vector-path (format-cljs (dates-to-string (sort-blog-parts (build-blog-vector blog-files blog-paths))) ns)} blog-info-directory))


;;Empty info directory and export blog entries into their respective files.
(defn get-blogs []
  (stasis/empty-directory! blog-info-directory)
  (export-blog-info bma-blog-files bma-paths "bma-website.blog-info.bma-vector" "/bma_vector.cljs")
  (export-blog-info aerolyze-blog-files aerolyze-paths "bma-website.blog-info.aerolyze-vector" "/aerolyze_vector.cljs"))
