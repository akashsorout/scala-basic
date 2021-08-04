package lecture.part1basic

object Expressions extends App {
  val x = 1 + 2 // Expression

  println(x)
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "bye"

  }

  println(" Check  :" + check)
  var check =
    if (true) {
      println(true)
      5
    }

    else {
      println(false)
      3
    }
  var aVar = 5

  println(aValue)
  var aValue = (aVar = 3) // aValue will be of Unit Type as aVar = 3 is also a expression and return Unit [void]
  println(aCodeBlock) // will print bye | last statement of code block is return statement automatically

}
