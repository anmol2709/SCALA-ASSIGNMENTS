class DList{

  def doubleElements(srcList:List[Int]) = srcList map(el => el*2)

}

object DoubleList {
  def main(args: Array[String]) {
val dListObj = new DList()
    val srcList = List(1,2,3)
    val finalList = dListObj.doubleElements(srcList)
  println(finalList)
  }
}
