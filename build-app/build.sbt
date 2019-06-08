import Dependencies._

lazy val core = project.in(file("../core")).enablePlugins(PlayScala)

lazy val buildApp = (project in file("."))
  .enablePlugins(PlayScala)
  .dependsOn(core)
  .settings(
    name := "build-app",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test
