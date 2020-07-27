package hackerank

import logging.LoggingUtil

object ReverseList extends LoggingUtil{

  def f(arr: List[Int]): List[Int] = {
    arr.reverse
  }

  def main(args: Array[String]): Unit = {
    log.info("Inside main method for ==> ".concat(this.getClass.getName))
    val outputSeq: List[Int] = f(List(1, 2, 3, 4))
    log.info(outputSeq.toString)
  }

}
