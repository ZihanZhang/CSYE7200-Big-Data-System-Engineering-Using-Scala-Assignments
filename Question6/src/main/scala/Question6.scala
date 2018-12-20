import scala.concurrent.ExecutionContext.Implicits.global

import scala.concurrent._

import scala.util._

object Question6 extends App{
  val xs = Seq[Long](34279523L,10082687809L,10777660163L,685720840397L,75838335315389L)

  def factorize(x: Long): Future[(Long,Long)] = ???

  val y: Seq[Future[(Long,Long)]] = for (x <- xs) yield factorize(x)

  val z: Future[Seq[(Long,Long)]] = Future.sequence[(Long,Long),Seq](y)

  print(z)
}