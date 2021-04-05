(ns calc.main)

(import com.hp.creals.CR)
(import com.android.calculator2.evaluation.UnifiedReal)
(defn -main
  [& args]
  (def one (CR/valueOf "1" 10))
  (def urOne (new UnifiedReal one))
  (def urTwo (.add urOne urOne))
  (println (.toNiceString urTwo)))