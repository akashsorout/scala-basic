package excercise.part1basic

class Book(val name: String, val releaseYear: Int, val author: Person) {

  def authorAge: Int = releaseYear - author.year

  def isWrittenBy: String = author.fullName

  def copy(newReleaseYear: Int): Book = new Book(name, newReleaseYear, author)
}
