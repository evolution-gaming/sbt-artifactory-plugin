import ScriptedPlugin.autoImport._

sbtPlugin := true

name := "sbt-artifactory-plugin"

organization := "com.evolution"

description := "SBT Artifactory plugin"

homepage := Some(new URL("https://github.com/evolution-gaming/sbt-artifactory-plugin"))

startYear := Some(2021)

organizationName := "Evolution"

organizationHomepage := Some(url("https://evolution.com"))

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.12.20", "3.8.4")

addSbtPlugin("com.github.sbt" % "sbt2-compat" % "0.1.0")

(pluginCrossBuild / sbtVersion) := {
  scalaBinaryVersion.value match {
    case "2.12" => "1.11.6"
    case _      => "2.0.2"
  }
}

scriptedSbt := {
  scalaBinaryVersion.value match {
    case "2.12" => "1.11.6"
    case _      => "2.0.2"
  }
}

publishMavenStyle := true

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

scmInfo := Some(ScmInfo(
  url("https://github.com/evolution-gaming/sbt-artifactory-plugin"),
  "git@github.com:evolution-gaming/sbt-artifactory-plugin.git"))

developers := List(
  Developer(
    "t3hnar",
    "Yaroslav Klymko",
    "t3hnar@gmail.comm",
    url("https://gitlab.com/t3hnar")))


versionScheme := Some("early-semver")

sonatypeCredentialHost := "s01.oss.sonatype.org"

sonatypeRepository := "https://s01.oss.sonatype.org/service/local"

releasePublishArtifactsAction := PgpKeys.publishSigned.value

publishTo := sonatypePublishToBundle.value

import ReleaseTransformations._

releaseCrossBuild := true // true if you cross-build the project for multiple Scala versions
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("publishSigned"),
  releaseStepCommand("sonatypeBundleRelease"),
  setNextVersion,
  commitNextVersion,
  pushChanges
)

scriptedBufferLog := false

scriptedLaunchOpts := Seq("-Xmx1G", s"-Dplugin.version=${version.value}")

enablePlugins(SbtPlugin)

addCommandAlias("build", ";clean; coverage; test; scripted")