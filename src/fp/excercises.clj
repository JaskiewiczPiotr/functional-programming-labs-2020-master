(ns fp.excercises)

; Exercises:
; 1. Write a program that asks the user for their name and greets them with
; their name.

(defn greet-me []
  (str "Hello, " (read-line))
  )
(greet-me)


(defn add []
  (str "give me a value, " (def z (read-line))
       (print "your value is, " z)
  ))
(add)

(let [name (do (println "what is your name? ")(read-line))]
  ((println "your name is" name))
  (defn function []

    )
  )


(defn validateRow [row]
  ; (println (reduce + row))
  ; (println (val (apply max-key val freq)))
  ; (println (frequencies row))
  (if (and (= 1 (val (apply max-key val (frequencies row)))) (= 45 (reduce + row))) true false)
  )

(defn validSolution [sudoku]
  ; (println ((sudoku 5) 1))

  ; row
  (println (validateRow (sudoku 0)))

  ; column
  (def transposed (apply mapv vector sudoku))
  (validateRow (transposed 0))

  ; sub-grid
  (def subGrid1 (vec (flatten [(subvec (sudoku 0) 0 3) (subvec (sudoku 1) 0 3) (subvec (sudoku 2) 0 3)])))
  (validateRow subGrid1)
  )

(def sud
  [
   [5, 3, 4, 6, 7, 8, 9, 1, 2],
   [6, 7, 2, 1, 9, 5, 3, 4, 8],
   [1, 9, 8, 3, 4, 2, 5, 6, 7],
   [8, 5, 9, 7, 6, 1, 4, 2, 3],
   [4, 2, 6, 8, 5, 3, 7, 9, 1],
   [7, 1, 3, 9, 2, 4, 8, 5, 6],
   [9, 6, 1, 5, 3, 7, 2, 8, 4],
   [2, 8, 7, 4, 1, 9, 6, 3, 5],
   [3, 4, 5, 2, 8, 6, 1, 7, 9]
   ]
  )

; (println sud)

(validSolution sud)


(defn foo [a b c])

;;;;;
(defn Example [] (println "give a first value")
(def x (eval(read)))
(println "your number is, " x)
(println "give a second value")
(def y (eval(read)))
(println "your number is, " y)
(println "the sum is equals to , "(+ x y))
)

(Example)
;;;;;;;;;;;;;;;;;;

