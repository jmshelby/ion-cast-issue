(ns log
  (:require [datomic.ion.cast :as cast]
            [datomic.dev-local :as dl]))

(cast/initialize-redirect :stderr)

(defn run [_]
  (println "From println")
  (cast/dev {:msg "From cast/dev"})
  (println "From println 2")
  (cast/dev {:msg "From cast/dev 2"}))

