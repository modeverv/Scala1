
object myProject {
  def main(args: Array[String]) :Unit = {
    if(args.size == 0) {
      val strs = Array("Hello","World")
      output(strs)
    }else {
      printf("Invalid Args")
    }
    
    // 2.関数作ってみる
    var calc = (x :Int) => x + 5 : Int
    printf("%s",calc(3))

    println()
    
    // 3.クロージャー
    val candidates = List(1,2,3,4,5)
    var filter = (predicate :Int => Boolean ) => {
      (candidates :List[Int]) => {
        for(x <- candidates; if predicate(x)) yield x
      }
    }
    val predicate = (x:Int) => x % 2 == 0
    var oddFilter = filter(predicate)
    oddFilter(candidates).foreach(println)
    
    // 4.オブジェクト指向
    val user1 = new User(1, "源次", "富樫", new FullnameInJapan)
    println(user1.getFullname())

    val user2 = new User(2, "鯛雄", "松尾")
    println(user2.getFullname())
    
  }
  
  def output(strs : Array[String]) :Unit = {
    for( str <- strs ){
      printf("%s ",str)
    }
    strs.foreach(printf("%s ",_))
  }
  
  def add(x:Int, y:Int) = { x + y /*と var add = (x:Int, y:Int ) => x + y の違い*/  }
}

class User(val id: Long, val firstname: String, val lastname: String, val fullname:Fullname = new Fullname) {
  def getFullname() = this.fullname.get(firstname, lastname)
}

class Fullname() {
  def get(firstname: String, lastname: String) = firstname + " " + lastname
}

class FullnameInJapan() extends Fullname {
  override def get(firstname: String, lastname: String) = lastname + " " + firstname
}

