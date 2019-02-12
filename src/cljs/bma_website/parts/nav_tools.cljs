(ns bma-website.parts.nav-tools
  (:require [reagent.core :as reagent]))


(defn initialize_nav []
  )



(defn open_sub_nav [id]
  (.style.display (.getElementById js/document id) "block"))
