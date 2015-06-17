package io.github.yeghishe.samples

import akka.actor.ActorSystem
import akka.event.{ Logging, LoggingAdapter }
import akka.http.scaladsl.Http
import akka.stream.ActorFlowMaterializer
import scala.concurrent.ExecutionContext

/**
 * Created by yeghishe on 6/9/15.
 */
object Main extends App with Config with Service {
  private implicit val system = ActorSystem()

  override protected implicit val executor: ExecutionContext = system.dispatcher
  override protected val log: LoggingAdapter = Logging(system, getClass)
  override protected implicit val materializer: ActorFlowMaterializer = ActorFlowMaterializer()

  Http().bindAndHandle(routes, httpInterface, httpPort)
}
