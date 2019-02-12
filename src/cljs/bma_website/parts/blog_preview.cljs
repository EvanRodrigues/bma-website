(ns bma-website.parts.blog-preview
  (:require [re-frame.core :as re-frame]
            [bma-website.parts.blog-post :as blog]
            [bma-website.subs :as subs]))


;;Cleans up the previews, that show markdown.
;;Need a library to remove markdown.
(defn remove-markdown [preview]
  (-> preview
      (clojure.string/replace "*" "")
      (clojure.string/replace "#" "")
      (clojure.string/replace "1." "")))


(defn fill-preview [title img date author preview tags path]
  (let [blog_type (re-frame/subscribe [::subs/blog-type])
        href (str "#/" @blog_type path)]
    [:div {:class "blog_preview"}
     [:div {:class "preview_header"}
      [:a {:href href} [:h2 {:class "preview_title"} title]]]
     [:div {:class "preview_content_container"}
      [:img {:class "preview_img"
             :src img}]
      [:div {:class "preview_content"}
       [:p {:class "preview_text"} (remove-markdown preview)]]]
     [:div {:class "preview_footer_container"}
      [:span {:class "preview_date icon icon-clock"} (str " " date)]
      [:span {:class "icon icon-user"} (str " " author)]
      [:span {:class "icon icon-tag"} (str " " tags)]
      [:a {:class "read_more" :href href} "Read More >>"]]]))


(defn blog-preview [blog-info]
  (let [preview-entries [:div {:class "blog_content"}]]
    (into preview-entries (mapv #(fill-preview (get % :title)
                                               (get % :thumbnail)
                                               (blog/format_date (get % :date))
                                               (get % :author)
                                               (get % :preview)
                                               (get % :tags)
                                               (get % :path)) blog-info))))


(defn html [blog-vector]
  (blog-preview blog-vector))
