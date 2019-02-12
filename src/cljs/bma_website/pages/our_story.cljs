(ns bma-website.pages.our-story
  (:require [bma-website.parts.misc :as misc]))


;; our-story html content
(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/Blue_Moon_Analytics_welcome.jpg" "blue moon analytics home welcome header" "Our Story")

    [:div {:class "codrops-bodyBMA clearfix"}
     [:div {:class "blockBMA blockBMA-5 clearfix"}]
     [:div {:class "blockBMA blockBMA-80 clearfix"}
      [:h2 {:style {:text-align "center"}} "Following years of using general software to analyze tens of billions of dollars of commercial aircraft transactions, we knew there had to be a better way. As the Excel models became more complex, and as customers became more savvy, they were tedious to modify and maintain, error prone, and made collaboration extremely difficult."]
      [:h2 "A product with capable processing power needed to analyze deals and generate thorough reports did not exist. Until now."]
      [:br]
      [:h2 "We created Blue Moon Analytics to build superior tools for businesses of all sizes. Our software allows our customers to analyze deals faster and more accurately, which in turn increases their productivity."]
      [:h2 "We go the extra mile to ensure that our products provide complete narrative around your analysis, making it easier to communicate with colleagues or present to managements."]]
     [:div {:class "blockBMA blockBMA-5 clearfix"}]]])
