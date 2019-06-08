import Dependencies._

lazy val ext= project.in(file("../ext"))

lazy val buildExt = (project in file("."))
  .dependsOn(ext)
  .settings(
    name := "build-ext",
    libraryDependencies += scalaTest % Test
  ).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test
