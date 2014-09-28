(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
  (reduce concat '() a-seq))

(defn str-cat [a-seq]
  (if (empty? a-seq)
    ""
    (reduce #(str %1 " " %2) a-seq)))

(defn my-interpose [x a-seq]
  (if (empty? a-seq)
    '()
    (seq (reduce #(conj %1 x %2) [(first a-seq)] (rest a-seq)))))

(defn my-count [a-seq]
  (let [helper (fn [counter elem]
                 (inc counter))]
    (reduce helper 0 a-seq)))

(defn my-reverse [a-seq]
  (let [helper (fn [new-seq elem]
                 (conj new-seq elem))]
    (reduce helper '() a-seq)))

(defn min-max-element [a-seq]
  (let [helper (fn [res elem])
        ]))

(defn insert [sorted-seq n]
  [:-])

(defn insertion-sort [a-seq]
  [:-])

(defn parity [a-seq]
  [:-])

(defn minus [x]
  :-)

(defn count-params [x]
  :-)

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
