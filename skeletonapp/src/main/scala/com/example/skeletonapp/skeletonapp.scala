package com.example.skeletonapp

import com.google.inject.Module
import com.twitter.inject.server.TwitterServer

object SkeletonApp extends SkeletonAppServer

class SkeletonAppServer extends TwitterServer {

  // this is a comment
  override val name: String = "SkeletonApp"

  override protected def modules: Seq[Module] = Seq(new DefaultServerModule)

}
