//Program to find the maximum element from list.
class MaxListElement{
//function to find the maximum element in the list
  def max(srcList:List[Int]) : Int={
     var maxElement = srcList(0)
    for(i<-1 to srcList.length-1)
      {
        if(maxElement<srcList(i)) {
          maxElement = srcList(i)
        }
      }
    maxElement
  }
}
object MaxListElementTester {
def main(args:Array[String]){
  val srcList = List(1,5,2,9,7)
val srcObj = new MaxListElement()
  val maxEl= srcObj.max(srcList)
  println(maxEl)//printing the maximum element
}
}
