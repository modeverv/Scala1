
/**
 * コンパニオンオブジェクト
 * 互いにprivateにアクセス可能
 */
object Car {
  def main(args:Array[String]){
    var car = new Car("blue")
    car.run
    
    val truck = new Truck("red")
    truck.run
    
    out(car)
    out(truck)
  }
  private def output(mes:String):Unit = println(mes)
  def out(car:Car):Unit = println(car.color)
}

/**
 * コンパニオンクラス
 * 互いにprivateにアクセス可能
 */
class Car(val color:String){
  def run = Car.output("rrrrrun" + color)
}
/**
 * 継承
 */
class Truck(color:String) extends Car(color){
  override def run = println("Truck Start!!!")
}
