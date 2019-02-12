(ns bma-website.pages.aerolyze-base-features
  (:require [bma-website.parts.misc :as misc]))


(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_WEBSITE_AEROLYZE_LOGO_HEADER_narrow.jpg" "aerolyze logo header" "Aerolyze: Base Application")

   [:div {:class "codrops-bodyBMA clearfix"}
    [:div {:class "blockBMA blockBMA-5 clearfix"}]
    [:div {:class "blockBMA blockBMA-80 clearfix"}
     [:h2 {:style {:text-align "center"}} "Aerolyze has been designed from the ground up using custom code."]
     [:h3 {:style {:text-align "center"}} "We bring a competitive edge by having deep industry experience in understanding the sensitivities and demands of lenders, operating lessors, and airlines." [:br] [:p] "We have dealt with the problems that you face and innovated a solution to alleviate the pricing analysis pain-points that arise when evaluating a new volume opportunity." [:p] "This allows us to offer our customers agility and flexibility."]
     [:h3 [:p]]
     [:h2 {:style {:text-align "center"}} "Aerolyze Base Features"]
     [:hr]
     [:h3 {:style {:font-weight "800" :color "#316bad"}} "Aerolyze is designed as an objective tool with deal economics as the primary focus."]
     [:h3 "All that is required of the user is to input assumptions and deal specifics - Aerolyze handles the heavy lifting. Within seconds you will be able to solve for specific financial targets set by management. You can further forecast another lease scenario using distinct assumptions. Using reporting templates you can then quickly generate output summaries as PDF reports to share with colleagues or present to a Board for deal approval."]
     [:br]
     [:h3 {:style {:font-weight "800" :color "#316bad"}} "No longer waste time creating or tweaking financial models or generating deal summaries of airvraft or engine opportunities."]
     [:h3 "As additional modules are created, companies may integrate them into their Aerolyze subscription thus creating more robust and comprehensive analytical and decision making tool"]
     [:br]
     [:h3 {:style {:font-weight "800" :color "#316bad"}} "Aerolyze gives your company the opportunity to be more competitive in the marketplace with the following functionality:"]
     [:h3 {:style {:text-align "center"}}
      [:img {:src   "./images/icons/calculator.jpg"
             :alt   "calculator.jpg"
             :style {:display "block" :height "75%" :margin-left "auto" :margin-right "auto"}}]
      [:span {:style {:text-align "center" :background-color "transparent"}} "Simplification of Complex Deal Analysis"]]
     [:h3 {:style {:text-align "center"}}
      [:span {:style {:text-align "center" :height "75%" :background-color "transparent"}} "Structuring Deals with Dynamic Transaction Modeling"]]
     [:h3 {:style {:text-align "center"}}
      [:span "Pricing Solvers for ROE / ROA / Yield / Rent / Lease Rate Factor"]]
     [:h3 {:style {:text-align "center"}}
      [:span "Back-Leverage Deals with Complex Multi-Tranche Loan Structures"]]
 
     [:h4 {:style {:text-align "center"}}
      [:img {:src   "./images/icons/multi-tranche-loan-chart.svg"
             :alt   "multi-tranche-loan-chart.svg"
             :style {:display "block" :height "75%" :margin-left "auto" :margin-right "auto"}}]
      [:span [:i "The stacked chart displays three types of loans: interest-only, mezzanine, and straight-line with a 65% advance."]] ]
     [:h3 {:style {:text-align "center"}}
      [:span "Quickly Generate Maintenance Forecasts for Cash Reserves or 1-Way and 2-Way Financial Compensation at Lease Expiration."]]
     [:p]
     [:h3 {:style {:text-align "center"}}
      [:span
       [:img {:src   "./images/icons/report.jpg"
              :style {:display "block" :height "75%" :margin-left "auto" :margin-right "auto"}
              :alt   "report.jpg"}]
       "Quick Summary Output Reporting." [:p] "Our Consistent and Standardized One-Click Reports Ensure that the Analysis Summary is as Efficient to Generate as it is Easy to Review."]]
[:p]
     [:h3 {:style {:text-align "center"}}
      [:img {:src   "./images/icons/module_stack.jpg"
             :style {:display "block" :height "75%" :margin-left "auto" :margin-right "auto"}
             :alt   "module stack.jpg"}] [:br]
      [:span "You Always Have the Option to Customize Aerolyze to Improve Your Business Processes"]]
     [:p]

     ;;Aerolyze Demo
     

     ;; (misc/video-player "https://player.vimeo.com/video/251724289")
     ;; (misc/video-links "https://vimeo.com/" "251724289" "Aerolyze Executive Demo" "user79024452" "Blue Moon Analytics" "Vimeo")
     ]
    
    [:div {:class "blockBMA blockBMA-5 clearfix"}]]])
 
