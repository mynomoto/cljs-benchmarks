(ns cljs-benchmarks.core
  (:require
    [cljs-benchmarks.router :as router]
    [cljs-benchmarks.benchmarks.read-data :as read-data]
    [cljs-benchmarks.benchmarks.write-data :as write-data]
    [cljs-benchmarks.benchmarks.sample-data :as sample-data]
    [cljsjs.benchmark]
    [cljsjs.platform]
    [hoplon.core :as h :refer [defelem case-tpl cond-tpl for-tpl if-tpl when-tpl]]
    [hoplon.jquery]
    [hoplon.spectre-css :as s]
    [javelin.core :as j :refer [cell] :refer-macros [cell= defc defc=]]))

(defonce app-state
  (cell nil))

(defonce router
  (router/init! app-state))

(defn index
  []
  (h/div
    (h/h1 "ClojureScript benchmarks")
    (h/h2
      (h/a :href (router/href :read-data)
      "Read data benchmarks"))
    (h/h2
      (h/a :href (router/href :write-data)
      "Write data benchmarks"))))

(defn show
  [data app-state]
  (let [route (cell= (:route app-state))]
    (h/div
      :id "app"
      (s/columns
        (h/div
          :column 12
          (cond-tpl
            (cell= (= :index (:handler route)))
            (index)

            (cell= (= :read-data (:handler route)))
            (read-data/show data app-state)

            (cell= (= :write-data (:handler route)))
            (write-data/show data app-state)

            :else
            (h/div (h/h1 "Not found"))))))))

(defn reload []
  (js/jQuery
    #(.replaceWith (js/jQuery "#app")
       (show sample-data/data app-state))))

(defn init! []
  (enable-console-print!)
  (reload))
