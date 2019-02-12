(ns bma-website.pages.custom-modules
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/Blue_Moon_Analytics_welcome.jpg" "blue moon analytics home welcome header" "Custom Modules")
   
    [:div {:class "codrops-bodyBMA clearfix"}
     [:div {:class "blockBMA blockBMA-5 clearfix"}]
     [:div {:class "blockBMA blockBMA-80 clearfix"}
      [:h2 [:span "We understand that most out-of-the-box software tools do not always meet 100% of a company's needs." [:br] [:br]
            "As we have built all of our products from scratch, we can also add a custom module onto any of our platforms. We will work with your team to ensure that your
             business logic is translated into software that makes you competitive in your industry." [:br] [:br]
            [:a {:href "#/contact" :style {:color "#316bad"}} "Contact Us "] "to learn more."]]]
     [:div {:class "blockBMA blockBMA-5 clearfix"}]]])

