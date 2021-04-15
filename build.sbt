import ScriptedPlugin.autoImport._

sbtPlugin := true

name := "sbt-artifactory-plugin"

organization := "com.evolution"

description := "SBT artifactory plugin"

homepage := Some(new URL("https://github.com/evolution-gaming/sbt-artifactory-plugin"))

startYear := Some(2021)

organizationName := "Evolution"

organizationHomepage := Some(url("https://evolution.com"))

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.12.13")

crossSbtVersions := Seq("1.5.0", "1.4.9")

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


ThisBuild / versionScheme := Some("early-semver")

sonatypeCredentialHost := "s01.oss.sonatype.org"

sonatypeRepository := "https://s01.oss.sonatype.org/service/local"

releasePublishArtifactsAction := PgpKeys.publishSigned.value

publishTo := sonatypePublishToBundle.value

scriptedBufferLog := false

scriptedLaunchOpts := Seq("-Xmx1G", s"-Dplugin.version=${version.value}")

enablePlugins(SbtPlugin)

//addCommandAlias("build", ";clean; coverage; test; scripted")
addCommandAlias("build", ";clean; test; scripted")