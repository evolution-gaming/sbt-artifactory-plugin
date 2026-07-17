addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.4.4")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.12.0")

// sbt-coveralls has no sbt2-compatible release yet, so only pull it into the
// meta-build when it's running on Scala 2.12 (sbt 1.x).
if (scala.util.Properties.versionNumberString.startsWith("2.12"))
  Seq(addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.3.9"))
else
  Seq.empty
