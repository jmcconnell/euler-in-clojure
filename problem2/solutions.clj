(defn fib [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else (+ (fib (- n 1)) (fib (- n 2)))))

(def fib-seq ((fn f [i] (lazy-cons (fib i) (f (inc i)))) 0))

(apply + (take-while #(< % 4000000) (filter #(even? %) fib-seq)))
