package playground

import java.time.LocalDateTime
import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.impl.Promise
import scala.util.{Failure, Success, Try}

object FutureMain extends App {

  def divFun(num: Int, denom: Int) = if (denom != 0) num / denom else throw new RuntimeException("Div by ZERO")

  private val triedInt: Try[Int] = Try(divFun(10, 4))
  private val triedInt2: Try[Int] = Try(divFun(10, 0))

  triedInt2 match {
    case Success(value) => println(s"SUCCESS : ${value}")
    case Failure(exception) => println(s"FAILED : $exception")
  }

  def highlyComputationIntensiveTask = Future {

    TimeUnit.SECONDS.sleep(1)
    43
  }

  private val eventualString: Future[Int] = for {
    x <- highlyComputationIntensiveTask
    y <- Future(x.toString)
  } yield  (x + y).length


}
