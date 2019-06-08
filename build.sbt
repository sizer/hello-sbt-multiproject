import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.2.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val buildApp = project.in(file("build-app"))
lazy val buildExt = project.in(file("build-ext"))

lazy val root = project.in(file("."))
