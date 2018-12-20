package Factorial

/**
  * Created by ZihanZhang on 17/1/20.
  */
class Factorial {
//  val factorial(n:Int) = factorial((n-1):Int) * n
  def factorial(n:Long):Long =
      if (n==0) 1
      else factorial(n-1) * n
}
