(defmacro timerun [& body]
 `(time (dotimes [_# 1000] ~@body)))
