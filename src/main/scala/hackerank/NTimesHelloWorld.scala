package hackerank

import logging.LoggingUtil


object NTimesHelloWorld extends App with LoggingUtil {

  var n = scala.io.StdIn.readInt
  f(n)
  def f(n: Int): Unit = {
    for (i <- 0 until n) println("Hello World")
  }
}
