(defproject clawfont "0.1.0-SNAPSHOT"
  :description "From svg files font generator"
  :url "http://github.com/jespino/clawfont2"
  :license {:name "BSD"}
  :dependencies [[org.clojure/clojure "1.5.1"] [org.clojure/tools.cli "0.3.1"] [clojure-ini "0.0.2"]]
  :main ^:skip-aot clawfont.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
