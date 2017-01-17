object AddLists extends App{
    val srcList1 = List(10, 20, 30)
    val srcList2 = List(1, 2, 3)
  var finalList = List[Int]()
    var sum=0
    for (i <- 0 to srcList1.length - 1) {
      sum = srcList1(i) + srcList2(i)
      finalList = sum :: finalList

    }
  finalList = finalList.reverse
  println(finalList)
  }


