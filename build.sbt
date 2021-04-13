import ScriptedPlugin.autoImport._

sbtPlugin := true

name := "sbt-artifactory-plugin"

organization := "com.evolutiongaming"

description := "SBT artifactory plugin"

homepage := Some(new URL("https://github.com/evolution-gaming/sbt-artifactory-plugin"))

startYear := Some(2019)

organizationName := "Evolution"

organizationHomepage := Some(url("https://evolution.com"))

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.12.11")

crossSbtVersions := Seq("1.3.13")

resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

releaseCrossBuild := true

scriptedBufferLog := false

scriptedLaunchOpts := Seq("-Xmx1G", s"-Dplugin.version=${version.value}")

enablePlugins(SbtPlugin)

addCommandAlias("build", ";clean; coverage; test; scripted")