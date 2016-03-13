

object myProject {
  def main(args: Array[String]) :Unit = {
    if(args.size == 0) {
      val strs = Array("Hello","World")
      output(strs)
    }else {
      printf("Invalid Args")
    }
    // 関数作ってみる
    var calc = (x :Int) => x + 5 : Int
    printf("%s",calc(3))
    
    // クロージャー
    
    
  }
  
  def output(strs : Array[String]) :Unit = {
    for( str <- strs ){
      printf("%s ",str)
    }
    strs.foreach(printf("%s ",_))
  }
  
  def add(x:Int, y:Int) = { x + y /*と var add = (x:Int, y:Int ) => x + y の違い*/  }
}