(ns bma-website.parts.mobile-nav
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [bma-website.events :as events]
            [bma-website.subs :as subs]))


;;Creates a row of links for the mobile nav.
;;Utilizes nested anonymous functions to cycle through the info_vect
;;This allows the function to go through each map contained in the info_vect
(defn nav_row [info_vect]
  (let [container [:div {:class "mobile_nav_row"}]]

    (into container (mapv
                     (fn [info_vect] [:a {:href (get info_vect :link)}
                                      [:div {:class "icon_button_container"}
                                       [:span {:class (str "icon icon-" (get info_vect :icon))} [:br] (get info_vect :title) ]]]) info_vect))))


;;Displays the mobile nav if the screen width is small enough.
;;Calls nav_row to fill each row of the nav
(defn inner_nav []
  (let [show_mobile_nav (re-frame/subscribe [::subs/show-mobile-nav])]
    (if (= @show_mobile_nav true)
      [:div {:class "mobile_nav_container"}
       (nav_row [{:icon "shop", :link "#/", :title "HOME"}
                 {:icon "paperplane", :link "#/aerolyze-home", :title "AEROLYZE"}
                 {:icon "user", :link "#/team", :title "TEAM"}
                 {:icon "search", :link "#our-story", :title "STORY"}])

       (nav_row [{:icon "tag", :link "#/pay-per-tail", :title "PAY PER TAIL"}
                 {:icon "data", :link "#/advisory", :title "ADVISORY"}
                 {:icon "banknote", :link "#/subscription-pricing", :title "SUBSCRIPTION"}
                 {:icon "mail", :link "#contact", :title "CONTACT"}])

       (nav_row [{:icon "cloud", :link "#/aerolyze-base", :title "BASE"}
                 {:icon "params", :link "#/risk-module", :title "RISK"}
                 {:icon "settings", :link "#/maintenance-module", :title "MX"}
                 {:icon "star", :link "#custom-modules", :title "CUSTOM"}])

       (nav_row [{:icon "", :link "#/", :title ""}
                 {:icon "news", :link "#/aerolyze_blog", :title "UPDATES"}
                 {:icon "megaphone", :link "#/blog", :title "BLOG"}
                 {:icon "", :link "#/", :title ""}])])))


(defn html []
  (let [show_mobile_nav (re-frame/subscribe [::subs/show-mobile-nav])
        event (reagent/atom [::events/show-mobile-nav "show-mobile-nav"])
        icon (reagent/atom "OPEN MENU")
        bottom (reagent/atom "0")]
    (if (= @show_mobile_nav true)
      (do
        (reset! event [::events/close-nav "close-navigate"])
        (reset! bottom "215px")
        ;; (reset! icon [:img {:src "./images/site/logos_and_headers/Aerolyze-icon-logo-main.jpg" :alt "CLOSE MENU"}]) TODO make image logo clear and re-size to fit in both open and closed mobile menus
        (reset! icon "CLOSE MENU")))
    [:div {:id "mobile_nav_outer_container" :style {:bottom @bottom}}
     [:a {:on-click #(re-frame.core/dispatch @event)} [:div {:class "mobile_button_container"} @icon]];;This will be an icon not text.


     (inner_nav)]))
