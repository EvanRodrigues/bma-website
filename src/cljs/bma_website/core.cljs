(ns bma-website.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [bma-website.events :as events]
            [bma-website.routes :as routes]
            [bma-website.views :as views]
            [bma-website.config :as config]
            [bma-website.parts.nav :as nav]))



(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "body-container-all")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