(def x '(+ 2 3))
(println x)
(println(eval x))


(let [num1 (do (println "What's first?") (Integer/parseInt (read-line)))
      num2 (do (println "What's sec?") (Integer/parseInt (read-line)))]
  (println (+ num1 num2)))

(let [x 1]
  x)


(def my-val 5)
my-val


(flatten (vector[1 2 [8 9 22 54] 3]4))


(+ 1 2 3 4 5)

(map vector ["a" "b" "c"] [1 2 3])

(read-line)

;(def x (+ (read) (read)))
(println "which kind of operation do you want ? ")
(def z (read))


;(println x)
(println (eval x))



(defn greet-me2 [] []
  (str "hello, "(read-line)(read-line)))

; 2. Write a program that asks the user for a number n and prints the sum of
; the numbers 1 to n.

1. (read-string (read-line))
2. (doc range)

(map (fn [x] (+ x 1)) [1 2 3 4 5 6 7 8])
(filter even? [1 2 3 4 5 6 7 8 9])
(filter (fn [x] (= (rem x 2) 0)) [1 2 3 4 5 6 7 8 9])
(reduce (fn [acc x] (+ acc x)) [1 2 3 4 5 6 7])
(reduce + (take (read-string (read-line)) (range)))

(defn sum-1-to-5 []
  (reduce + (range (read-string (read-line)))))
(sum-1-to-5)

(defn Sum [] (println "give me a value")
  (read(vector))
  (reduce +[vector])
  )
(Sum)

(loop [x 10]
  (when (> x 1)
    ;(println x)
    ;(conj[]x)
    (println def [] (conj[] x))
    (println [x])
    (recur(- x 2))))

(conj []1)

(vector(z))
(println z)

; 3. Modify the previous program such that only multiples of three or five are
; considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17

(defn is-div-3-or-5? [n]
  (or (= (rem n 3) 0) (= (rem n 5) 0)))

(defn sum-1-to-5 []
  (let [n (read-string (read-line))]
    (reduce + (filter is-div-3-or-5? (range 1 (inc n))))))

; 4. Write a program that asks the user for a number n and gives them the
; possibility to choose between computing the sum and computing the product of 1,…,n.

(let [n (read-string (read-line))
      choice (read-line)]
  (case choice
    "sum" (reduce + (range (inc n)))
    "product" (reduce * 1 (range 1 (inc n)))
    (println "Invalid choice")))

; 5. Write a program that prints a multiplication table for numbers up to 12.

(for [x (range 1 13) y (range 1 13)] (str x " * " y " = " (* x y)))

; 6. Write a function that combines two lists by alternatingly taking elements,
; e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

(flatten (map vector [1 2 3] [4 5 6]))

(apply concat [1 2 [3 4 '(5 6) 7 '([8]) 9]])

(doc flatten)
(doc find-doc)
(apropos "flat")
(find-doc "flat")
(doc apropos)

(use 'clojure.repl)

; 7. Write a function that computes the list of the first 100 Fibonacci numbers.
; The first two Fibonacci numbers are 1 and 1. The n+1-st Fibonacci number can
; be computed by adding the n-th and the n-1-th Fibonacci number. The first
; few are therefore 1, 1, 1+1=2, 1+2=3, 2+3=5, 3+5=8.

; fibonacci = 1 1 2 3 5 8 13 21 ...
; fib(0) = 1
; fib(1) = 1
; fib(N) = fib(N-1) + fib(N-2)

(defn fib [n]
  (case n
  0 1
  1 1
  (+ (fib (- n 1)) (fib (- n 2)))))

(fib 15)





(defn fib [n] 777)

; Alt + Shift + P = wyslij wyrazenie pod kursorem
; Alt + Shift + L = wyslij caly plik

(defn fib-step [[a b]]
  [b (+' a b)])

; (fib-step [5 8]) ; => 8 13

(defn myfun [[x y]]
  [y (-' x y )])

(defn mufun1 [[x y z]]
  (+' x y z))




(defn fib-seq []
  (map first (iterate fib-step [1 1])))

(take 100 (fib-seq))

(defn fib [n]
  (case n
    0 1
    1 1
    (+ (fib (- n 1)) (fib (- n 2)))))

(fib 50)

; 8. Write a function that tests whether a string is a palindrome.

; 9. Calculate next 10 leap years.


(defn leap
  [year]
  (cond (zero? (mod year 400)) year
        (zero? (mod year 100)) nil
        (zero? (mod year 4)) year
        :default nil))

(defn next-10-leap-year []
  (take 10 (remove nil? (map leap (iterate inc 2020)))))

(next-10-leap-year)

(defn greet-me []
  (println (str "Hello " (read-line))))

(defn sum-1-to-n [n]
  (reduce (fn [acc x] (+ acc x)) (range (inc n))))

(defn div-3-or-5? [n]
  (or (= (rem n 3) 0) (= (rem n 5) 0)))

(defn sum-1-to-n-div-by-3-or-5 [n]
  (reduce (fn [acc x] (+ acc x)) (filter div-3-or-5? (range (inc n)))))

(defn mult-1-to-n [n]
  (reduce (fn [acc x] (* acc x)) (range 1 (inc n))))

(defn sum-or-prod []
  (let [n      (read-string (read-line))
        choice (read-string (read-line))]
    (if (= choice 1)
      (sum-1-to-n n)
      (mult-1-to-n n))))

(defn mult-table-12 []
  (partition 12 (for [x (range 1 13) y (range 1 13)] (* x y))))

(defn mult-table-12* []
  (for [x (range 1 13)]
    (for [y (range 1 13)] (* x y))))

(mult-table-12*)

(defn combine-two-lists [l1 l2]
  (flatten (for [i (range (count l1))] [(nth l1 i) (nth l2 i)])))

(def fib
  (memoize
    (fn [n]
      (if (< n 2)
        1
        (+ (fib (dec n)) (fib (- n 2)))))))

(defn fib-100 []
  (map fib (range 100)))

(defn fib-100* []
  (let [fib (fn [[a b]] [b (+ a b)])]
    (take 100 (map first (iterate fib [1 1])))))

; Write a function which flattens a sequence.

; Divide & conquer
; 1. Function to flatten single object, called recursive
; 2. Call recursively on all items and combine results - reduce

(defn flatten*
  [out-coll item]
  (if (sequential? item) ; out-coll = [1 2 3], item = 4
    (reduce flatten* out-coll item)
    (conj out-coll item))) ; [1 2 3 4]

(defn flatten-a-sequence [coll]
  (reduce flatten* [] coll))

(= (flatten-a-sequence '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (flatten-a-sequence ["a" ["b"] "c"]) '("a" "b" "c"))
(= (flatten-a-sequence '((((:a))))) '(:a))

; Write a function which takes a string and returns a new string containing
; only the capital letters.

(defn f [s] (apply str (filter #(Character/isUpperCase %1) (seq s))))

(= (f "HeLlO, WoRlD!") "HLOWRD")
(empty? (f "nothing"))
(= (f "$#A(*&987Zf") "AZ")

(apply str (re-seq #"[A-Z]+" "HeLlO, WoRlD!"))
(clojure.string/join "" (re-seq #"[A-Z]+" "HeLlO, WoRlD!"))

; Write a function which removes consecutive duplicates from a sequence.

(= (apply str (f "Leeeeeerrroyyy")) "Leroy")
(= (f [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
(= (f [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

; 31. Pack a Sequence
; Write a function which packs consecutive duplicates into sub-lists.

#(partition-by identity %)
(fn [coll] (partition-by identity coll))

(= (pack-a-sequence [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
(= (pack-a-sequence [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
(= (pack-a-sequence [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

(defn duplicate-a-sequence [coll])

(= (duplicate-a-sequence [1 2 3]) '(1 1 2 2 3 3))
(= (duplicate-a-sequence [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= (duplicate-a-sequence [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
(= (duplicate-a-sequence [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))


(def v [:a :b :c])
(mapcat #(repeat 2 %) v)
(apply concat (map #(repeat 2 %) v))

; Implement function 'range'

(range 10)
(range 1 10)
(range -1 10)

(defn range* [start end]
  (take (- end start) (iterate inc start)))

(defn maximum-value [& args]
  (first (sort > args)))

(defn zip [fst snd]
  (mapcat vector fst snd))

(zip [1 2 3] [:a :b :c])

(= (maximum-value 1 8 3 4) 8) ; args = [1 8 3 4]
(= (maximum-value 30 20) 30)
(= (maximum-value 45 67 11) 67)

[1 2 3] [:a :b :c] => [1 :a 2 :b 3 :c]

(repeat 0) => (0 0 0 0 0 0 0 0 0)
1 2 3 4 5 6 7 8 9

(defn interpose [sep coll]
  (butlast (interleave coll (repeat sep))))

(interpose "-" [1 2 3])

; 41. Write a function which drops every Nth item from a sequence.

(defn f [coll nth]
  (flatten (partition-all (dec nth) nth coll)))

(doc partition-all)

(partition-all 4 2 [0 1 2 3 4 5 6 7 8 9])

[1 2 3 4 5 6 7 8 9 10], usun co trzeci element
[1 2   4 5   7 8   10]
((1 2) (4 5) (7 8) (10))

(partition-all 3 [1 2 3 4 5 6 7 8 9 10])
[[1 2 3] [4 5 6] [7 8 9] [10]]

(= (f [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
(= (f [:a :b :c :d :e :f] 2) [:a :c :e])
(= (f [1 2 3 4 5 6] 4) [1 2 3 5 6])

(defn silnia [n]
  (reduce *' (range 1 (inc n))))

(defn factorial [n]
  (if (< n 2)
    1
    (* n (factorial (dec n)))))

(def factorial [n]
  (apply * (range 2 (inc 5))))

(defn quick-sort [[pivot & coll]]
  (when pivot
    (concat (quick-sort (filter #(< % pivot) coll))
            [pivot]
            (quick-sort (filter #(>= % pivot) coll)))))


(str "hello" " world")