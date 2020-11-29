package lecture.part1basic

object CallByValueCallByName extends App {

  def computeCallByValue(n: Long) = {
    println(n)
    println(n)
  }

  computeCallByValue(System.currentTimeMillis())

  // This => tells that compiler to put exact
  // parameter in each location where it is used
  // LAZY computation
  def computeCallByName(n: => Long) = {
    println(n)
    println(n)
  }


  computeCallByName(System.nanoTime())

}
