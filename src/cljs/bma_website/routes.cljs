(ns bma-website.routes
  (:require-macros [secretary.core :refer [defroute]])
  (:import goog.History)
  (:require [secretary.core :as secretary]
            [goog.events :as gevents]
            [goog.history.EventType :as EventType]
            [re-frame.core :as re-frame]
            [bma-website.events :as events]
            [bma-website.blog-info.bma-vector :as bma-vector]
            [bma-website.blog-info.aerolyze-vector :as aerolyze-vector]))

(defn hook-browser-navigation! []
  (doto (History.)
    (gevents/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))


;;Applies the defroute function to every element in the info vector
;;doall is necessary because apply will only apply the defroute function to the 1st element.
(defn route-blog-pages [info path type]
  (doall (mapv #(defroute (str path (get % :path)) []
                  (re-frame/dispatch [::events/set-active-panel :blog])
                  (re-frame/dispatch [::events/close-nav "close-navigate"])
                  (re-frame/dispatch [::events/blog-type type])
                  (re-frame/dispatch [::events/blog-page (.indexOf info %)])) info)))


(defn app-routes []
  (secretary/set-config! :prefix "#")
  ;; --------------------
  ;; define routes here
  (defroute "/" []
    (re-frame/dispatch [::events/set-active-panel :home])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/custom-modules" []
    (re-frame/dispatch [::events/set-active-panel :custom-modules])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/our-story" []
    (re-frame/dispatch [::events/set-active-panel :our-story])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/team" []
    (re-frame/dispatch [::events/set-active-panel :team])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/aerolyze-base" []
    (re-frame/dispatch [::events/set-active-panel :aerolyze-base])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/aerolyze-home" []
    (re-frame/dispatch [::events/set-active-panel :aerolyze-home])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/maintenance-module" []
    (re-frame/dispatch [::events/set-active-panel :maintenance-module])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/advisory" []
    (re-frame/dispatch [::events/set-active-panel :advisory])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/nth-reports" []
    (re-frame/dispatch [::events/set-active-panel :nth-reports])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/pay-per-tail" []
    (re-frame/dispatch [::events/set-active-panel :pay-per-tail])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/subscription-pricing" []
    (re-frame/dispatch [::events/set-active-panel :subscription-pricing])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/risk-module" []
    (re-frame/dispatch [::events/set-active-panel :risk-module])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/contact" []
    (re-frame/dispatch [::events/set-active-panel :contact])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/blog" []
    (re-frame/dispatch [::events/set-active-panel :blog])
    (re-frame/dispatch [::events/close-nav "close-nav"])
    (re-frame/dispatch [::events/blog-page -1])
    (re-frame/dispatch [::events/blog-type "blog"]))

  (defroute "/aerolyze_blog" []
    (re-frame/dispatch [::events/set-active-panel :blog])
    (re-frame/dispatch [::events/close-nav "close-nav"])
    (re-frame/dispatch [::events/blog-page -1])
    (re-frame/dispatch [::events/blog-type "aerolyze_blog"]))

  (defroute "/terms-of-service" []
    (re-frame/dispatch [::events/set-active-panel :terms-of-service])
    (re-frame/dispatch [::events/close-nav "close-nav"]))

  (defroute "/privacy-policy" []
    (re-frame/dispatch [::events/set-active-panel :privacy-policy])
    (re-frame/dispatch [::events/close-nav "close-nav"]))



  (route-blog-pages bma-vector/info "/blog" "blog")
  (route-blog-pages aerolyze-vector/info "/aerolyze_blog" "aerolyze_blog")

  ;; --------------------
  (hook-browser-navigation!))
