(ns clawfont.core
  (:require [clojure.string :as string]
            [clojure.tools.cli :refer [parse-opts]])
  (:import (java.net InetAddress))
  (:gen-class))

(def update-index-cli-options [])
(def create-index-cli-options [])
(def build-font-cli-options [])

(defn usage [options-summary]
  (->> ["From svg files font generator."
        ""
        "Usage: clawfont [options] action"
        ""
        "Options:"
        options-summary
        ""
        "Actions:"
        "  create-index    Start a new server"
        "  udpate-index    Stop an existing server"
        "  build-font      Print a server's status"
        ""
        "Please refer to the manual page for more information."]
       (string/join \newline)))

(defn error-msg [errors]
  (str "The following errors occurred while parsing your command:\n\n"
       (string/join \newline errors)))

(defn exit [status msg]
  (println msg)
  (System/exit status))

(defn -main [& args]
  (let [{:keys [options arguments errors summary]} (parse-opts args [])]
    ;; Handle help and error conditions
    (cond
      (:help options) (exit 0 (usage summary))
      (not= (count arguments) 1) (exit 1 (usage summary))
      errors (exit 1 (error-msg errors)))
    ;; Execute program with options
    (case (first arguments)
      "create-index" (#() (parse-opts options create-index-cli-options))
      "update-index" (#() (parse-opts options update-index-cli-options))
      "build-font" (#() (parse-opts options build-font-cli-options))
      (exit 1 (usage summary)))))
