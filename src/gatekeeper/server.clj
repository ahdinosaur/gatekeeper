(ns gatekeeper.server
  (:require [noir.server :as server]))

(server/load-views "src/gatekeeper/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8000"))]
    (do
      (server/start port {:mode mode
                          :ns 'gatekeeper}))))

