(ns talk-clojure-to-me.core
  (:gen-class))


;;double-everything is a function that we came up with
;;map is a standard clojure function
(defn double-everything
  [some-list-or-vector]
  (map #(* % 2) some-list-or-vector))

;;Using the apply function
(defn multiply-together
  [some-list-or-vector]
  (apply * some-list-or-vector))

;;this function combines a few concepts.  Let's break
;;this one down
(defn let-there-be-magic
  [vec1 vec2]
  (let [doubled-vec    (double-everything vec1)
        multiplied-vec (multiply-together vec2)]

    (if (< (reduce + doubled-vec) multiplied-vec)
      vec1
      vec2)))


(defn -main
  "Talk Clojure to me"
  [& args]
  (def my-list '(2 4 6))
  (println (double-everything my-list))


  (println (multiply-together my-list))

  ;;calling map on more than one element will combine them
  (println (map str ["a" "b" "c"] ["A" "B" "C"] ["d" "e" "z"]))

  ;;prepends 1 to the beginning of the list
  (println (cons 1 '(2 3 4)))


  ;;Returns a new seq where x is the first element and seq is the rest.
  ;;notice that the first item is not expanded
  (println (cons [2 3 4] [1 2]))

  ;;conj will add an integer to the end
  (println (conj [1 2 3] 2))

  ;;conj will add an integer to end of a vector
  (println (conj [1 2 3] 2))

  ;;conj will add an integer to beginning of a list
  (println (conj '(1 2 3) 2))

  ;;will return a new list with all elements except the first
  (println (rest '(3 5 7)))

  ;;let allows you to store local variables
   (println (let-there-be-magic [2 4 6] [3 4 5]))
;;  (let-there-be-magic [2 4 6] [3 4 5])
  )
