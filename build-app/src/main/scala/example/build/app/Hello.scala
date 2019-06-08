package example.build.app

object Hello extends Greeting with App {
  println(greeting)
  example.core.Hello.greeting
}

trait Greeting {
  lazy val greeting: String = "Hi, I'm buildApp!"
}
