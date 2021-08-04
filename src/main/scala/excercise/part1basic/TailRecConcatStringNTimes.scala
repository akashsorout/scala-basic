package excercise.part1basic

import scala.annotation.tailrec

object TailRecConcatStringNTimes extends App {

  def concatString(inputStr: String, nTimes: Int): String = {

    @tailrec
    def concatUtil(n: Int, resultStr: String): String = {
      if (n == 0) resultStr
      else
        concatUtil(n - 1, inputStr + resultStr)
    }

    concatUtil(nTimes, "")

  }

  println(
    concatString("Akash", 3));

}
