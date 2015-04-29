(ns talk-clojure-to-me.core
  (:gen-class))


(defn -main
  "Talk Clojure to me"
  [& args]

  (def ima-list '(1 2 3))

  (def ima-vector [1 2 3])

  (def ima-set (set [1 2 3 2 1 2 3]))

  (def ima-map {:a "map me" :b 2})


  ;;working with lists
  ;;Lists are similar to vectors in that they're linear collections of values.
  ;;There are some differences, though. You can't retrieve list elements with get:
  (println (get ima-list 0))  ;;this does not work on lists
  (println (conj ima-list 4)) ;;will add 4 to the beginning of the list
  (println ima-list)          ;;my-list won't get modified

  (println (get ima-vector 0))  ;;returns first element which is 1
  (println (ima-vector 0))      ;;you don't need to use get for a vector
  (println (conj ima-vector 4)) ;; will add 4 at the end of the vector
  (println ima-vector)          ;;ima-vector never gets mutated

  (println (get ima-map :a))  ;; returns the first element of the map
  (println (ima-map :a))      ;; you can also grab elements from a map like this because maps are functions

  ;;assoc is how you add elements to a map
  (println (assoc ima-map :z "this is how you add another key value pair"))
  (println (assoc ima-map :z "this is how you add another key value pair" :y "adding two elements"))

  ;;using get with sets works a little different
  ;;instead of passing in the index as a 2nd parameter
  ;;it will return that number if it exists in the set
  (println (get ima-set 2))
  (println (ima-set 2))

  )
