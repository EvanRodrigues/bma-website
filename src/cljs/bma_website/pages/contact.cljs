(ns bma-website.pages.contact
  (:require [bma-website.parts.misc :as misc]))

(defn html []
  [:div {:class "codrops-bodyBMA"}
   (misc/banner-and-title "./images/site/logos_and_headers/Blue_Moon_Analytics_welcome.jpg" "blue moon analytics home welcome header" "Contact Us Today!")

   [:div {:class "codrops-bodyBMA clearfix"}
    [:div {:class "blockBMA blockBMA-5 blockFloat clearfix"}]
    [:div {:class "blockBMA blockBMA-40 blockFloat clearfix"}
     [:h2 {:style {:text-align "left"}}
      [:span "Use the contact form to:"]]
     [:ul
      [:li
       [:h2 {:style {:text-align "left"}}
        [:span "Schedule an Aerolyze Demo"]]]
      [:li
       [:h2 {:style {:text-align "left"}}
        [:span "Determine Which Modules are Right for Your Business"]]]
      [:li
       [:h2 {:style {:text-align "left"}}
        [:span "General Inquiries"]]]]]

    [:div {:id "contactFormContainer"}
     [:form {:id "contact_form"
             :action ""
             :method "POST"}
      [:input {:type "text" :name "_gotcha" :style {:display "none"}}]

      [:h2 {:class "contactHeader"} "Name: "]
      [:input {:type "text" :class "contactInput" :name "name"}] [:br]

      [:h2 {:class "contactHeader"} "Company: "]
      [:input {:type "text" :class "contactInput" :name "company"}] [:br]

      [:h2 {:class "contactHeader"} "Email: "]
      [:input {:type "text" :class "contactInput" :name "email"}] [:br]

      [:h2 {:class "contactHeader"} "Phone Number (Optional): "]
      [:input {:type "text" :class "contactInput" :name "phone"}] [:br]

      [:h2 {:class "contactHeader"} "Message: "]
      [:textarea {:class "contactInput contactTextArea" :name "message"}] [:br]

      [:button {:type "submit"} "Submit"]]]

    [:div {:class "blockBMA blockBMA-5 clearfix"}]]])
