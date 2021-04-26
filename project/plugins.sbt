// You may use this file to add plugin dependencies for sbt.
resolvers += "Spark Packages repo" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"

addSbtPlugin("org.spark-packages" %% "sbt-spark-package" % "0.2.6")

// scalacOptions in (Compile,doc) := Seq("-groups", "-implicits")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
