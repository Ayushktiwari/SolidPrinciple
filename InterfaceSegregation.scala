
trait Animal{

  def eat()
  def sleep()
}

trait WildAnimal extends Animal {

  def attack()              //  If we created this attack method inside animal trait then
                            // we have to implement it in Dog class also so better to create a seprate trait.
}


class Dog extends Animal{

  override def eat(): Unit = println("Dog is eating")

  override def sleep(): Unit = println("Dog is sleeping")
}

class Lion extends WildAnimal {

  override def eat(): Unit = println("Lion is eating")

  override def sleep(): Unit = println("Lion is sleeping")

  override def attack(): Unit = println("Lion can attack")
}


object InterfaceSegregation extends App{

  val dog= new Dog
  dog.eat()
  dog.sleep()

  val lion= new Lion
  lion.eat()
  lion.sleep()
  lion.attack()
}
