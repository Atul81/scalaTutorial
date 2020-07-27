package hackerank

import logging.LoggingUtil

import scala.collection.mutable.ListBuffer

object ArrayOfN extends LoggingUtil {

  def f(i: Int): List[Int] = {
    val returnList: ListBuffer[Int] = ListBuffer.empty
    for (j <- 1 until i + 1) {
      returnList.addOne(j)
    }
    returnList.toList
  }

  def main(args: Array[String]): Unit = {
    log.info("Inside main method for ==> ".concat(this.getClass.getName))
    val outputSeq: List[Int] = fWithInline(2)
   // log.info(outputSeq.toString)
  }

  def fWithInline(num: Int): List[Int] = {
    var list: List[Int] = List.empty
    for(j <- 0 until num if num> 0){
      list = j :: list
      print(j + "\n")
    }
    list
  }
}