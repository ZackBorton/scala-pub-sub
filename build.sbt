name := "scala-pub-sub-e"

version := "0.1"

scalaVersion := "2.12.8"

// Location where the dependencies will be pulled from
resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

// Exclude transitive dependencies, e.g., include log4j without including logging via jdmk, jmx, or jms.
libraryDependencies ++= Seq(
   "com.github.etaty" %% "rediscala" % "1.8.0"
)

