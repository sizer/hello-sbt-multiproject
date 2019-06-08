import Dependencies._

lazy val core = project.in(file("../core"))

lazy val buildApp = (project in file("."))
  .dependsOn(core)
  .settings(
    name := "build-app",
    libraryDependencies += scalaTest % Test
  )
  .enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test
