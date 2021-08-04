package lecture.part1basic

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  // Add Append a String in "" 5 Times.... We can easily do it via LOOPs .... But
  // Avoid using imperative style of coding in scala ....
  // Use Recursion instead

  def aRepeatFun(inputStr: String, times: Int): String = {
    if (times == 1)
      inputStr
    else inputStr + aRepeatFun(inputStr, times - 1)
  }

  println(aRepeatFun("Hello", 3))

  /** Can Define function inside function */

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(n: Int): Int = n * 2

    aSmallFunction(n)
  }

  /** *
   *
   * 1. A geet Fuunc (name, age) ==> " Hi, my name $name and I am $age yers old
   * 2. Factorial Func
   * 3. Fibonacci function
   * 4. testNumberis Prime ??
   * */
}
