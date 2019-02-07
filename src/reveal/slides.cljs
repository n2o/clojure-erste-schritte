(ns reveal.slides
  (:require [goog.string :refer [format]]
            [goog.string.format]))

(defn- set-header [header data-state]
  [:style (format ".%s header span:after { content: \"%s\";}" data-state header)])

(def slide-1
  [:section {:data-state "footer"}
   [:div#title
    [:img {:src "img/logos/clj.svg"
           :style "height: 5em;line-height:5em;"}]
    [:h1 "Clojure: Erste Schritte"]
    [:hr]
    [:p
     "Clojure Meetup Düsseldorf" [:br]
     "Christian Meter" [:br]
     "07.02.2019"]]])

(def slide-2
  [:section
   [:h3 "Clojure ist..."]
   [:p "funktional"]
   [:p "dynamisch typisiert"]
   [:p "auf der JVM gehostet"]
   [:p "ein Lisp-Dialekt"]])

(def slide-3
  [:section {:data-state "clojure-history"}
   (set-header "Geschichte von Clojure" "clojure-history")
   [:div.row
    [:div.col-4
     [:img {:src "img/logos/clj.svg"
            :style "height: 5em;line-height:5em;"}]]
    [:div.col-8
     [:p "Öffentliches Release: Okt. 2007"]
     [:p "Aktuelle Version 1.10"]
     [:p "Extrem seriöse Entwicklung"]
     [:p "Nicht \"der neuste heiße Scheiß\" "]
     [:p.highlight "Trotzdem nicht langweilig"]]]])

(def slide-4
  [:section
   [:img {:src "img/tweet-boring-clojure.png"}]])

(def slide-5
  [:section {:data-state "clojure-data"}
   (set-header "Datenstrukturen" "clojure-data")
   [:table {:style "width:100%"}
    [:tbody
     [:tr [:td [:pre.table [:code "42 1.3 4/3"]]] [:td "Numbers"]]
     [:tr [:td [:pre.table [:code "\"foo\""]]] [:td "Strings"]]
     [:tr [:td [:pre.table [:code ":foo :bar :baz"]]] [:td "Keywords"]]
     [:tr
      [:td [:pre.table [:code "[] '() #{} {}"]]]
      [:td
       "Collections"[:br]
       [:small "(Vector, List, Set, Map)"]]]
     [:tr [:td [:pre.table [:code "true false"]]] [:td "Booleans"]]]]])

(def slide-6
  [:section {:data-state "clojure-hof"}
   (set-header "Higher-Order Functions" "clojure-hof")
   [:img {:src "img/hof.png"}]
   [:small
    [:small
     [:a {:href "https://speakerdeck.com/bendisposto/verliebt-in-clojure?slide=12"}
      "https://speakerdeck.com/bendisposto/verliebt-in-clojure?slide=12"]]]])

(def slide-7
  [:section {:data-state "clojure-code"}
   (set-header "Beispiele" "clojure-code")
   [:pre [:code "(def x 42)\nx\n;; 42"]]
   [:pre [:code "(defn square [num] (* num num))\n(square 4)\n;; 16

;; Alternativ:\n(def square (fn [num] (* num num)))\n(def square #(* % %))\n"]]
   [:pre [:code "(map square [1 2 3])\n;; (1 4 9)"]]
   [:pre [:code "(reduce + (map square [1 2 3]))\n;; 14"]]])

(def slide-to-the-repl
  [:section {:data-state "demo"}
   (set-header "Demo" "demo")
   [:strong "To the REPL!"]])

(def slide-links
  [:section {:data-state "links"}
   (set-header "Aufgaben" "links")
   [:p
    "Video-Feed generieren"
    [:br]
    [:a {:href "https://github.com/clojuredus/xml-convert"} "https://github.com/clojuredus/xml-convert"]]
   [:p
    "Katas aus den letzten Meetups"
    [:br]
    [:a {:href "https://github.com/clojuredus/clojure-coding-dojo"}
     "https://github.com/clojuredus/clojure-coding-dojo"]]])

(def slide-links-more
  [:section {:data-state "links-more"}
   (set-header "Weitere Aufgaben" "links-more")
   [:p
    "Web-Spielchen"
    [:br]
    [:a {:href "http://clojurescriptkoans.com"} "ClojureScript Koans"]]
   [:p
    "Web-IDE mit eigener Codeeingabe und grafischen Beispielen"
    [:br]
    [:a {:href "https://www.maria.cloud/"} "maria.cloud"]]
   [:p
    "Herunterladbare Testaufgaben"
    [:br]
    [:a
     {:href "http://exercism.io/languages/clojure/about"}
     "exercism.io"]]])

(def slide-links-editoren
  [:section {:data-state "links-editors"}
   (set-header "Editoren" "links-editors")
   [:p [:a {:href "https://leiningen.org/"} "Build-Tool Leiningen"]]
   [:p [:a {:href "http://spacemacs.org"} "Spacemacs + Cider"]]
   [:p
    [:a {:href "https://joyclark.org/post/sketchnote/clojure-meetup/2017/08/17/spacemacs.html"}
     "Blogpost von Joy über Spacemacs + Clojure"]]
   [:p
    [:a {:href "https://cursive-ide.com/"}
     "IntelliJ + Cursive"]]])

(defn all
  "Add here all slides you want to see in your presentation."
  []
  [slide-1
   slide-2
   slide-3
   slide-4
   slide-5
   slide-7
   slide-to-the-repl
   slide-links
   slide-links-more
   slide-links-editoren])
