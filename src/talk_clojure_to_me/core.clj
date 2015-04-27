(ns talk-clojure-to-me.core
  (:gen-class))

;;;;Let's play around with the REPL a bit
;;;;Conditionals
(defn condy
  [x]
  (if (= x 2)
    (println "two")
    (println "sorry dude, you're not two")))

;;;vectors

;;;store a vector in a variable
(def my-list [1 2 3])

;;;add an element to a vector




(defn -main
  "Talk Clojure to me"
  [& args]
  (println my-list))
