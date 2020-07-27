package hackerank

import logging.LoggingUtil


object FilterList extends LoggingUtil {

  def main(args: Array[String]): Unit = {
    log.info("Inside main method")
    val filterList = f(2, List.apply(1,2,3,4))
    log.info(filterList.toString())
  }

  def f(delim: Int, arr: List[Int]): List[Int] = {
    arr.filter(itr => itr < delim)
  }
}
