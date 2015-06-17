package io.github.yeghishe.samples

import akka.http.scaladsl.model.StatusCodes

/**
 * Created by yeghishe on 6/9/15.
 */
class ServiceTest extends ServiceTestBase with Service {
  "Service" when {
    "GET /" should {
      "respond with user" in {
        Get("/") ~> routes ~> check {
          response.status should equal(StatusCodes.OK)
          responseAs[String] should be("Hello World")
        }
      }
    }
  }
}
