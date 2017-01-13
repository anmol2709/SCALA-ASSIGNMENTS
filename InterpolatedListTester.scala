/*Program Using String Interpolation and a List.*/
class InterpolatedList {
  val sourceList = List(10,20,30,40)
}

object InterpolatedListTester{
  def main(args: Array[String]){
    val srcObj = new InterpolatedList()
    for(i<-0 to srcObj.sourceList.length-1){ //for loop will begin from 0 till the length of the list
      println(s"$i = ${srcObj.sourceList(i)}")  //string interpolator 's' is used to print the output
    }
  }
}
