enablePlugins(ScalaJSPlugin)

name := "Scala-js monix delayed task test"
scalaVersion := "2.12.8"

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

libraryDependencies += "io.monix" %%% "monix-reactive" % "3.0.0-RC2"
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.7" % "test"

