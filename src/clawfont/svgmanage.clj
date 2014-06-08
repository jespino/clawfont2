(ns clawfont.svgmanage
  (:require [clojure.string :as string]
            [clojure-ini.core :as ini])
  (:import (java.net InetAddress))
  (:gen-class))

(defn glyphs-to-font [glyphs-list font-config]
  ;; TODO
  )

(defn build-glyph [glyph-path]
  ;; TODO
  )

(defn build-glyphs [list-of-glyps]
  (map build-glyph list-of-glyps))

(defn get-list-of-svgs [index-path]
  (:charmap ini/read-ini index-path))

(defn get-font-config [index-path]
  (:font ini/read-ini index-path))

(defn build-font [index-path font-path]
  (glyphs-to-font (build-glyphs (get-list-of-svgs index-path)) (get-font-config index-path)))
