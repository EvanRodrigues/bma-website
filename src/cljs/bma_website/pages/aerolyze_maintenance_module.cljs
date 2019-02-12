(ns bma-website.pages.aerolyze-maintenance-module
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_WEBSITE_AEROLYZE_LOGO_HEADER_narrow.jpg" "aerolyze logo header" "Maintenance Module")

   [:div {:class "codrops-bodyBMA clearfix"}
    [:div {:class "blockBMA blockBMA-5 clearfix"}]

    [:div {:class "blockBMA blockBMA-80 clearfix"}
     [:h2 {:style {:text-align "center"}} "Aircraft investors realize the importance of understanding their assets' maintenance condition in order to properly assess an aircraft's true value."]
     [:h2 "We have integrated advanced maintenance forecasts for engine and airframe events of any asset type into Aerolyze. Users are able to perform complex maintenance calculations painlessly and accurately within a few clicks."]
     [:br]
     [:h2 {:style {:text-align "left"}} "Aerolyze Maintenance Allows For:"]

     [:h3
      [:ul {:style {:text-align "left"}}

       [:li {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Maintenance Snapshots"]
        [:span {:style {:color "#000033"}} "As you initially set up Aerolyze you can:"] 
        [:ul {:style {:color "#000033"}} 
         [:li "Populate your database with assumptions on maintenance intervals related to all aircraft components despite the age;"]
         [:li "Create adjustments to aircraft values of your opportunities more accurately; and"]
         [:li "Assess the entire maintenance condition of each asset at a high level, all the way down to granular details, i.e. on a per LLP basis for engine maintenance events."]]] [:br]

       [:li {:style {:color "#316bad"}} 
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Maintenance Event Forecasting"]
       [:span {:style {:color "#000033"}} "Understanding the status and value of any given aircraft today is important, but being able to accuratley forecast future maintenance events is crucial in making key business decisions, and properly assessing transaction risk." [:br] "Aerolyze offers the fastest maintenance forecast solution without having to adjust or reinvent any models." [:br]] [:br]]

       [:li  {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Maintenance Security"]
        [:span {:style {:color "#000033"}} "Aerolyze allows you to track and forecast maintenance costs and rates on a per asset and per leases basis to factor in monthly cash reserves and end of lease financial adjustments in new deal analysis. Now you can quickly assess not only the maintenance condition, but total exposure, and potential lessor top-off for all contracts. This data also feeds into the optional Risk Module which, produces more thorough risk analysis."]] [:br]]]

     [:h3 "Aerolyze allows you to track and forecast maintenance events and realize maintenance securities effortlessly and without error, regardless of aircraft type." [:br] [:p] "Charts can allow users to quickly see when and what maintenance is expected, providing support for negotiations. The maintenance charts can also be included in reports to be easily communicated and shared with members in your organization, providing more clarity on the data and elaborating on the narrative around each deal opportunity."]

     [:br] 

      [:h4 {:style {:text-align "center"}}
      [:img {:src   "./images/icons/mx-forecast-engine-limits-chart.svg"
             :alt   "mx-forecast-engine-limits-chart.svg"
             :style {:display "block" :height "75%" :margin-left "auto" :margin-right "auto"}}]
      [:span [:i "The chart displays when LLPs and engine PRs are due during the remaining lease term. Note that once there is a shop visit the replaced materials start from either the MTBO or workscope, respective to engine overhaul or LLP replacement. In this example, the Fan LLPs do not force a performance restoration."]] ]
    [:h4 {:style {:text-align "center"}}
      [:img {:src   "./images/icons/mx-forecast-engine-acc-amounts-chart.svg"
             :alt   "mx-forecast-engine-accumulated-amounts-chart.svg"
             :style {:display "block" :height "75%" :margin-left "auto" :margin-right "auto"}}]
       [:span [:i "This stacked chart shows either the amounts that you will collect (assuming cash reserves) or your forecast exposure at any point in the future prior to lease expiration. You can easily assess an expected obligation to or from the lessee."]]]
    [:div {:class "blockBMA blockBMA-5 clearfix"}]]]])

