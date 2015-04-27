(ns talk-clojure-to-me.core
  (:gen-class))


;;double-everything is a function that we came up with
;;map is a standard clojure function
(defn double-everything
  [some-list-or-vector]
  (map #(* % 2) some-list-or-vector))

(defn multiply-together
  [some-list-or-vector]
  (apply * some-list-or-vector))

(defn -main
  "Talk Clojure to me"
  [& args]
  (def my-list '(2 4 6))
  (println (double-everything my-list))


  (println (multiply-together my-list))

  )
