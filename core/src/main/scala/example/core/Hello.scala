package example.core

object Hello extends Greeting{
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hi, I'm core!"
}
