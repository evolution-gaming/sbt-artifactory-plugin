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

releaseCrossBuild := true

scriptedBufferLog := false

scriptedLaunchOpts := Seq("-Xmx1G", s"-Dplugin.version=${version.value}")

enablePlugins(SbtPlugin)

//addCommandAlias("build", ";clean; coverage; test; scripted")
addCommandAlias("build", ";clean; test; scripted")