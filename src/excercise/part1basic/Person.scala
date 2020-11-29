package excercise.part1basic

class Person(val fName: String, val lName: String, val year: Int, age: Int = 0) {

  def +(nickName: String): String = s"$fName [$nickName]"

  // EACH Operator in scala is a method

  def unary_+ : Person = new Person(fName, lName, year, age + 1)

  def apply(): String = s"$fullName ----- $age"

  def fullName: String = fName + lName

}
