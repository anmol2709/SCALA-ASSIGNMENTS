/*program to sum of the digits of the product of numbers from 1 to n*/

class Factorial {
  //function for calculating the factorial
  def factorialFunction(n: Int): Int = {
    var prod = 1
    for (i <- 1 to n) {
      prod = prod * i
    }
    prod
  }

  //function for calculating the sum of digits
  def factSum(n: Int): Int = {
    var remainder=0
    var sum=0
    var number=n
    while (number > 0) {
      remainder = number % 10
      number=number/10
      sum=sum+remainder
    }
sum
  }
}
object FactorialDigitSum {
  def main(args: Array[String]) {
    val factObj = new Factorial()
    val fact = factObj.factorialFunction(6)  //we can change the value of n here. For eg here n=6
   val finalSum=factObj.factSum(fact)
    println(s"Factorial is $fact and Sum is $finalSum")
  }
}
