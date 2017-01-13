/*program to get the nth Fibonacci number*/
class FibonacciSeries
{
  var a=0
  var b=1
  //function to calculate the fibonacci series. The function is taking n as input and an Array containing fibonacci numbers is returned.
 def fibFunction(n:Int):Array[Int]={
   val fibArray = new Array[Int](n)
   fibArray(0)=0
   fibArray(1)=1
   for(i<-2 to n-1)
   {
     val c = a+b         /* the first two numbers are stored at the 0th and 1st index of the array
                             and the third is computed by adding them. This is continued till n.*/
     fibArray(i)=c
     a=b
     b=c
 }
  fibArray
    }
}
object FibonacciTester {
  def main(args: Array[String]) {


    val fibSeries = new FibonacciSeries()
    val fibNewArray = fibSeries.fibFunction(10) // the value of n can be changed here
    for (i<-0 to fibNewArray.length-1) {print(fibNewArray(i)+" ")} //printing the fibonacci series
    println()
    print(s"The Fibonacci Number is ${fibNewArray(9)}") //printing the fibonacci number at n
  }
}