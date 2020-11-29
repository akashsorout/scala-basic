package lecture.part1basic

object ValueVariablesTypes extends App {

  val x = 42 // val --> Immutable
  val y: Int = 46
  val str: String = "Hello"
  val aShort: Short = 123
  val aBoolean: Boolean = true
  val aChar: Char = 97 // 'a'
  val bChar: Char = 'c'

  var aVariable = 4
  aVariable = 5 // Mutable
}
