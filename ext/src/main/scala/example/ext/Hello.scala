package example.ext

object Hello extends Greeting {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "Hi, I'm ext!"
}
