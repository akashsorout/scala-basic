package playground

object LearnEither extends App {

  def validateAge(age: Int) =
    if (age == 0)
      Left("Wrong Value")
    else
      Right(age)

  private val either: Either[String, Int] = validateAge(0)
  private val either1: Either[String, Int] = validateAge(12)
  private val either2: Either[String, Int] = validateAge(13)

  private val stringOrInt: Either[String, Int] = either1.flatMap(
    a =>
      either2.map(b => a + b)
  )

  private val stringOrInt1: Either[String, Int] = either1.flatMap(
    a =>
      either2.flatMap(
        b => either.map(c => a + b + c)
      )
  )
  println(stringOrInt1)
  println(stringOrInt)

  //   or

  for {
    a <- either1
    b <- either2
  }
    yield a + b

  // similarly

  for {
    a <- either1
    b <- either2
    c <- either
  }
    yield a + b +c
}
