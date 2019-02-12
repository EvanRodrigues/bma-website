(ns bma-website.pages.aerolyze-home
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_WEBSITE_AEROLYZE_LOGO_HEADER_narrow.jpg" "aerolyze logo header" "What Is Aerolyze?")

   [:div {:class "codrops-BMA clearfix"}
    [:div {:class "blockBMA blockBMA-5 clearfix"}]
    [:div {:class "blockBMA blockBMA-80 clearfix"}
     [:h2 {:style {:text-align "center"}} "Aerolyze is the industry's first holistic software platform designed to streamline aircraft investors' trading."]
     [:br] [:h2 {:style {:color "#316bad"}}
            [:i] "Analyze and Price Aircraft Purchase Opportunities 8X Faster than Using Excel!"]
     [:br]
         ;; (misc/video-player "https://player.vimeo.com/video/251724289")
     ;; (misc/video-links "https://vimeo.com/" "251724289" "Aerolyze Executive Demo" "user79024452" "Blue Moon Analytics" "Vimeo")

     [:h3 {:style {:text-align "center"}} "Focusing on the end-user experience and understanding the issues that come along with presenting deals to upper management or a board, we have built Aerolyze to structure your own deal narrative. By having the flexibility to tweak assumptions and run solvers on the fly you can confidently answer questions quickly, and without having to go back and heavily modify a cumbersome spreadsheet." [:br] [:br]
      "Please" [:a {:href "#/contact"} " contact us "] "with any questions or to schedule a more in depth demo for Aerolyze, the software solution to your aircraft trading needs."]
      [:h3 "Explore the additional features of Aerolyze from our navigation above."]
]
    [:div {:class "blockBMA blockBMA-5 clearfix"}]]])

