(ns eidens.markov-persistence.file
  (:require [clojure.java.io :as io]
            [clojure.tools.logging :as log]))

(defn write-data [data output-file]
  (log/info "writing data to file" output-file)
  (with-open [wrtr (io/writer output-file)]
    (binding [*print-length* false
              *out* wrtr]
      (pr data))))

(defn read-data [input-file]
  (log/info "reading data from file" input-file)
  (with-open [rdr (java.io.PushbackReader. (io/reader input-file))]
    (binding [*read-eval* false]
      (read rdr))))
