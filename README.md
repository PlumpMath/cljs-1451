# cljs-1451

> Protocol implementations do not support qualified method names

To reproduce the issue attempt to compile with:

    ./scripts/build

You'll see:

```sh
WARNING: Bad method signature in protocol implementation,
foo/SomeProtocol does not declare method called foo/method-one at line
13 src/cljs_1451/core.cljs

clojure.lang.ExceptionInfo: failed compiling
	file:src/cljs_1451/core.cljs {:file
	#object[java.io.File 0x59072e9d "src/cljs_1451/core.cljs"]}
	at clojure.core$ex_info.invoke(core.clj:4593)
Caused by: clojure.lang.ExceptionInfo: set! target must be a field or
	a symbol naming a var at line 13 src/cljs_1451/core.cljs {:file
	"src/cljs_1451/core.cljs", :line 13, :column 3, :tag
	:cljs/analysis-error} 
```
