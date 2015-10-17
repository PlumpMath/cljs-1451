(ns cljs-1451.core
  (:require [cljs-1451.foo :as foo]
            [clojure.browser.repl :as repl]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Do I have a bug?")

(defn main []
  (reify
    foo/SomeProtocol
    (foo/method-one [_] "No you don't")
    (foo/method-two [_] nil)))

(println (foo/method-one (main)))
