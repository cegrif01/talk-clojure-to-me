(ns talk-clojure-to-me.core
  (:gen-class))

;;;;Let's play around with the REPL a bit
;;;;Conditionals

;;if statement will perform and return the first block if it's true and the second block if false
;;
(defn simple-if-example
  [x]
  (if (= x 2)
    (println "two")
    (println "sorry dude, you're not two")))

;;combining if and do will allow for multiple lines to be executed at once
(defn magic
  []
  (if true
    (do (println "Success!")
        "abra cadabra")
    (do (println "Failure :(")
        "hocus pocus")))

;;"when" is a macro will combine if and true
;; we will talk about that later
(defn combine-if-and-true-with-when
  []
  (when true
  (println "Success!")
  "abra cadabra"))

;;cond is another macro
;;using cond we can create an if/else-if/else block
(defn convert [data]
  (cond
    (nil? data)
      "null"
    (string? data)
      (str "\"" data "\"")
    (keyword? data)
      (convert (name data))
    :else
      (str data)))

;;the convert function above was great, but polymorphism is better
;;
(defmulti convert-using-polymorphism class)

  (defmethod convert-using-polymorphism clojure.lang.Keyword [data]
    (convert-using-polymorphism (name data)))

  (defmethod convert-using-polymorphism java.lang.String [data]
    (str "\"" data "\""))

  (defmethod convert-using-polymorphism nil [data]
    "null")

  (defmethod convert-using-polymorphism :default [data]
    (str data))

  ;;this one can be added dynamically without altering the original function
  (defmethod convert-using-polymorphism clojure.lang.PersistentVector [data]
    (str "[" (clojure.string/join ", " (map convert data)) "]"))


(defn -main
  "Talk Clojure to me"
  [& args]
  (simple-if-example 2)
  (println (magic))
  (println (combine-if-and-true-with-when)))
