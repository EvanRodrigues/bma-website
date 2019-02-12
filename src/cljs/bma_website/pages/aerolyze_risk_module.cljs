(ns bma-website.pages.aerolyze-risk-module
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/BMA_WEBSITE_AEROLYZE_LOGO_HEADER_narrow.jpg" "aerolyze logo header" "Risk Module")

   [:div {:class "codrops-bodyBMA clearfix"}
    [:div {:class "blockBMA blockBMA-5 clearfix"}]
    
    [:div {:class "blockBMA blockBMA-80 clearfix"}
     [:h2 {:style {:text-align "center"}} "Considering, measuring, and factoring in all elements of risk is crucial to successful aviation lending and leasing."]
     [:h2 "Aerolyze has partnered with Provident Aviation to ensure that you are able to assess risk holistically and accurately." [:br] [:br]]
     [:h2 {:style {:text-align "left"}} "The Risk Module encompasses:" [:br]]


     [:h3
      [:ul {:style {:text-align "left"}}
       [:li {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Counterparty Risk"]
        [:span {:style {:color "#000033"}} "Financial performance is where it begins and the Risk Module emphasizes the financial ratios that matter most." [:br] "However, inherent in the premise of the module is the recognition that airlines are unique and assessing airline credit risk can't just entail a straight ration analysis. Indeed, it is just as important to assess qualitative metrics (i.e. strength/commitment of ownership, access to capital markets, strategy, competitive landscape). But the key is to calibrate them in a quantitative way and understand the real risk at hand." [:br] "The Risk Module performs that calibration and accurately measures the risk of default over a defined timeframe, taking the quantitative and qualitative factors in cohort to form a realistic prediction." [:br]]] [:br]

       [:li {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Transaction Risk"]
        [:span {:style {:color "#000033"}} "Focusing on credit risk alone neglects major pieces of the puzzle" [:br] "Counterparty risk is key, but so are asset risk, jurisdictional risk, and market risk and all of the elements thereof." [:br] "The Risk Module contemplates all of this in combination to inform the optimum transaction structure to pursue and measure whether the \"risk-reward\" proposition is in balance." [:br]]] [:br]

       [:li {:style {:color "#316bad"}}
        [:p {:style {:text-decoration "underline" :color "#316bad"}} "Risk Tolerance"]
        [:span {:style {:color "#000033"}} "Marrying the elements of Counterparty Risk and Transaction Risk determines where you reside on the risk curve and how you need to get paid to do so. In short, the Risk Module answers the crucial question of whether you are getting compensated appropriately for the risk you are undertaking."]]]]


     [:h3 "You can now fully assess every element of risk in one place. The Risk Module effortlessly generates PDF reports on Counterparty and Transaction Risk and aids in completing the narrative around each deal opportunity and your portfolio as a whole."]

     ;; [:h2 {:style {:text-align "center" :color "#316bad" :text-decoration "underline"}} [:br] "Preview the Risk Module in action below:"]
     ]

    [:div {:class "blockBMA blockBMA-5 clearfix"}]
    ;; [:img {:src "./images/site/risk_gif_forever.gif"
    ;;        :alt "aerolyze risk module provident"
    ;;        :width "80%"
    ;;        :style {:margin "0 auto" :display "block" :text-align "center" :padding ".25em" :border "2px solid #316bad"}}]
    ]])
