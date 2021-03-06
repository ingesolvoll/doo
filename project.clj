(defproject ingesolvoll/doo "0.2.1"
  :description "doo is a library to run clj.test on different js environments."
  :url "https://github.com/bensu/doo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :scm {:name "git"
        :url "https://github.com/ingesolvoll/doo"
        :dir ".."}

  :deploy-repositories [["clojars" {:sign-releases false
                                    :url           "https://clojars.org/repo"
                                    :username      :env/clojars_username
                                    :password      :env/clojars_password}]]

  :test-paths ["test/clj"]

  :resource-paths ["resources"]

  :clean-targets ^{:protect false} [:target-path "out"]

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/data.json "0.2.6"]
                 [karma-reporter "3.1.0"]
                 [meta-merge "1.0.0"]]

  :jvm-opts ["-Xmx1g"]

  :profiles
  {:dev {:source-paths ["src/clj" "test/clj" "../example/src" "../example/test"]
         :dependencies [[org.clojure/core.async "0.1.346.0-17112a-alpha"]]}})
