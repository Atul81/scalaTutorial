package hackerank

import logging.LazyLogging

import scala.collection.mutable.ListBuffer

object FilterPositionList extends LazyLogging {

  def main(args: Array[String]): Unit = {
    log.info("Inside main method for ==> ".concat(this.getClass.getName))
    val filterList: List[Int] = fWithFor(List(1, 2, 3, 4))
    log.info(filterList(1).toString)

  }

  def f(arr: List[Int]): List[Int] = {
    val arrIndexItr = arr.view.zipWithIndex
    val returnList: ListBuffer[Int] = ListBuffer.empty
    arrIndexItr.foreach { itr =>
      if (itr._2 % 2 == 0)
        returnList.addOne(itr._1)
    }
    returnList.toList
  }

  def fWithFor(arr: List[Int]): List[Int] = {
    val returnList: ListBuffer[Int] = ListBuffer.empty
    for ((itr, ind) <- arr.view.zipWithIndex if ind % 2 == 0) returnList.addOne(itr)
    returnList.toList
  }

}

