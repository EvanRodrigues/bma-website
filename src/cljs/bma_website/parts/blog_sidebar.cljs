(ns bma-website.parts.blog-sidebar
  (:require [re-frame.core :as re-frame]
            [reagent.core :as reagent]
            [bma-website.subs :as subs]
            [bma-website.parts.blog-post :as blog]))


(defn fill-entry [title img date path]
  (let [blog_type (re-frame/subscribe [::subs/blog-type])
        href (str "#/" @blog_type path)]
    [:a {:class "entry_link" :href href}
     [:div {:class "sidebar_entry"}
      [:img {:class "entry_thumbnail"
             :src img}]
      [:div {:class "entry_content"}
       [:h4 {:class "entry_title"} title]
       [:span {:class "entry_date"} date]]]]))


(defn fill-sidebar [blog-info]
  (let [preview-posts (vec (take 5 blog-info))
        sidebar-entries [:div {:class "sidebar_container"}
                         [:h2 {:class "sidebar_title"} "Recent Posts"]]]

    (into sidebar-entries (mapv #(fill-entry (get % :title)
                                             (get % :thumbnail)
                                             (blog/format_date (get % :date))
                                             (get % :path)) preview-posts))))


(defn html [blog-vector]
  (fill-sidebar blog-vector))
