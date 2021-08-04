package playground

object EitherOption extends App {

  case class User(id: Int, name: String)

  private val users = List(
    User(1, "Akash"),
    User(2, "Vijay"),
    User(3, "Vikas"),
    User(4, "Vinay")
  )


  private val userMap: Map[Int, User] = users.map(us => us.id -> us).toMap

  println(lookupUserName(1))
  println(lookupUserName(10))
  println(lookupUserName(0))
  println(lookupUserName(-3))

  def lookupUserName(id: Int): Either[Error, Option[String]] = {

    for {
      userOpt <- lookupUser(id)
    }
    yield {
      for {
        user <- userOpt
      }
      yield user.name
    }
  }

  def lookupUser(id: Int): Either[Error, Option[User]] = {
    if (id <= 0)
      Left(new Error("Id is 0 or -ve"))
    else
      Right(userMap.get(id))
  }

}
