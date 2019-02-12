(ns bma-website.core
  (:require [bma-website.blog :as blog]))

(defn -main []
  (blog/get-blogs))
