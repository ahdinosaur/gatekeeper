(defproject gatekeeper "0.1.0-SNAPSHOT"
  :description "entering the cooperative web."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.clojure/data.json "0.1.2"]
                 [noir "1.3.0-beta3"]
                 [clj-http "0.4.2"]
                 [cheshire "4.0.0"]
                 [jayq "0.1.0-alpha4"]
                 [crate "0.2.0-alpha3"]
                 [fetch "0.1.0-alpha2"]]
  :plugins [[lein-cljsbuild "0.2.1"]]
  :cljsbuild {
              :builds [{
                        ; The path to the top-level ClojureScript source directory:
                        :source-path "src-cljs"
                        ; The standard ClojureScript compiler options:
                        ; (See the ClojureScript compiler documentation for details.)
                        :compiler {
                                   :output-to "resources/public/js/main.js" ; default: main.js in current directory
                                   :optimizations :simple
                                   :pretty-print true}}]}
  :main gatekeeper.server ) ;; please keep the space after the class name
