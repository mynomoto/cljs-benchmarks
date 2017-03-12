(task-options!
  pom {:project     'cljs-benchmarks
       :version     "0.0.1"
       :description "ClojureScript benchmarks"
       :license     {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})

(set-env!
  :dependencies '[[org.clojure/clojure "1.9.0-alpha14" :scope "compile"]

                  ;; Clojurescript
                  [adzerk/boot-cljs "1.7.228-2" :scope "compile"]
                  [org.clojure/clojurescript "1.9.473" :scope "compile"]

                  ;; Auto reload
                  [adzerk/boot-reload "0.5.1" :scope "compile"]

                  ;; Serve static contents
                  [tailrecursion/boot-static "0.1.0" :scope "compile"]

                  ;; Hoplon
                  [hoplon "6.0.0-alpha17" :scope "compile"]
                  [hoplon/javelin "3.9.0" :scope "compile"]
                  [mynomoto/hoplon-spectre.css "0.1.32-0" :scope "compile"]

                  ;; Better devtools for Clojurescript
                  [binaryage/devtools "0.9.1" :scope "compile"]
                  [binaryage/dirac "1.1.5" :scope "compile"]
                  [powerlaces/boot-cljs-devtools "0.2.0" :scope "compile"]

                  ;; Utils
                  [benefactor "0.0.1-SNAPSHOT"]

                  ;; Serialization
                  [com.cognitect/transit-cljs "0.8.239"]

                  ;; Pprint
                  [fipp "0.6.8"]

                  ;; Benchmark
                  [cljsjs/benchmark "2.1.0-2"]]
  :source-paths #{"src"}
  :asset-paths #{"assets"})

(require
  '[adzerk.boot-cljs :refer [cljs]]
  '[adzerk.boot-reload :refer [reload]]
  '[tailrecursion.boot-static :refer [serve]]
  '[powerlaces.boot-cljs-devtools :refer [cljs-devtools dirac]])

(deftask dev
  []
  "Build cljs-benchmarks for development."
  (comp
    (sift :add-jar {'mynomoto/hoplon-spectre.css #"spectre\.min\.css"})
    (watch)
    (speak)
    (cljs-devtools)
    (dirac)
    (reload :on-jsload 'cljs-benchmarks.core/reload)
    (cljs
      :optimizations :none
      :compiler-options {:parallel-build true})
    (serve :port 8000)))

(deftask prod
  "Build cljs-benchmarks for production deployment."
  []
  (comp
    (sift :add-jar {'mynomoto/hoplon-spectre.css #"spectre\.min\.css"})
    (cljs
      :optimizations :advanced
      :compiler-options {:parallel-build true
                         :closure-defines {'goog.DEBUG false}})
    (sift :include #{#"\.out"} :invert true)
    (target :dir #{"target"})))
