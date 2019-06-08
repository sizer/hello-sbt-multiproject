import Dependencies._

lazy val ext= project.in(file("../ext"))

lazy val buildExt = (project in file("."))
  .dependsOn(ext)
  .settings(
    name := "build-ext",
    libraryDependencies += scalaTest % Test
  )
