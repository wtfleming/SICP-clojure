(ns sicp-clojure.test.ch1
  (:use [sicp-clojure.ch1])
  (:use [clojure.test]))

(deftest sum-of-larger-squares-test
  (is (= (sum-of-larger-squares 1 2 3) 13)))

