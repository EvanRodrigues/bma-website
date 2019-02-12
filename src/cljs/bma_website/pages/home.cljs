(ns bma-website.pages.home
  (:require [bma-website.parts.misc :as misc]))

;; Home Page Content
(defn html []
  [:div {:class "codrops-bodyBMA"}
   [:span {:id "hs_cos_wrapper_module_151544186792795"
           :class "hs_cos_wrapper hs_cos_wrapper_widget hs_cos_wrapper_type_raw_html"
           :data-hs-cos-general-type "widget"
           :data-hs-cos-type "raw_html"}
    [:header {:class "codrops-header"
              :style {:padding-bottom "2em" :border-bottom "2px solid #316bad"}}
     [:img {:src "./images/site/logos_and_headers/Blue_Moon_Analytics_welcome.jpg"
            :alt "blue moon analytics home welcome header"
            :style {:cursor "default" :width "100%" :border-bottom "2px solid #316bad"}}]
     [:br]
     [:h1 "An Adaptive And Creative Fintech Company"]
     [:h1 {:style {:font-size "1.5em" :color "#8e8ea4"}} "Improving Business One Tool At a Time"]]]
  
   [:div {:class "codrops-bodyBMA clearfix"}
    [:div
     [:h3 {:style {:color "#316bad" :margin "0 15%" :display "block" :text-align "center"}}
      [:br] "Blue Moon Analytics was created to address software shortcomings and business process inefficiencies."
      [:br] [:br] "Having a deep understanding of the Microsoft Office Suite, we create more dynamic financial solutions for companies of all sizes."
      [:br] [:br] "Most importantly, we design all software from scratch, allowing Blue Moon Analytics software to be more agile than the competition and address customer needs quickly and thoroughly."
      [:br] [:br] "We focus on developing superior financial analytical tools so that you can focus on making your business best in class!"] [:br] [:br] [:hr]]

    [:div
     [:h2 {:style {:margin "0 15%" :display "block" :text-align "center"}}
      [:br] "Addressing aircraft analysis shortcomings, we have created Aerolyze!"]
     [:h2 {:style {:padding-left "5%" :padding-right "5%"}} 
      [:a {:href "#/aerolyze-home" :style {:color "#316bad"}} "Click here"]
      " to learn more about how Aerolyze can streamline your aircraft trading needs, and" [:a {:href "#/contact" :style {:color "#316bad"}} " schedule an in depth demo today!"]
      ]
     [:br]

     ;; ;; webkitallowfullscreen? etc.
     ;; (misc/video-player "https://player.vimeo.com/video/251724289")
     ;; (misc/video-links "https://vimeo.com/" "251724289" "Aerolyze Executive Demo" "user79024452" "Blue Moon Analytics" "Vimeo")

     ;; [:br]
     ;; [:h2 "Now that you have seen the video, "
      ;; ]
     [:br] [:br] [:hr]]

    [:div {:class "blockBMA blockBMA-5 blockFloat clearfix"}]
    [:div {:class "blockBMA blockBMA-30 blockFloat clearfix"}
     [:img {:src "./images/icons/airplane.png"}]
     [:h2 "Knowledgeable Business Professionals"]
     [:h3 {:style {:color "#316bad"}} "Over 12 years of proven experience in aviation & banking industries"]]
    [:div {:class "blockBMA blockBMA-30 blockFloat clearfix"}
     [:img {:src "./images/icons/rocket.png"}]
     [:h2 "Advanced Automation & Problem Solving"]
     [:h3 {:style {:color "#316bad"}} "Building all proprietary software from scratch ensures efficient upgrades, addressing our customer's needs"]]
    [:div {:class "blockBMA blockBMA-30 blockFloat clearfix"}
     [:img {:src "./images/icons/lock_cloud.png"}]
     [:h2 "Secure Data Storage"]
     [:h3 {:style {:color "#316bad"}} "Blue Moon Analytics uses the same data encryption and security features that commercial banks use. Your information is safe with us!"]]]])

