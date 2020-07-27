package hackerank

import logging.LoggingUtil

import scala.collection.mutable.ListBuffer

object ListReplication extends LoggingUtil{

  def main(args: Array[String]): Unit = {
    log.info("Inside main method")
    f(2, List.apply(1,2,3,4))
  }

  def f(num: Int, arr: List[Int]): List[Int] = {
    println("Printing arr ===>  " + arr.toString())
    val returnList: ListBuffer[Int] = ListBuffer.empty
    arr.foreach(itr => {
      for(_ <- 0 until num){
        println(itr)
        returnList.addOne(itr)
      }
    })
    returnList.toList
  }
}
