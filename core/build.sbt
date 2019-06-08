import Dependencies._

lazy val core = (project in file("."))
  .settings(
    name := "core",
    libraryDependencies += scalaTest % Test
  )
