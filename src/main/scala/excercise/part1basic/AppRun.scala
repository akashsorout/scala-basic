package excercise.part1basic

object AppRun extends App {


  val person = new Person("Akash", "Sorout", 1993)

  println(person.fullName)

  val book = new Book("Rich Dad Poor Dad", 2000, person)

//  println(book authorAge)
  println(book.isWrittenBy)
  val newPerson = +person

  println(newEdition)


  println(person + "Cool Guy")

  def newEdition = book copy 2009

  println(newPerson())


}
