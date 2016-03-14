
object Trait1 {
  def main(args:Array[String]){
    val man = new Man("名前","男塾","一回生")
    man.say()
  }
}

trait Human {
  val name = "飛行機"
 
  def say() = {
    println(s"My name is ${name}")
  }
}
trait Job {
  val job:String
}
trait Grade {
  val grade:String
}

class Man(n:String,j:String,g:String) 
  extends Human with Job with Grade {
  override val name = n
  val job = j
  val grade = g
  
  override def say():Unit = {
    println(s"名前は ${name} じゃ ${job} じゃ ${grade} じゃ")    
  }
}
  