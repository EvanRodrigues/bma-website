(ns bma-website.views
  (:require [re-frame.core :as re-frame]
            [reagent.core :as reagent]
            [bma-website.events :as events]
            [bma-website.subs :as subs]
            [clojure.string :as str]

            [bma-website.parts.nav :as nav]
            [bma-website.parts.mobile-nav :as mobile-nav]
            [bma-website.parts.footer :as footer]
            [bma-website.parts.blog-template :as blog]

            [bma-website.pages.home :as home]
            [bma-website.pages.custom-modules :as custom-modules]
            [bma-website.pages.our-story :as our-story]
            [bma-website.pages.team :as team]
            [bma-website.pages.terms-of-service :as terms-of-service]
            [bma-website.pages.privacy-policy :as privacy-policy]
            [bma-website.pages.aerolyze-base-features :as aerolyze-base]
            [bma-website.pages.aerolyze-home :as aerolyze-home]
            [bma-website.pages.aerolyze-maintenance-module :as maintenance-module]
            [bma-website.pages.aerolyze-pay-per-tail :as pay-per-tail]
            [bma-website.pages.aerolyze-subscription-pricing :as subscription-pricing]
            [bma-website.pages.aerolyze-risk-module :as risk-module]
            [bma-website.pages.advisory :as advisory]
            [bma-website.pages.nth-reports :as nth-reports]
            [bma-website.pages.contact :as contact]))

(def blog-pages-directory "./src/cljs/bma_website/blog_pages")

(defn home []
  [:div {:id "container"} 
   (nav/html)
   
   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (home/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn custom-modules []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (custom-modules/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn our-story []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (our-story/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn team []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (team/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn aerolyze-base []
  [:div {:class "container"}
   (nav/html)
   
   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (aerolyze-base/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn aerolyze-home []
  [:div {:class "container"}
   (nav/html)
   
   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (aerolyze-home/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn maintenance-module []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (maintenance-module/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn pay-per-tail []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (pay-per-tail/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn subscription-pricing []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (subscription-pricing/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn risk-module []
  [:div {:class "container"}
   (nav/html)
   
   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (risk-module/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn contact []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (contact/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn advisory []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (advisory/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])


(defn blog []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (blog/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn terms-of-service []
  [:footerdiv {:class "container"}
   
   (nav/html)
   

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (terms-of-service/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])

(defn privacy-policy []
  [:footerdiv {:class "container"}
   
   (nav/html)
   

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (privacy-policy/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])


(defn nth-reports []
  [:div {:class "container"}
   (nav/html)

   [:div {:class "main-content-container"
          :on-click #(re-frame.core/dispatch [::events/close-nav "close-nav"])}
    (nth-reports/html)
    (footer/html)
    (footer/copyright)]

   (mobile-nav/html)])


;; list of available panels
(defn- panels [panel-name]
  (case panel-name
    :home                 [home]
    :custom-modules       [custom-modules]
    :our-story            [our-story]
    :home-panel           [home]
    :team                 [team]
    :aerolyze-base        [aerolyze-base]
    :aerolyze-home        [aerolyze-home]
    :maintenance-module   [maintenance-module]
    :subscription-pricing [subscription-pricing]
    :pay-per-tail         [pay-per-tail]
    :risk-module          [risk-module]
    :contact              [contact]
    :advisory             [advisory]
    :blog                 [blog]
    :terms-of-service     [terms-of-service]
    :privacy-policy       [privacy-policy]
    :nth-reports          [nth-reports]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))

