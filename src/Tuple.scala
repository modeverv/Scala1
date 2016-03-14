

// Tuple
object Tuple {
  def getMaxValueAndIndex(numbers:List[Int]):(Int,Int,Int) ={
    val max = numbers.max
    val index = numbers.indexOf(max);
    return (max,index,2)
  }
  
  def main(args:Array[String]){
    val numbers = List(1,3,4,44,5,3,3,22,3232,4)
    val maxValue = getMaxValueAndIndex(numbers)
    println(maxValue._1)
    println(maxValue._2)
  }
}