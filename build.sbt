name := """scala-mockito-spy-helper"""

organization := "com.fabiangebert"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
	//testing
	"org.scalatest" %% "scalatest" % "2.2.1" % "test",
	"org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test",
	"org.mockito" % "mockito-core" % "1.10.19" % "test"
)

