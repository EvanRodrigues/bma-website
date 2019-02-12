(ns bma-website.pages.team
  (:require [bma-website.parts.misc :as misc]))


;; team page html
(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_moon_header.jpg" "blue moon analytics home team header" "Team")

    [:div {:class "codrops-bodyBMA clearfix"}
     [:div {:class "blockBMA blockBMA-5 clearfix"}]
     [:div {:class "blockBMA blockBMA-80 clearfix"}
      [:h2 {:style {:text-align "center"}}
       "We have over 13 years of combined bank and aviation industry experience. Our team is knowledgable, professional, and understands the deemands, common issues, and possible solutions surrounding asset management and trading"       [:br] [:br]
       "We are firm believers in being lean and nimble."]
      [:h2 "Being closer to the customer and truly listening to their needs is extremely important to us."]
      [:h2 "We can quickly change our plan or tactics around the project to suit customer needs. Our flexibility translates to your productivity and success."]]
     [:div {:class "blockBMA blockBMA-5 clearfix"}]]

    [:div {:class "codrops-bodyBMA clearfix"}

     ;;Matt Info Box
     [:div {:class "blockBMA blockBMA-5 blockMember clearfix"}]
     [:div {:class "blockBMA blockBMA-40 blockMember clearfix" :style {:border "2px solid #ccc"}}
      [:div
       [:img {:src "./images/site/company_photos/george_washington.jpg"
              :style {:float "left" :width "150px" :height "inherit" :padding "6px"}
              :alt "blue moon analytics team"}]
       [:h2 {:style {:text-align "left"}} "George Washington"]
       [:h3 {:style {:text-align "left" :color "#316bad"}} "CEO"]]
      [:div
       [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit."]
       [:p "Nullam vulputate, sem a convallis luctus, orci purus semper quam, a molestie urna enim eu leo. Sed tempus nulla at sollicitudin sodales."]
       [:p "Aliquam mattis aliquam dictum. Nam sed nunc id tortor ornare iaculis. Morbi ornare nulla eget efficitur ullamcorper. Aliquam sed malesuada sem. Praesent aliquam, lectus ac pellentesque ultricies, augue felis feugiat erat, in porta justo augue eu metus. Curabitur rhoncus ante viverra nisl malesuada imperdiet. Nunc hendrerit nisi consectetur venenatis dictum."]
       [:p "Maecenas erat lectus, maximus feugiat efficitur in, mattis quis quam."]]]

     ;;Dale Info Box
     [:div {:class "blockBMA blockBMA-5 blockMember clearfix"}]
     [:div {:class "blockBMA blockBMA-40 blockMember clearfix" :style {:border "2px solid #ccc"}}
      [:div
       [:img {:src "./images/site/company_photos/ben_franklin.jpg"
              :style {:float "left" :width "150px" :height "inherit" :padding "6px"}
              :alt "blue moon analytics team"}]
       [:h2 {:style {:text-align "left"}} "Ben Franklin"]
       [:h3 {:style {:text-align "left" :color "#316bad"}} "CFO"]]
      [:div
       [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit."]
       [:p "Nullam vulputate, sem a convallis luctus, orci purus semper quam, a molestie urna enim eu leo. Sed tempus nulla at sollicitudin sodales."]
       [:p "Aliquam mattis aliquam dictum. Nam sed nunc id tortor ornare iaculis. Morbi ornare nulla eget efficitur ullamcorper. Aliquam sed malesuada sem. Praesent aliquam, lectus ac pellentesque ultricies, augue felis feugiat erat, in porta justo augue eu metus. Curabitur rhoncus ante viverra nisl malesuada imperdiet. Nunc hendrerit nisi consectetur venenatis dictum."]
       [:p "Maecenas erat lectus, maximus feugiat efficitur in, mattis quis quam."]]]
     [:div {:class "blockBMA blockBMA-5 blockMember clearfix"}]]])
