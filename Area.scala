class CalculateArea
{
  def area(shape:String,a:Int , b:Int,f:(Int,Int)=>Int ):String=
  {
    shape match {
      case "Rhombus"=>s"Area is ${f(a,b)}"
      case "Rectangle"=>s"Area is ${f(a,b)}"
      case "Parallelogram"=>s"Area is ${f(a,b)}"
      case _ => "Case not defined"
    }
  }
}
object Area {
  def main(args: Array[String]) {
    val calculateAreaObj = new CalculateArea()
    val areaRhombus = calculateAreaObj.area("Rhombus",5,4,(a,b)=>a*b)
    val areaRectangle = calculateAreaObj.area("Rectangle",5,4,(a,b)=>a*b)
    val areaParallelogram = calculateAreaObj.area("Parallelogram",5,4,(a,b)=>(a*b)/2)
    val areaSquare = calculateAreaObj.area("Square",5,4,(a,b)=>a*b)
    println(areaRhombus)
    println(areaRectangle)
    println(areaParallelogram)
    println(areaSquare)
  }
}
