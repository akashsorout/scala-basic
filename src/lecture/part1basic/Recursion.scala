package lecture.part1basic

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(num: Int): BigInt = {

    if (num <= 1) 1
    else {
      println(s"Calculate factorial for $num")
      num * factorial(num - 1)
    }

  }

  //  println(factorial(5000))


  // TAIL Recursion:
  //
  // Do recursive call in last statement due to which
  // it will not need stack frame to store intermediate values like in case n * fact(n-1)
  // here result of fact(n-1) needs to be further multiply by n ... will consume stack
  // and may end up with StackOverflowError

  def factorialEfficient(num: Int): BigInt = {

    @tailrec
    def factUtil(n: Int, accumulator: BigInt): BigInt = {
      if (n == 1) accumulator
      else
        factUtil(n - 1, n * accumulator)
    }

    factUtil(num, 1)
  }

  println(factorialEfficient(500000))

  /**
   * do via tailrec
   * 1. Concat a string n times
   * 2. isPrime
   * 3. Fibonacci
   **/


}
