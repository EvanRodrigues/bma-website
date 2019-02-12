(ns bma-website.parts.footer)



;; footer
(defn html []
  [:div {:class "footer-container-allBMA clearfix"} 
   [:div {:class "footer-containerBMA"}
    [:div.footer-sub-boxesBMA
     [:h3 "Sitemap"]
     [:p 
      [:a {:href "#/"} "Home"]]  
     [:p
      [:a {:href "#/our-story"} "Our Story"]]
     [:p
      [:a {:href "#/team"} "Team"]]
     [:p
 [:a {:href "#/advisory"} "Advisory Services"]]]]

   [:div {:class "footer-containerBMA"}
    [:div.footer-sub-boxesBMA
     [:h3 "PRODUCTS"]

     [:p
      [:span {:style {:text-decoration "underline"}}
       [:a {:href "#/aerolyze-home"} "AEROLYZE"]]]
         ;; [:p
     ;;  [:span {:style {:text-decoration "underline"}}
     ;;   [:a {:href "#/aerolyze-base"} "AEROLYZE FEATURES"]]]
     [:p
      [:a {:href "#/aerolyze-base"} "Advanced Pricing"]]
 [:p
      [:a {:href "#/maintenance-module"} "Maintenance"]]
     [:p
      [:a {:href "#/risk-module"} "Risk Module"]]
    ;; [:p
    ;;   [:a {:href "#/blog-aerolyze"} "Updates"]]
      [:p
      [:a {:href "#/pay-per-tail"} "Cost: Pay Per Tail"]]
[:p
 [:a {:href "#/subscription-pricing"} "Cost: Subscription"]]
     

     ;; [:p
     ;; [:a {:href "#/custom-modules"} "CUSTOM MODULES"]]
    ]]
   
   [:div {:class "footer-containerBMA"}
    [:div.footer-sub-boxesBMA
     [:h3 "SUPPORT"]
     [:p]
     [:p
      [:a {:href "http://app.aerolyze.com"} "Customer Login"]]
     [:a {:href "#/contact"}
      [:p "Request Demo"]]
     [:p
      [:span 
       [:a {:href "#/contact"} "Contact Us"]]]]]
   [:div {:class "footer-containerBMA"}
    [:div.footer-sub-boxesBMA
     [:h3 "BLOG"]

     [:p
      [:a {:href "#/blog"} "General Blog"]]
     [:p
      [:a {:href "#/blog-aerolyze"} "Aerolyze Blog"]]]]

   [:div {:class "footer-containerBMA"}
    [:div.footer-sub-boxesBMA
     [:h3 "Trust Center"]
     [:p 
      [:a {:href "#/privacy-policy"} "PRIVACY POLICY"]]
     [:p 
      [:a {:href "#/terms-of-service"} "TERMS OF SERVICE"]]]]])


;; Copyright section (sits at bottom of footer)
(defn copyright []
  [:div {:class "copyrightBMA clearfix"}
   [:p
    [:a {:href "#/" :style {:color "#ebeed9"}} "Blue Moon Analytics"]
    " | 2017"
    [:br]]])
