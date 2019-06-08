import Dependencies._

lazy val core = project.in(file("../core"))

lazy val buildApp = (project in file("."))
  .dependsOn(core)
  .settings(
    name := "build-app",
    libraryDependencies += scalaTest % Test
  )
