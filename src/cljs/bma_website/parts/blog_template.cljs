(ns bma-website.parts.blog-template
  (:require [re-frame.core :as re-frame]
            [reagent.core :as reagent]
            [markdown-to-hiccup.core :as m]
            [bma-website.subs :as subs]
            [bma-website.blog-info.bma-vector :as bma-vector]
            [bma-website.blog-info.aerolyze-vector :as aerolyze-vector]
            [bma-website.parts.blog-sidebar :as sidebar]
            [bma-website.parts.blog-preview :as preview]
            [bma-website.parts.blog-post :as blog-post]))


(defn html []
  (let [blog_page (re-frame/subscribe [::subs/blog-page])
        blog_type (re-frame/subscribe [::subs/blog-type])]
    [:div {:class "blog_body"}
     [:div {:class "blog_header"}
      [:img {:class "blog_header_img"
             :src "./images/site/logos_and_headers/light_bma_logo_for_dark_bg.png"}]]

     [:div {:class "content_container"}
      (if (nil? @blog_page)
        (if (= @blog_type "blog")
          (preview/html bma-vector/info)
          (preview/html aerolyze-vector/info))
        (if (= @blog_type "blog")
          (blog-post/html @blog_page bma-vector/info)
          (blog-post/html @blog_page aerolyze-vector/info))) 
      (if (= @blog_type "blog")
        (sidebar/html bma-vector/info)
        (sidebar/html aerolyze-vector/info))]]))

