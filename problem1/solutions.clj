(apply + (filter #(or (zero? (rem % 3)) (zero? (rem % 5))) (range 1000)))

(apply + (filter #(zero? (* (rem % 3) (rem % 5))) (range 1000)))

(defmacro timerun [& body]
 `(time (dotimes [_# 1000] ~@body)))
