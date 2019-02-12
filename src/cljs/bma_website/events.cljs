(ns bma-website.events
  (:require [re-frame.core :as re-frame]
            [bma-website.db :as db]
            [clojure.string :as string]))


(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::set-active-panel
 (fn [db [_ active-panel]]
   (assoc db :active-panel active-panel)))

;;Takes the id of the button and returns the id of the sub-nav to be displayed
(re-frame/reg-event-fx
 ::show-sub-nav
 (fn [db [_ id]]
   (let [page (string/split id #"Opener")]
     (assoc-in db [:db :open] (str (first page) "Sub")))))

;;Sets show-mobile-nav key to true in db
(re-frame/reg-event-fx
 ::show-mobile-nav
 (fn [db [_ id]]
   (assoc-in db [:db :show-mobile-nav] true)))

;;Closes either the mobile nav or the standard nav
(re-frame/reg-event-fx
 ::close-nav
 (fn [db [_ id]]
   (let [events (get db :db)]
     (if (= (get events :show-mobile-nav) true)
       (assoc db :db (dissoc events :show-mobile-nav))
       (assoc db :db (dissoc events :open))))))

;;Lets the blog know which page to display
(re-frame/reg-event-fx
 ::blog-page
 (fn [db [_ id]]
   (let [events (get db :db)]
     (if (= id -1)
       (assoc db :db (dissoc events :blog-page))
       (assoc-in db [:db :blog-page] id)))))


;;Lets the blog know which blog to display
(re-frame/reg-event-fx
 ::blog-type
 (fn [db [_ id]]
   (let [events (get db :db)]
     (assoc-in db [:db :blog-type] id))))
