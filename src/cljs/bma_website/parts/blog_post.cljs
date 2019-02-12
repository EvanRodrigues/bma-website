(ns bma-website.parts.blog-post
  (:require [markdown-to-hiccup.core :as md]))


(def dates {"01" "Jan", "02" "Feb", "03" "Mar", "04" "Apr", "05" "May", "06" "Jun",
            "07" "Jul", "08" "Aug", "09" "Sep", "10" "Oct", "11" "Nov", "12" "Dec"})

(defn format_date [date]
  (let [date_parts (clojure.string/split date " ")
        year (nth date_parts 0)
        month (nth date_parts 1)
        day (nth date_parts 2)]
    (str (get dates month) " " day ", " year)))


(defn replace_escape [str]
  (-> str
      (clojure.string/replace "&#39;" "'")
      (clojure.string/replace "&quot;" "\"")
      (clojure.string/replace "&amp;" "&")))



;;Traverses through the blog_info vector and replaces escape characters in all vectors containing strings
(defn remove_escape_chars [blog_info]
  (loop [counter 0
         blog_info blog_info]

    (if (< counter (count blog_info))
      (if (vector? (nth blog_info counter))
        ;;Traverse into sub vector
        (recur (inc counter) (assoc blog_info counter (remove_escape_chars (nth blog_info counter))))

        (if (string? (nth blog_info counter))
          (recur (inc counter) (assoc blog_info counter (replace_escape (nth blog_info counter))));;Found a string, replace escape chars with normal chars.
          (recur (inc counter) blog_info))) ;; This is the key of the hiccup, skip and move on

      blog_info)))



(defn html [blog_page blog_vector]
  (let [blog_post (nth blog_vector blog_page)
        title (get blog_post :title)
        author (get blog_post :author)
        date (format_date (get blog_post :date))
        tags (get blog_post :tags)
        body (get blog_post :body)
        thumbnail (get blog_post :thumbnail)]

    (format_date date)

    [:div {:class "post_container"}
     [:div {:class "post_header"}
      [:h1 {:class "post_title"} title]
      [:div {:class "post_info"}
       [:span {:class "icon icon-user post_author"} (str " " author)]
       [:span {:class "icon icon-clock"} (str " " date)]
       [:span {:class "icon icon-tag post_tags"} (str " " tags)]]]

     [:div {:class "post_body"}
      (remove_escape_chars (->> body
                                (md/md->hiccup)
                                (md/component)))]]))
