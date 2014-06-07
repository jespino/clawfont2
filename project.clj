(defproject clawfont "0.1.0-SNAPSHOT"
  :description "From svg files font generator"
  :url "http://github.com/jespino/clawfont2"
  :license {:name "BSD"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot clawfont.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
