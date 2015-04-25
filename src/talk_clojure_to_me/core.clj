(ns talk-clojure-to-me.core
  (:gen-class))

;;;;Let's play around with the REPL a bit
;;;;Conditionals
(defn condy
  [x]
  (if (= x 2)
    (println "two")
    (println "sorry dude, you're not two")))


(defn -main
  "Talk Clojure to me"
  [& args]
  (condy 2))
