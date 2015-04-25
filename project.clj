(defproject talk-clojure-to-me "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot talk-clojure-to-me.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
