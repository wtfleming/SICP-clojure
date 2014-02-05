(ns sicp-clojure.ch1)

;;; Exercise 1.2
(/
  (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
  (* 3 (- 6 2) (- 2 7)))
; -37/150

;;; Exercise 1.3
(defn square [x] (* x x))

(defn largest-two [a b c]
  (take 2 (sort > [a b c])))

(defn sum-of-larger-squares
  "Returns the sum of the squares of the two larger numbers"
  [a b c]
  (let [[aa bb] (largest-two a b c)]
    (+ (square aa) (square bb))))

