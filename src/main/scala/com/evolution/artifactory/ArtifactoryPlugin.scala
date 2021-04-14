package com.evolution.artifactory

import sbt.Keys._
import sbt._
import sbt.librarymanagement.{MavenRepository, Resolver}

object ArtifactoryPlugin extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  object autoImport {

    implicit class ResolverOpsArtifactory(val self: Resolver.type) extends AnyVal {

      def artifactory(owner: String, repo: String): MavenRepository = {
        MavenRepository(
          s"artifactory-$owner-$repo",
          s"https://$owner.jfrog.io/artifactory/$repo")
      }

      def evolution: MavenRepository = artifactory("evolution", "public")

      def evolutionReleases: MavenRepository = artifactory("evolution", "maven-local-releases")
    }
  }

  import autoImport._

  override def projectSettings: Seq[Setting[_]] = List(
    resolvers += Resolver.evolution
  )
}
