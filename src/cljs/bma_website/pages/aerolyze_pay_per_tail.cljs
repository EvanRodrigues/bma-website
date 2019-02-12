(ns bma-website.pages.aerolyze-pay-per-tail
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_WEBSITE_AEROLYZE_LOGO_HEADER_narrow.jpg" "aerolyze logo header" "Aerolyze Per Asset")


   ;; Module Pricing
   [:div {:class "content clearfix"}
    [:h2 {:style {:color "#000033" :text-align "center" }}  "We can set up your company with access to Aerolyze within minutes. Organizations may choose to use Aerolyze on a per asset basis."]
[:br]
    [:h2 {:style {:color "#316bad" :text-align "center" :text-decoration "underline"}} "Pay Per Tail Costs"]
        [:h3 "Whether your company needs to validate an internal analysis or perform a new aircraft review from scratch, we offer a solution without an annual subscription. Paying per tail (by the asset) allows you to control costs and still use Aerolyze to its fullest pricing and maintenance forecasting capabilities."]
    [:h3 "The Risk Module can be added on to any quantity of Aerolyze Pay Per Tail purchases to enhance your deal analysis holistically."] 
    ;; [:h3 [:br] "Please review the Aerolyze Pay Per Tail specifics below."]
    [:div {:class "blockBMA blockBMA-10 blockFloat clearfix"}]
      
    [:div {:class "blockBMA blockBMA-80 blockFloat clearfix"}
     [:img {:src "./images/icons/pay-per-tail-pricing-new-moon.jpg"}]
     [:h2 "Pay Per Tail Overview"]
     [:h2 {:style {:color "#000033"}} "$375 per Asset"]
     [:h3 {:style {:color "#316bad"}} "The cost includes two (2) team licenses, encouraging collaboration while allowing users full use of Aerolyze and its advanced pricing capabilities."]
     [:h3 {:style {:color "#316bad"}} "Look at deals on both a cash and accounting basis, run complex solvers and forecast maintenance events and the related economic impact within seconds, and access Blue Moon Analytic's Nth Reporting engine to summarize your data into consistent reports within a few clicks."]
     [:h3 "Each Pay-Per-Tail asset will be accessible for three (3) months from the created date. Your data will be backed up and never deleted." ]
     [:h3 {:style {:color "#316bad"}} "The Risk Module can also be added on, giving users true complete access to Aerolyze functionality."]
[:p " "]
     [:h2 {:style {:color "#066"}} "Risk Module"]
     [:h2 {:style {:color "#066"}} "$1,450 per Month"]]
    
;; [:br]
;;     [:div {:class "blockBMA clearfix"}
;;      ;; [:img {:src "./images/icons/pricing-risk-module.jpg"}]
;;      [:h2 {:style {:color "#066"}} "Risk Module"]
;;      [:h2 {:style {:color "#066"}} "$1,450 per Month"]
;;     ]
;;     [:div {:class "blockBMA blockBMA-10 blockFloat clearfix"}]
;;     [:div {:class "codrops-bodyBMA clearfix"}
  
;; [:br]
;;   [:h3 " "]  
;;      ]
 
]

   ;; User Pricing
   [:div {:class "content clearfix"}
  [:br] 
   ;;Aerolyze Pricing Examples
       [:hr]
    [:h2 {:style {:text-align "center"}}
     [:img {:src   "./images/site/eclipse_aerolyze_enterprise.jpg"
            :alt   "eclipse-aerolyze-enterprise-pricing"
            :width "25%"
            :style {:text-align "center" :margin "0 auto"}}]]
    [:h2 {:style {:text-align "center"}} "Aerolyze custom solutions for greater analysis requirements." [:br] [:br] 
     [:a {:style {:color "#316bad" } :href "/#contact"}   "Contact our sales professionals"]
    " for details and pricing."]]])

