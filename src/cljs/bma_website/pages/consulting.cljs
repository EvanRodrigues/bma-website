(ns bma-website.pages.consulting
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/Blue_Moon_Analytics_welcome.jpg" "Blue Moon Analytics Consulting" "Consulting Services")

   [:div {:class "codrops-bodyBMA clearfix"}
    [:div {:class "blockBMA blockBMA-5 clearfix"}]

    [:div {:class "blockBMA blockBMA-80 clearfix"}
     [:h2 {:style {:text-align "center"}} "We understand that integrating new software systems can be a daunting task, which is why we are leveraging our domain expertise and analytical software capabilities to provide consulting on aircraft acquisition and remarketing efforts."] 
     [:h2 {:style {:text-align "center"}} "By using Aerolyze we are able to provide comprehensive analysis in a fraction of the time it takes using even the most sophisticated Excel models. We also use our proprietary progammable reporting engine (Nth Reports) to provide clean and consistent reports  for aircraft analysis on both an individual aircraft basis, as well as the opportunity as a whole."]
  
   [:div {:class "blockBMA blockBMA-5 clearfix"}]

    ]]])
