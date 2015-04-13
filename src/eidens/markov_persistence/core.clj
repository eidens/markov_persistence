(ns eidens.markov-persistence.core
  (:require [eidens.markov.frequencies :as markov-frequencies]
            [eidens.markov-persistence.file :as file]
            [clojure.tools.cli :as cli]))

(def cli-options
  [["-f" "--outfile OUTFILE"
    :id :output-file]
   ["-i" "--infile INFILE"
    :id :input-file]
   ["-o" "--markov-order ORDER"
    :id :markov-order
    :default 1
    :parse-fn #(Integer/parseInt %)]])

(defn- markov-frequencies [options]
  (let [output-file (:output-file options)
        input-file (:input-file options)
        markov-order (:markov-order options)
        walk (file/read-data input-file)
        matrix (markov-frequencies/matrix markov-order walk)]
    (if output-file
      (file/write-data matrix output-file)
      (println matrix))))

(defn -main
  [& args]
  (let [cli-args (cli/parse-opts args cli-options)
        options (:options cli-args)
        command (first (:arguments cli-args))]
    (case command
      "frequencies" (markov-frequencies options)
      "read" (println (file/read-data (:input-file options))))))
