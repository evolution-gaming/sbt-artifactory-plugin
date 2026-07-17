addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.4.4")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.5.0")

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.3.1")

addSbtPlugin("com.github.sbt" % "sbt2-compat" % "0.1.0")

// sbt-coveralls and sbt-sonatype have no sbt2-compatible release yet, so only
// pull them into the meta-build when it's running on Scala 2.12 (sbt 1.x).
if (scala.util.Properties.versionNumberString.startsWith("2.12"))
  Seq(
    addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.3.9"),
    addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.7"))
else
  Seq.empty