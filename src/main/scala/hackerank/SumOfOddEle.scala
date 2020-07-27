package hackerank

import logging.LoggingUtil

class SumOfOddEle(val arr: List[Int]) {

  def sumOfOddEle() : Int = {
    var result: Int = 0
    for((ind, itr) <- arr.view.zipWithIndex if ind % 2 != 0) result += itr
    result
  }

}

object SumOfOddEle {
  def apply(arr: List[Int]): SumOfOddEle = new SumOfOddEle(arr)
}

object SumOfOddEleMain extends App with LoggingUtil{
  val sumOfOddEle =   SumOfOddEle.apply(List(1,2,3,4,5,6,7)).sumOfOddEle()
  log.info(sumOfOddEle.toString)
}