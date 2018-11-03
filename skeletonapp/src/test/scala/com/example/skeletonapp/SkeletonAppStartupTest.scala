package com.example.skeletonapp

import com.google.inject.Stage
import com.twitter.conversions.time.intToTimeableNumber

class SkeletonAppStartupTest extends SkeletonAppBaseTest {

  override def stage: Stage = Stage.PRODUCTION

  test("Startup and be healthy") {
    server.assertStarted()
    server.assertHealthy()
    server.close(20.seconds)
    server.assertCleanShutdown()
  }
}
