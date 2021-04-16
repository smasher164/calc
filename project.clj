(defproject calc "0.1.0-SNAPSHOT"
  :description "calculator"
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :plugins [[io.taylorwood/lein-native-image "0.3.1"]]
  :main calc.main
  :native-image {:name "calc"
                 :jvm-opts ["-Dclojure.compiler.direct-linking=true"]
                 :opts ["-H:ReflectionConfigurationFiles=reflection.json"
                        "--initialize-at-build-time"]})
