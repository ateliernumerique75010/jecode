(defproject
  jecode "0.0.7"
  :url "http://github.com/bzg/jecode"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :repo "https://github.com/bzg/jecode"}
  :dependencies
  [[org.clojure/clojure "1.6.0"]
   [lib-noir "0.8.8"]
   [domina "1.0.2"]
   [hiccup "1.0.5"]
   [simple-time "0.1.1"]
   [compojure "1.1.9"]
   [prismatic/schema "0.2.6"]
   [clojurewerkz/scrypt "1.2.0"]
   [http-kit "2.1.19"]
   [org.clojure/clojurescript "0.0-2322"]
   [net.drib/blade "0.1.0"]
   [friend-oauth2 "0.1.1"]
   [com.cemerick/friend "0.2.1"
    :exclusions [org.apache.httpcomponents/httpclient org.clojure/core.cache]]
   [com.taoensso/carmine "2.7.0"]
   [shoreleave/shoreleave-remote-ring "0.3.0"]
   [shoreleave/shoreleave-remote "0.3.0"]
   [com.draines/postal "1.11.1"]
   [digest "1.4.4"]
   [enlive "1.1.5"]
   [clj-rss "0.1.9"]
   [clj-http "1.0.0"]
   [cheshire "5.3.1"]
   [markdown-clj "0.9.47"]
   [clojurewerkz/elastisch "2.0.0-beta4"]]
  :main jecode.handler
  :description "jecode.org"
  :min-lein-version "2.0.0"
  :plugins
  [[lein-cljsbuild "0.3.2"]]
  :cljsbuild {:builds
              [{:source-paths ["src/cljs/showinit"]
                :compiler
                {:output-to "resources/public/js/showinits.js"
                 :optimizations :whitespace
                 :pretty-print false}}
               {:source-paths ["src/cljs/showevent"]
                :compiler
                {:output-to "resources/public/js/showevents.js"
                 :optimizations :whitespace
                 :pretty-print false}}
               {:source-paths ["src/cljs/validate_email"]
                :compiler
                {:output-to "resources/public/js/validate_email.js"
                 :optimizations :whitespace
                 :pretty-print false}}
               {:source-paths ["src/cljs/validate_event_init"]
                :compiler
                {:output-to "resources/public/js/validate_event_init.js"
                 :optimizations :whitespace
                 :pretty-print false}}
               ]})
