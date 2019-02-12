(ns bma-website.parts.misc)

;; Adds the banner image and title of the page
;; TODO: add an alt field to function
(defn banner-and-title [banner alt title]
  [:header {:class "codrops-header"
            :style {:border-bottom "2px solid #316bad"}}
   [:img {:src banner :alt alt :style {:cursor "default" :width "100%" :border-bottom "2px solid #316bad"}
          }]
   [:br]
   [:h1 title]])



;; Adds the executive demo and links surrounding the vimeo player
;; How do I allow full screen in hiccup?
(defn video-player [url]
  [:iframe {:src url
            :width "640"
            :height "360"
            :style {:margin "0 auto" :display "block" :text-align "center"}}])

;; Links and info to be placed under the player
(defn video-links [url video_id title user_id user video_host]
[:p {:id "videoInfo" :style {:margin "0 auto" :display "block" :text-align "center"}}
 [:a {:href (str url video_id)} title]
 " from "
 [:a {:href (str url user_id)} user]
 " on "
 [:a {:href url} video_host] "."])

