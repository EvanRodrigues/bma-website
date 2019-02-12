(ns bma-website.pages.aerolyze-pricing-OLD
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_WEBSITE_AEROLYZE_LOGO_HEADER_narrow.jpg" "aerolyze logo header" "Pricing")


   ;; Module Pricing
   [:div {:class "content clearfix"}
    [:h2 {:style {:color "#000033" :text-align "center" }}  "We can set up your company with access to Aerolyze within minutes. Organizations will have to determine both the level of service and quantity of users that will have access to Aerolyze."]
[:br]
    [:h2 {:style {:color "#316bad" :text-align "center" :text-decoration "underline"}} "Transaction & Module Pricing"]
        [:h3 "Regardless of the subscription type that is chosen for your organization, users will have full access to the efficient pricing tools and the advanced maintenance forecasting capabilities within Aerolyze."]
    [:h3 "The Risk Module can be added on to any Aerolyze subscription to enhance your deal analysis holistically."] 
    [:h3 [:br] "Read on to determine which one of the three transaction levels is right for your business."]
    [:div {:class "blockBMA blockBMA-5 blockFloat clearfix"}]
    [:div {:class "blockBMA blockBMA-30 blockFloat clearfix"}
     [:img {:src "./images/icons/pricing-new-moon.jpg"}]
     [:h2 "New Moon"]
     [:h2 {:style {:color "#000033"}} "$2,925 per Month " [:br] [:i "Billed Annually"]]
     [:h3 {:style {:color "#316bad"}} "Analyze Up To 50 Opportunities"]
     [:h3 {:style {:color "#316bad"}} "Requires At Least One (1) Team License"]]
     
    [:div {:class "blockBMA blockBMA-30 blockFloat clearfix"}
     [:img {:src "./images/icons/pricing-1st-quarter-moon.jpg"}]
     [:h2 "1st Quarter Moon"]
     [:h2 {:style {:color "#000033"}} "$3,275 per Month " [:br] [:i "Billed Annually"]]
     [:h3 {:style {:color "#316bad"}} "Analyze Up To 100 Opportunities"]
     [:h3 {:style {:color "#316bad"}} "Requires At Least One (1) Team License"]]

    
    [:div {:class "blockBMA blockBMA-30 blockFloat clearfix"}
     [:img {:src "./images/icons/pricing-full-moon.jpg"}]
     [:h2 "Full Moon"]
     [:h2 {:style {:color "#000033"}} "$3,455 per Month " [:br] [:i "Billed Annually"]]
     [:h3 {:style {:color "#316bad"}} "Analyze Up To 200 Opportunities"]
     [:h3 {:style {:color "#316bad"}} "Requires At Least Two (2) Team Licenses"]]
[:br]
    [:div {:class "blockBMA clearfix"}
     ;; [:img {:src "./images/icons/pricing-risk-module.jpg"}]
     [:h2 {:style {:color "#066"}} "Risk Module"]
     [:h2 {:style {:color "#066"}} "$1,450 per Month " [:br] [:i "Billed Annually"] [:br] ]
     [:h4 {:style {:padding  "0 20%" :color "#006"}} [:i"Please note that the pricing above reflects the Risk Module as an add-on to the any of the transaction level subscriptions. Contact us if you wish to use the Risk Module as a stand alone tool."]]]
    [:div {:class "blockBMA blockBMA-5 blockFloat clearfix"}]
    [:div {:class "codrops-bodyBMA clearfix"}
  
[:br]
    
[:h3 " Transaction level service refers to the quantity of opportunities that your organization can analyze each year. We view an opportunity as a single deal, which could include a stand alone aircraft or 30+ aircraft. "] 
     [:h3 "Each of the transaction and module costs for the base app and additional modules are billed annually per company."]
     ;; [:br] [:i"Please note that monthly billing with an annual contract is an option, but will incur a 20% surcharge."]
     ]
 
]

   ;; User Pricing
   [:div {:class "content clearfix"}
    [:h2 {:style {:color "#316bad" :text-align "center" :text-decoration "underline"}} "User License Pricing"]
   

         [:h3 "Each organization will need one (1) license for each user. The two envisioned users of Aerolyze are detailed below."]
     
    [:div {:class "blockBMA blockBMA-10 blockFloat clearfix"}]
    [:div {:class "blockBMA blockBMA-35 blockFloat clearfix"}
     [:img {:src "./images/icons/pricing-team-license-icon.jpg"}]
     [:h2 "Team-Level License"]
     [:h2 {:style {:color "#000033"}} "$500 per Month " [:br] [:i "Billed Annually"]]
     [:h3 {:style {:color "#316bad"}} "A one time onboarding fee of $1,500 will be charged up front."]
     [:h3 {:style {:color "#316bad"}} "This license allows full, unrestricted access to use all parts of the software. Each organization using Aerolyze will need to assign one user with a team license as their company's administrator."]]
    [:div {:class "blockBMA blockBMA-10 blockFloat clearfix"}] 
    [:div {:class "blockBMA blockBMA-35 blockFloat clearfix"}
     [:img {:src "./images/icons/pricing-manager-license-icon.jpg"}]
     [:h2 "Manager-Level License"]
     [:h2 {:style {:color "#000033"}} "$150 per Month " [:br] [:i "Billed Annually"]]
     [:h3 {:style {:color "#316bad"}} "No onboarding fees."]
     [:h3 {:style {:color "#316bad"}} "This license allows limited access for oversight. Users with manager licenses will have read-only access to all parts of Aerolyze, but they will be able to adjust the high-level assumptions for their organization, and also generate reports."]]
    [:div {:class "blockBMA blockBMA-10 clearfix"}]
[:h3 "Onboarding refers to initial data migration into Aerolyze, as well as our highly recommended one-on-one introduction and Q&A sessions to get first time users familiar with the software. Contact us for further details."]
[:h3 "Both types of licenses are billed annually per license. At least one team license is required with each transaction level subscription."]
     ;; [:br] [:i"Please note that monthly billing with an annual contract is an option, but will incur a 20% surcharge."] 
[:br]
  [:br] 

    


    ;;Aerolyze Pricing Examples
    [:div {:class "codrops-bodyBMA clearfix" :style {:margin "0 auto"}}
     [:h2 {:style {:color "#316bad" :text-align "center" :text-decoration "underline"}} "Aerolyze Pricing Examples"]
    [:h3 "Costs in each example are reflected on an annual basis"]
     [:h4 {:style {:text-align "center"}}

     ;;Minimum / Basic
      [:div {:class "blockBMA blockBMA-20 clearfix" :style {:margin "0 auto"}}
      [:h4
       [:div {:style {:text-align "center" :color "#316bad"}} [:u "Minimum / Basic"]] [:br]
       "New Moon (base)" [:br]
       "1x Team license" [:br]
       "One-time onboarding" [:br]
       [:br]
       "Total:"]]
      [:div {:class "blockBMA clearfix" :style {:margin "0 auto"}}
      [:h4 [:br] [:br]
       "$35,100" [:br]
       "$6,000" [:br]
       "$1,500" [:br] [:br]
       "$42,600"]]

     ;;More Volume
      [:div {:class "blockBMA blockBMA-20 clearfix" :style {:margin "0 auto"}}
      [:h4
       [:div {:style {:text-align "center" :color "#316bad"}} [:u "Analyze 100 Opportunities"]] [:br]
       "1st Qtr Moon (base)" [:br]
       "2x Team licenses" [:br]
       "One-time onboarding" [:br]
       "1x Manager license" [:br] [:br]
       "Total:"]]
      [:div {:class "blockBMA clearfix" :style {:margin "0 auto"}}
      [:h4 [:br] [:br]
       "$39,300" [:br]
       "$12,000" [:br]
       "$3,000" [:br]
       "$1,800" [:br] [:br]
       "$56,100"]]

     ;;Comprehensive Analysis
      [:div {:class "blockBMA blockBMA-20 clearfix" :style {:margin "0 auto"}}
      [:h4
       [:div {:style {:text-align "center" :color "#316bad"}} [:u "Analyze 100 Opportunities +"]] [:br]
       "1st Qtr Moon (base)" [:br]
       "2x Team licenses" [:br]
       "One-time onboarding" [:br]
       "2x Manager license" [:br]
       "Risk Module" [:br] [:br]
       "Total:"]]
      [:div {:class "blockBMA clearfix" :style {:margin "0 auto"}}
      [:h4 [:br] [:br]
       "$39,300" [:br]
       "$12,000" [:br]
       "$3,000" [:br]
       "$3,600" [:br]
       "$17,400" [:br] [:br]
       "$75,300"]]

      [:div {:class "blockBMA blockBMA-5 clearfix"}]]]

   [:hr]
    [:h2 {:style {:text-align "center"}}
     [:img {:src   "./images/site/eclipse_aerolyze_enterprise.jpg"
            :alt   "eclipse-aerolyze-enterprise-pricing"
            :width "25%"
            :style {:text-align "center" :margin "0 auto"}}]]
    [:h2 {:style {:text-align "center"}} "Aerolyze custom solutions for greater analysis requirements." [:br] [:br] 
     [:a {:style {:color "#316bad" } :href "/#contact"}   "Contact our sales professionals"]
    " for details and pricing."]]])
