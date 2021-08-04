package excercise.part1basic

object Functions extends App {

  def greet(name: String, age: Int): String = s"Hi, my name is ${name} and I am ${age} years old"

  println(greet("Akash", 23))

  def factorial(num: Int): Int = {
    if (num == 0)
      1
    else
      num * factorial(num - 1)
  }

  println(factorial(5))

  def fibonacci(num: Int): Int = {
    if (num == 1 || num == 2)
      1
    else
      fibonacci(num - 1) + fibonacci(num - 2)
  }

  println(fibonacci(8))

  def isPrimeNumber(num: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else
        num % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(num / 2)
  }

  println(isPrimeNumber(9))

}
