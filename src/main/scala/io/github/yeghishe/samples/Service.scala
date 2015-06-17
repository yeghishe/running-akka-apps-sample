package io.github.yeghishe.samples

import akka.http.scaladsl.server.Directives._

/**
 * Created by yeghishe on 6/9/15.
 */
trait Service extends BaseService {
  protected val routes = get(complete("Hello World"))
}
