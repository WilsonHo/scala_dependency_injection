name := "scala_dependency_injection"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.1.0",
  "junit" % "junit" % "4.12",
  "net.debasishg" %% "redisclient" % "3.4",

  /**
    * Test
    */
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.scalactic" %% "scalactic" % "2.2.4",

  "com.orange.redis-embedded" % "embedded-redis" % "0.5"
)