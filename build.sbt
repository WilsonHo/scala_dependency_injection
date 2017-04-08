name := "scala_dependency_injection"

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.bintrayRepo("websudos", "oss-releases"),
  "spray repo" at "http://repo.spray.io",
  "Typesafe repository snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype repo" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype staging" at "http://oss.sonatype.org/content/repositories/staging",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
  "Twitter Repository" at "http://maven.twttr.com"
)

val akkaV = "2.4.4"
val phantomV = "2.0.2"
libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.1.0",
  "junit" % "junit" % "4.12",
  "net.debasishg" %% "redisclient" % "3.4",

  /**
    * Test
    */
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.scalactic" %% "scalactic" % "2.2.4",

  "com.orange.redis-embedded" % "embedded-redis" % "0.5",

  "org.fusesource" % "sigar" % "1.6.4",

  "org.cassandraunit" % "cassandra-unit" % "3.0.0.1",
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.2.0"

//  "com.outworkers" %% "phantom-dsl" % phantomV,
//  "com.outworkers" %% "phantom-streams" % phantomV,
//  "com.websudos" %% "util-testing" % "0.13.0" % "test, provided",
//  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
//  "com.typesafe.akka" %% "akka-actor" % akkaV,
//  "com.typesafe.akka" %% "akka-stream" % akkaV,
//  "com.typesafe.akka" %% "akka-slf4j" % akkaV,
//  "com.typesafe.akka" %% "akka-testkit" % akkaV,
//  "com.typesafe.akka" %% "akka-stream-testkit" % akkaV,
//  "com.typesafe.play" %% "play-streams-experimental" % "2.4.6"


)