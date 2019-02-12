(ns bma-website.pages.nth-reports
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_WEBSITE_AEROLYZE_LOGO_HEADER_narrow.jpg" "aerolyze logo header" "Nth Reports")

   [:div {:class "codrops-bodyBMA clearfix"}
    [:div {:class "blockBMA blockBMA-5 clearfix"}]

    [:div {:class "blockBMA blockBMA-80 clearfix"}
     [:h2 {:style {:text-align "center"}} "Aircraft investors know that the analysis is crucial, but presenting the findings to either their deal team, upper management, or investors is just as important. We have built our programmable reporting engine to ensure that asset analysis reports, including formatting, are worry-free and hassle-free. The standard Nth Reports are included in any services offered by Blue Moon Analytics at no additional charge."]
     [:br] [:br]
     [:h2 {:style {:text-align "left"}} "Nth Reports Competitive Advantages:"]

     [:h3
      [:ul {:style {:text-align "left"}}

       [:li {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Nth Reports Are Consistent"]
        [:span {:style {:color "#000033"}} "Excel spreadsheet-based reports are rarely consistent, or take up precious time formatting information to attain consistency. The same could be said about PowerPoint as well. Drawing from past experiences, we made sure to organize any reports generated by our Nth Reports engine so that deal parameters and economics outputs are always easy to find and will remain in a standard format."]] 
        [:br] 
       [:li {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Nth Reports Are Fully Programmable"]
        [:span {:style {:color "#000033"}} "If you require outputs that are not standard within Aerolyze, we can quickly program calculations within Nth Reports, provided that the inputs are within Aerolyze."]] 
        [:br] 
       [:li {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Nth Reports Are Customizable"]
        [:span {:style {:color "#000033"}} "If you require specific formatting or need a more thorough report, we are happy to discuss custom reports with your company."]]
        
   
    [:div {:class "blockBMA blockBMA-5 clearfix"}]]]]]])
