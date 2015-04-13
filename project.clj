(defproject eidens/markov-persistence "0.1.0-SNAPSHOT"
  :description "persistence for markov matrices in clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :url "https://github.com/eidens/markov_persistence"
  :scm {:url "git@github.com:eidens/markov_persistence.git"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.clojure/tools.logging "0.3.1"]
                 [eidens/markov "0.1.0-SNAPSHOT"]]

  :main ^:skip-aot eidens.markov-persistence.core)
