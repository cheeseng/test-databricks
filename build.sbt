lazy val example = Project("example", file(".")).settings(
  name := "testdatabricks",
  organization := "com.example",
  version := "1.0.0", 
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14"
)
