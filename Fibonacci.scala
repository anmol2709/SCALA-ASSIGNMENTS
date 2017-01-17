class FibonacciSeries {

       def fibonacciSeries(n:Int)={


              def innerFib(n:Int,a:Int=0,b:Int=1):Int={
                     n match {
                            case 0=>a
                            case 1=>b
                            case _=> innerFib(n-1,b,a+b)
                     }
              }


              innerFib(n)

       }
}


object Fibonacci {
       def main(args:Array[String]): Unit = {
             val fibObj = new FibonacciSeries()
              print(fibObj.fibonacciSeries(4))
       }
}
