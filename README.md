# sbt-artifactory-plugin
[![Build Status](https://github.com/evolution-gaming/sbt-artifactory-plugin/workflows/CI/badge.svg)](https://github.com/evolution-gaming/sbt-artifactory-plugin/actions?query=workflow%3ACI)
[![Coverage Status](https://coveralls.io/repos/evolution-gaming/sbt-artifactory-plugin/badge.svg)](https://coveralls.io/r/evolution-gaming/sbt-artifactory-plugin)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/e52efb66ab584caf976b495ae0e135f5)](https://www.codacy.com/gh/evolution-gaming/sbt-artifactory-plugin/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=evolution-gaming/sbt-artifactory-plugin&amp;utm_campaign=Badge_Grade)
[![version](https://img.shields.io/badge/version-click-blue)](https://evolution.jfrog.io/artifactory/api/search/latestVersion?g=com.evolution&a=sbt-artifactory-plugin_2.13&repos=maven-local-releases)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellowgreen.svg)](https://opensource.org/licenses/MIT)

This plugin adds useful methods to `Resolver`, so you could do something like:

```scala
resolvers += Resolver.artifactory("owner", "repo")
```

You also will get [evolution.jfrog.io](http://evolution.jfrog.io) by default included into your project resolvers

## Setup

```scala
addSbtPlugin("com.evolution" % "sbt-artifactory-plugin" % "0.0.2")
```