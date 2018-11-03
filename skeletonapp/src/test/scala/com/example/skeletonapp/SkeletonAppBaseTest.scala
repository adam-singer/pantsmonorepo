package com.example.skeletonapp

import com.google.inject.Stage
import com.twitter.inject.server.{EmbeddedTwitterServer, FeatureTest}

trait SkeletonAppBaseTest extends FeatureTest {

  def stage = Stage.DEVELOPMENT

  val server = new EmbeddedTwitterServer(
    twitterServer = new SkeletonAppServer,
    stage = stage
  )

}
