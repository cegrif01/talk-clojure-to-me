(ns talk-clojure-to-me.core
  (:gen-class))

;;;;Let's play around with the REPL a bit
;;;;Conditionals with function
(defn condy
  [x]
  (if (= x 2)
    "two"
    "sorry dude, you're not two"))


(defn -main
  "Talk Clojure to me"
  [& args]
  ;;storing variables
  (def store-condy (condy 2))
  (println store-condy))
