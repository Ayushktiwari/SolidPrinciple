
trait Shape{

  def calculateArea():Double
}

class Rectangle(l:Double, b:Double) extends Shape {
  val length = l
  val width = b

  override def calculateArea: Double = length * width
}

class Circle(r:Double) extends Shape {
  var radius = r

  override def calculateArea: Double = Math.PI * radius * radius
}

object  Test extends  App {
  val rec= new Rectangle(5,6)
  println("Area of rectangle is : = " + rec.calculateArea)

  val cir = new Circle(5)
  println("Area of circle is : = " + cir.calculateArea)
}