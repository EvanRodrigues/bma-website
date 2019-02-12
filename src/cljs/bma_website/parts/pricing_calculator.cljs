(ns bma-website.parts.pricing-calculator
  (:require [goog.string :as gstring]
            [goog.string.format]))

;; Monthly Prices
(def new_moon 3275)
(def full_moon 4525)
(def risk_module_monthly 1450)

;;Top subtotal
(def price_multiplier (atom 12))
(def subscription_plan_name (atom "New Moon"))
(def subscription_plan (atom new_moon))
(def subscription_cost (atom (* @price_multiplier @subscription_plan)))
(def risk_module (atom (* @price_multiplier risk_module_monthly)))
(def transaction_module_cost (atom (+ @subscription_cost @risk_module)))

;;Bottom subtotal
(def team_license_cost 500)
(def onboarding_fee 1500)
(def manager_license_cost 150)

(def team_license_minimum (atom 1))
(def team_license (atom (* @price_multiplier team_license_cost)))
(def manager_license (atom 0))
(def onboarding (atom 1500))
(def user_cost (atom 0))

(def surcharge (atom 1))
(def grand_total (atom 0))


;;Adds a dollar sign, decimal places, and commas to the prices
(defn format_price [price]
  (.toLocaleString (js/parseFloat (gstring/format "%.2f" price)) js/undefined #js {:style "currency" :currency "USD"}))


(defn calculate_subscription []
  (reset! subscription_cost (* @subscription_plan @price_multiplier @surcharge)))
(defn calculate_risk_cost []
  (if (not (= @risk_module 0))
   (reset! risk_module (* risk_module_monthly @price_multiplier @surcharge))))
(defn calculate_transaction_module []
  (reset! transaction_module_cost (+ @subscription_cost @risk_module)))
(defn calculate_user_cost []
  (reset! user_cost (+ @team_license @onboarding @manager_license)))

(defn calculate_grand_total []
  (reset! grand_total (+ @subscription_cost @risk_module @team_license @onboarding @manager_license)))
(defn calculate_license_cost [atom id cost]
  (let [license_quantity (js/parseInt (.-value (.getElementById js/document id)))]
    (if (js/Number.isNaN license_quantity)
      (reset! atom 0)
      (reset! atom (-> cost
                       (* license_quantity)
                       (* @price_multiplier)
                       (* @surcharge)))))) 
(defn calculate_onboarding_cost []
  (let [team_license_quantity (js/parseInt (.-value (.getElementById js/document "team_license_quantity")))]
    (if (js/Number.isNaN team_license_quantity)
      (reset! onboarding 0)
      (reset! onboarding (* onboarding_fee team_license_quantity)))))


(defn show_error [error_id]
  (set! (.-style (.getElementById js/document error_id)) "display: block;")

  (if (= error_id "non-number")
    (do
      (set! (.-style (.getElementById js/document "team_license_quantity")) "background-color: #f95959;")
      (set! (.-style (.getElementById js/document "manager_license_quantity")) "background-color: #f95959;")))
  (if (= error_id "team-low")
    (do
      (set! (.-innerHTML (.getElementById js/document "team-low")) (str @subscription_plan_name " requires at least " @team_license_minimum " team licenses."))
      (set! (.-style (.getElementById js/document "team_license_quantity")) "background-color: #f95959;")))
  (if (= error_id "manager-low")
    (set! (.-style (.getElementById js/document "manager_license_quantity")) "background-color: #f95959;")))

(defn hide_error [error_id]
  (set! (.-style (.getElementById js/document error_id)) "display: none;")

  (if (= error_id "non-number")
    (do
      (set! (.-style (.getElementById js/document "team_license_quantity")) "background-color: white;")
      (set! (.-style (.getElementById js/document "manager_license_quantity")) "background-color: white;")))
  (if (= error_id "team-low")
    (set! (.-style (.getElementById js/document "team_license_quantity")) "background-color: white;"))
  (if (= error_id "manager-low")
    (set! (.-style (.getElementById js/document "manager_license_quantity")) "background-color: white;")))


;; Updates all cost fields and totals when an input is changed
;; This function updates the DOM from the global atoms and variables
(defn update_prices []
  (hide_error "team-low")
  (hide_error "manager-low")
  (calculate_subscription)
  (calculate_risk_cost)
  (calculate_transaction_module)
  (calculate_license_cost team_license "team_license_quantity" team_license_cost)
  (calculate_onboarding_cost)
  (calculate_license_cost manager_license "manager_license_quantity" manager_license_cost)
  (calculate_user_cost)
  (calculate_grand_total)
  (set! (.-innerHTML (.getElementById js/document "subscription_cost")) (format_price @subscription_cost))
  (set! (.-innerHTML (.getElementById js/document "risk_module_cost")) (format_price @risk_module))
  (set! (.-innerHTML (.getElementById js/document "transaction_module_cost")) (format_price @transaction_module_cost))
  (set! (.-innerHTML (.getElementById js/document "team_license")) (format_price @team_license))
  (set! (.-innerHTML (.getElementById js/document "onboarding")) (format_price @onboarding))
  (set! (.-innerHTML (.getElementById js/document "manager_license")) (format_price @manager_license))
  (set! (.-innerHTML (.getElementById js/document "user_cost")) (format_price @user_cost))
  (set! (.-innerHTML (.getElementById js/document "grand_total")) (format_price @grand_total)))


(defn error_check []
  (let [team_quantity (js/parseInt (.-value (.getElementById js/document "team_license_quantity")))
        manager_quantity (js/parseInt (.-value (.getElementById js/document "manager_license_quantity")))]
    ;; Checks if input is a number
    (if (or (js/Number.isNaN team_quantity) (js/Number.isNaN manager_quantity))
      (show_error "non-number")
      (do
        (hide_error "non-number")
        (if (or (< team_quantity @team_license_minimum) (< manager_quantity 0))
          (do
            (if (< team_quantity @team_license_minimum)
              (show_error "team-low")
              (hide_error "team-low"))
            (if (< manager_quantity 0)
              (show_error "manager-low")
              (hide_error "manager-low")))
          (update_prices))))))

(defn toggle_risk_module []
  (if (= @risk_module 0)
    (do
      (reset! risk_module (* @price_multiplier risk_module_monthly))
      (error_check))
    (do
      (reset! risk_module 0)
      (error_check))))

(defn toggle_subscription_plan []
  (if (= @subscription_plan new_moon)
    (do
      (reset! subscription_plan full_moon)
      (reset! subscription_plan_name "Full Moon")
      (reset! team_license_minimum 2)
      (error_check))
    (do
      (reset! subscription_plan new_moon)
      (reset! subscription_plan_name "New Moon")
      (reset! team_license_minimum 1)
      (error_check))))

(defn toggle_price_multiplier []
  (if (= @price_multiplier 12)
    (do
      (reset! price_multiplier 1)
      (reset! surcharge 1.15)
      (error_check))
    (do
      (reset! price_multiplier 12)
      (reset! surcharge 1)
      (error_check))))


(defn html [] 
  [:div {:class "aerolyze-calculator-container"}
   [:div {:class "aerolyze-calculator"}    
    [:div {:class "calculator-section" :id "top-section"}
     [:h3 {:class "calculator-header"} "Transaction & Module Cost"]
     [:div {:class "calculator-row"}
      [:span {:class "calculator-left"} "Subscription Frequency"]
      [:div {:class "calculator-input"}
       [:select {:on-change #(toggle_price_multiplier)} 
        [:option {:value "annual"} "Annual"]
        [:option {:value "monthly"} "Monthly"]]]
      [:span {:class "calculator-right"}]] 

     [:div {:class "calculator-row"}
      [:span {:class "calculator-left"} "Subscription Plan"]
      [:div {:class "calculator-input"}
       [:select {:on-change #(toggle_subscription_plan)} 
        [:option {:value "new moon"} "New Moon"]
        [:option {:value "full moon"} "Full Moon"]]]
      [:span {:class "calculator-right" :id "subscription_cost"} (format_price @subscription_cost)]]
     [:div {:class "calculator-row"}
      [:span {:class "calculator-left"} "Include Risk Module?"]
      [:div {:class "calculator-input"}
       [:select {:on-change #(toggle_risk_module)}
        [:option {:value "yes"} "Yes"]
        [:option {:value "no"} "No"]]]
      [:span {:class "calculator-right" :id "risk_module_cost"} (format_price @risk_module)]]
     [:div {:class "calculator-total"}
      [:span {:class "calculator-left"} "Subtotal"]
      [:div {:class "calculator-input"}]
      [:span {:class "calculator-right" :id "transaction_module_cost"} (format_price @transaction_module_cost)]]]
    
    [:div {:class "calculator-section"}
     [:h3 {:class "calculator-header"} "User Costs"]
     [:div {:class "calculator-row"}
      [:span {:class "calculator-left"} "Team License Quantity"]
      [:div {:class "calculator-input"}
       [:input {:type "text" :id "team_license_quantity" :defaultValue "1" :on-change #(error_check)}]]
      [:span {:class "calculator-right" :id "team_license"} (format_price @team_license)]]
     [:div {:class "calculator-row"}
      [:span {:class "calculator-left"} "Onboarding Fees"]
      [:div {:class "calculator-input"}]
      [:span {:class "calculator-right" :id "onboarding"} (format_price @onboarding)]]
     [:div {:class "calculator-row"}
      [:span {:class "calculator-left"} "Manager License Quantity"]
      [:div {:class "calculator-input"}
       [:input {:type "text" :id "manager_license_quantity" :defaultValue "0" :on-change #(error_check)}]]
      [:span {:class "calculator-right" :id "manager_license"} (format_price @manager_license)]]
     [:div {:class "calculator-total"}
      [:span {:class "calculator-left"} "Subtotal"]
      [:div {:class "calculator-input"}]
      [:span {:class "calculator-right" :id "user_cost"} (format_price @user_cost)]]]
    
    [:div {:class "calculator-section" :id "grand-total"}
     [:span {:class "calculator-left"} " Grand Total"]
     [:div {:class "calculator-input"}]
     [:span {:class "calculator-right" :id "grand_total"} (do (calculate_grand_total) (format_price @grand_total))]]]

   [:div {:class "calculator-errors"}
    [:span {:style {:display "none"} :class "error-text" :id "non-number"} "Please input positive integers for license quantities."]
    [:span {:style {:display "none"} :class "error-text" :id "team-low"}]
    [:span {:style {:display "none"} :class "error-text" :id "manager-low"} "Please input a positive number of manager licenses."]]])
