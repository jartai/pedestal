; Copyright 2013 Relevance, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(defproject io.pedestal/pedestal.jetty "0.1.8-SNAPSHOT"
  :description "Embedded Jetty adapter for Pedestal HTTP Service"
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.eclipse.jetty/jetty-server "8.1.9.v20130131"]
                 [org.eclipse.jetty/jetty-servlet "8.1.9.v20130131"]
                 [javax.servlet/javax.servlet-api "3.0.1"]]
  :min-lein-version "2.0.0"
  :warn-on-reflection true)
