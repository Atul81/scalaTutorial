package hackerank

import logging.LazyLogging


object NTimesHelloWorld extends App with LazyLogging {

  var n = scala.io.StdIn.readInt

  def f(n: Int): Unit = {
    for (i <- 0 until n) println("Hello World")
  }
  f(n)
}
