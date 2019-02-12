(ns bma-website.subs
  (:require [re-frame.core :as re-frame]))


(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 ::active-panel
 (fn [db _]
   (:active-panel db)))

(re-frame/reg-sub
 ::open 
 (fn [db _]
   (:open db)))

(re-frame/reg-sub
 ::show-mobile-nav
 (fn [db _]
   (:show-mobile-nav db)))

(re-frame/reg-sub
 ::blog-page
 (fn [db _]
   (:blog-page db)))

(re-frame/reg-sub
 ::blog-type
 (fn [db _]
   (:blog-type db)))
