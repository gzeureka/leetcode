(defproject leetcode "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 ]
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[midje "1.9.2"]
                                  [midje-notifier "0.3.0"]
                                  ]
                   :plugins [[lein-midje "3.2.1"]
                             [lein-jupyter "0.1.16"]
                             ]
                   }
             }
  )
