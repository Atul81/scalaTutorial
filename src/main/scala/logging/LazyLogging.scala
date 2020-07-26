package logging

import org.slf4j.{Logger, LoggerFactory}

trait LazyLogging {

  val log: Logger = LoggerFactory.getLogger(classOf[LazyLogging])
}
