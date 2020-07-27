package logging

import org.slf4j.{Logger, LoggerFactory}

trait LoggingUtil {

  val log: Logger = LoggerFactory.getLogger(classOf[LoggingUtil])
}
