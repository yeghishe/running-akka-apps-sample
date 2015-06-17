package io.github.yeghishe.samples

import akka.event.{ LoggingAdapter, NoLogging }
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{ Matchers, WordSpec }

trait ServiceTestBase extends WordSpec with Matchers with ScalatestRouteTest {
  protected def log: LoggingAdapter = NoLogging
}
