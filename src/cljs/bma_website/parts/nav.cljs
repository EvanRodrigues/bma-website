(ns bma-website.parts.nav
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [bma-website.events :as events]
            [bma-website.subs :as subs]))


;;Figures out if an element is in a collection
(defn in? [el coll]
  (some #(= el %) coll))


;;Builds the bottom layer of the nav when the id == @event_id
(defn nav_bottom [id link_map]
  (let [event_id (re-frame/subscribe [::subs/open])
        links (get link_map :href)
        titles (get link_map :title)
        container [:div {:id id :class "nav_bottom"}]]

    (if (= @event_id id)
      (into container
            (mapv (fn [links titles] [:a {:class "nav_button" :href links} titles]) links titles)))))


;;Creates a link and event for the button's sub-nav
;;@id - The ID of the button
;;@title - The text to be displayed for the button
;;@parent - Determines if button is nesting a sub nav
(defn nav_button [id title info_map]
  (let [link_map (get info_map :link_map)]
    (if (= info_map nil)
      [:a {:id id :class "nav_button"
           :on-click #(re-frame.core/dispatch [::events/show-sub-nav id])} title]
      [:a {:id id :class "nav_button" :style {:position "relative"}
           :on-click #(re-frame.core/dispatch [::events/show-sub-nav id])}
       (nav_bottom (get info_map :id) link_map) title])))


;;Filters out all nav entries that do not contain the event_id
;;If the filter is empty, this sub_nav does not contain the active child_nav
(defn has_child_nav [event_id child_navs]
  (if (empty? (filter #(= (get % :id) event_id) child_navs))
    false
    true))


(defn sub_nav_entry [link_map]
  (let [buttons (get link_map :button)
        links (get link_map :href)
        titles (get link_map :title)
        child_navs (get link_map :child_nav)]

    (mapv #(if (= false %1)
             [:a {:class "nav_button" :href %2} %3]
             (nav_button %1 %3 %4)) buttons links titles child_navs)))


(defn sub_nav [id class link_map]
  (let [event_id (re-frame/subscribe [::subs/open])
        child_navs (get link_map :child_nav)
        container [:div {:id id :class class}]]

    (if (and (= (nil? @event_id) false) (or (= @event_id id) (has_child_nav @event_id child_navs)))
      (into container (sub_nav_entry  link_map)))))


;;Bottom most sub nav from the features button
(def featuresBottom {:id "featuresSub" :link_map {:href  ["#/aerolyze-base"
                                                          "#/risk-module"
                                                          "#/maintenance-module"
                                                          "#/nth-reports"],
                                                  :title ["Advanced Pricing"
                                                          "Risk Module"
                                                          "Maintenance"
                                                          "Custom Reports"]}})

;;Bottom most sub nav from the Pricing / Cost button
(def costBottom {:id "costSub" :link_map {:href  ["#/pay-per-tail"
                                                  "#/subscription-pricing"],
                                          :title ["Pay Per Tail"
                                                  "Subscription"]}})
(defn html []
  [:div {:class "nav_outer_container"}
   [:div {:class "nav_container"}
    [:a {:class "nav_button" :href "#/"} "HOME"]
      (nav_button "aboutOpener" "ABOUT" nil)
      (nav_button "aerolyzeOpener" "AEROLYZE" nil)
    [:a {:class "nav_button" :href "#/advisory"} "ADVISORY"]
      (nav_button "blogOpener" "BLOG" nil)]

   (sub_nav "aboutSub" "nav_sub_container" {:button [false
                                                     false
                                                     false],
                                            :href   ["#/our-story"
                                                     "#/team"
                                                     "#/contact"],
                                            :title  ["Our Story"
                                                     "Team"
                                                     "Contact Us"],
                                            :child_nav [false
                                                        false
                                                        false]})

   (sub_nav "aerolyzeSub" "nav_sub_container" {:button    [false
                                                           "featuresOpener"
                                                           false
                                                           "costOpener"
                                                           false],
                                               :href      ["#/aerolyze-home"
                                                           nil
                                                           "#/aerolyze_blog"
                                                           nil
                                                           "https://app.aerolyze.com"],
                                               :title     ["What is Aerolyze?"
                                                           "Features"
                                                           "Updates"
                                                           "Cost"
                                                           "Login"],
                                               :child_nav [false
                                                           featuresBottom
                                                           false
                                                           costBottom
                                                           false] ;;TODO adjust code in lines 66:70 to pull in added code in 85:88 (costs hover sub menu)
                                               })

   (sub_nav "blogSub" "nav_sub_container" {:button [false false],
                                           :href   ["#/blog" "#/aerolyze_blog" ],
                                           :title  ["General" "Aerolyze Updates"],
                                           :child_nav [false false]})])
