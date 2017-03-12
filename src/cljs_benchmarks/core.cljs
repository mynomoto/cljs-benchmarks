(ns cljs-benchmarks.core
  (:require
    [cljs-benchmarks.router :as router]
    [cljs-benchmarks.benchmarks.parse-data :as parse-data]
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
  [data app-state]
  (h/div
    (h/h1 "ClojureScript benchmarks")
    (h/h2
      (h/a :href (router/href :parse-data)
      "Parse data benchmarks"))))

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
            (index data app-state)

            (cell= (= :parse-data (:handler route)))
            (parse-data/show data app-state)

            :else
            (h/div (h/h1 "Not found"))))))))

(defn reload []
  (js/jQuery
    #(.replaceWith (js/jQuery "#app")
       (show sample-data/data app-state))))

(defn init! []
  (enable-console-print!)
  (reload))
