package lecture.part1basic

object DefaultArgumentNamedArgument extends App {

  def sum(x: Int = 100, y: Int): Unit = println(x + y)

  sum(10, 5)
  sum(y = 5) // Named argument | default value x = 100 will be used if not passed

  def test(string: String = "Good to see you") = println(string)

  test()

  test("Hello World")
}
