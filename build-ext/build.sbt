import Dependencies._

lazy val core = project.in(file("../core"))
lazy val ext= project.in(file("../ext"))

lazy val buildExt = (project in file("."))
  .dependsOn(core, ext)
  .settings(
    name := "build-ext",
    libraryDependencies += scalaTest % Test
  )
