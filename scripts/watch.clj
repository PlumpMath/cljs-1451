(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-1451.core
   :output-to "out/cljs_1451.js"
   :output-dir "out"})
