import Dependencies._

lazy val core = project.in(file("../core"))

lazy val ext = (project in file("."))
  .dependsOn(core)
  .settings(
    name := "ext",
    libraryDependencies += scalaTest % Test
  )
