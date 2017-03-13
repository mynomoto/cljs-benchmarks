(ns cljs-benchmarks.router
  (:require
    [benefactor.route]))

(def routes
  ["" [["" :index]
       ["/"
        [["" :index]
         ["read-data" :read-data]
         ["write-data" :write-data]
         [true :not-found]]]]])

(defn update-route
  "Save route on db"
  [app-state [path route]]
  (swap! app-state assoc :path path :route route))

(defn href
  ([route-name] (href route-name nil))
  ([route-name params] (benefactor.route/path->hash (benefactor.route/route->path routes route-name params))))

(defn init!
  "Initialize route listening."
  [app-state]
  (benefactor.route/setup-router
    routes
    #(when (not= (:path app-state) (first %)) (update-route app-state %))
    #(console.log [:route-not-found (benefactor.route/path->hash %)])))
