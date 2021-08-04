package playground

import scala.io.StdIn._
import scala.language.postfixOps

object Main extends App {

  test()

  private def test(): Unit = {
    val numList = List("1", "2", "3")
    val strList = List("One", "Two")

    print(
      for {
        num <- numList
        str <- strList
        strU <- str.toUpperCase
      }
        yield num + strU
    )
  }


  private def zipOpr(): Unit = {
    val keys = Array("AKASH", "VINAY", "VIJAY")
    val values = Array(1000, 2000, 300)
    val map = keys.zip(values).toMap
    println(map)
  }

  private def tupleOpr(): Unit = {

    val myTuple = ("AKASH", "HODAL", 30000)
    println(myTuple._1)
  }

  private def mapOpr(): Unit = {
    val map = Map("akash" -> 4, "Vinay" -> 0)
    val value = map.getOrElse("akash", -100)
    println(value)
  }


  private def arrayOptr(arr: Array[Int]): Unit = {
    arr
      .filter(_ % 2 == 0)
      .map(_ * 2)
      .foreach(println(_))

    for {
      e <- arr
      if e % 2 == 0
    } yield e * 2

  }

  private def forLoopProductOfUnicode(string: String): Int = {

    // Solution 1 via loop
    /*var res: Int = 1
    for {
      ch <- string
    }
      res *= ch
    res*/

    // solution 2
    string.foldLeft(1)((a, b) => a * b)
  }

  private def countDown(n: Int) {
    for (i <- n to 0 by -1)
      println(i)
  }

  private def signumOfNumber(num: Int): Int =
    if (num == 0) num else if (num > 0) 1 else -1

  private def forLoopYield: Unit = {

    val res =
      for (i <- 1 to 10)
        yield i * 2 // yields a collection one element per iteration

    println(res)

    val out = for (i <- "AKASH"; j <- 0 to 1)
      yield (i + j).toChar

    println(out)

    val value =
      for {
        i <- 1 to 5
        j <- 1 to 3
        if i != j
      }
        yield i + j

    println(value)
  }

  private def forLoopMultipleExpression(): Unit = {
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println(10 * i + j)
  }


  private def forLoopDirtyHand: Unit = {
    for (i <- 1 to 10)
      print(i + "\t")
    println
    var sumOfCharValue = 0
    for (ch <- "Akash")
      sumOfCharValue += ch

    println(sumOfCharValue)

    for {
      i <- 10 to 1 by -1
      j <- 1 to 10 reverse
    }
      println(i + "---" + j)
  }


  private def readInputAndDisplay(): Unit = {
    val name = readLine("Name : ")
    print("Age : ")
    val age = readInt();

    println(s"Your name $name and yr age $age")
  }


  private def greet(): Unit = {
    println("Welcome")
  }


}
