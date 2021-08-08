package playground

import scala.util.Try

object OptionTest extends App {

  def returnIntFromStr(id: String) =

    Try {
      id.toInt
    }
      .toOption

  private val str1: Either[String, Int] = returnIntFromStr("1").toRight("Something went wrong")
  private val str: Either[String, Int] = returnIntFromStr("").toRight("Something went wrong")

  private val value: Either[Int, Int => Int] = returnIntFromStr("").toLeft { ip: Int => ip.*(5) }
  println(str1)
  println(str)

  private val convertOptionToLeftIfPresent: Either[Int, String] = Option(1).toLeft("ONE")
  println(convertOptionToLeftIfPresent)


  private val convertOptionToRightIfPresent: Either[String, Int] = Option(1).toRight("ONE")
  println(convertOptionToRightIfPresent)

}
