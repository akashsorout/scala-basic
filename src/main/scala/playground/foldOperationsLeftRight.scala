package playground


object foldOperationsLeftRight extends App {

  private val seqIp = Seq(1, 2, 3, 6, 4, 9, 7)


  val min = seqIp
    .foldLeft(Int.MaxValue) {
      (a, b) => if (a < b) a else b
    }
  println(min)


  val max = seqIp
    .foldLeft(Int.MinValue) {
      (a, b) => if (a < b) b else a
    }
  println(max)

  val maxByFoldRight = seqIp
    .foldRight(0) { (a, b) => if (b > a) b else a }

  println(s"Max by fold Right $maxByFoldRight")

  //  All above like sum, max, min can be easily done by fold method as well
  //  fold method is ok when seq of input and output are of same type
  //  foldLeft foldRight can handle scenario when type of output is different from input
  //  in below example we have seq of string as input and final output is Int
  //  output of foldLeft and foldRight may be different if function is not commutative
  //  example :
  //  commutative + *  ==>  a + b is equalTo b + a
  //  non-commutative - /   ==> a - b is not equalTo b - a
  val countOfBinarySequence = (1 to 7)
    .map(_.toBinaryString)
    .foldLeft(0) { (a: Int, b: String) => a + b.length }
  println(s"Count of Binary [1, 0] representation of numbers in seq : $countOfBinarySequence")

  private val leftFoldingMinusOperation: Int = (1 to 5)
    .foldLeft(0) {
      (a, b) => a - b
    }

  /**
   * This will acts like
   * 0 - 1 = -1
   * -1 - 2 = -3
   * -3 - 3 = -6
   * -6 - 4 = -10
   * -10 - 5 = -15
   * */
  println(leftFoldingMinusOperation)

  private val foldRightMinusOperation: Int = (1 to 5).foldRight(0) {
    (a, b) => a - b
  }
  /**
   * This will compute like
   * 1 - 0 = 1
   * 2 - 1 = 1
   * 3 - 1 = 2
   * 4 - 2 = 2
   * 5 - 2 = 3
   * */
  println(foldRightMinusOperation)
}
