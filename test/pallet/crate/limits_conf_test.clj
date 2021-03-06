(ns pallet.crate.limits-conf-test
  (:require
   [clojure.test :refer :all]
   [pallet.actions :refer [remote-file]]
   [pallet.build-actions :refer [build-actions]]
   [pallet.common.logging.logutils :refer [logging-threshold-fixture]]
   [pallet.crate.limits-conf :as limits-conf]))

(use-fixtures :once (logging-threshold-fixture))

(deftest service-test
  (is
   (script-no-comment=
    (first
     (build-actions {}
       (remote-file
        "/etc/security/limits.conf"
        :owner "root"
        :group "root"
        :mode "644"
        :content
"* - fsize 1024
* - no-file 1024
* - core 1024
* - data 1024")))
    (first
     (build-actions {}
       (limits-conf/settings
        {:entries [["*" "-" "fsize" "1024"]
                   {:domain "*" :type "-" :item "no-file" :value "1024"}]})
       (limits-conf/ulimit
        ["*" "-" "core" "1024"])
       (limits-conf/ulimit
        {:domain "*" :type "-" :item "data" :value "1024"})
       (limits-conf/configure {}))))))
