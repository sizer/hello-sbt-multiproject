import Dependencies._

lazy val ext = (project in file("."))
  .settings(
    name := "ext",
    libraryDependencies += scalaTest % Test
  )
