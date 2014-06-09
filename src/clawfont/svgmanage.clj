(ns clawfont.svgmanage
  (:require [clojure.string :as string]
            [clojure-ini.core :as ini])
  (:import (java.net InetAddress))
  (:gen-class))

(defn glyphs-to-font [glyphs-list font-config]
  ;; TODO
  )

(defn build-glyph [glyph-char glyph-path]
  ;; TODO
  )

(defn build-glyphs [map-of-glyps]
  (map build-glyph map-of-glyps))

(defn get-list-of-svgs [index-path]
  (get (ini/read-ini index-path) "charmap")

(defn get-font-config [index-path]
  (get (ini/read-ini index-path) "font")

(defn build-font [index-path font-path]
  (glyphs-to-font (build-glyphs (get-list-of-svgs index-path)) (get-font-config index-path)))
