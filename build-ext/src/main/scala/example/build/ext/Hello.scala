package example.build.ext

object Hello extends Greeting with App {
  println(greeting)
  example.core.Hello.greeting
  example.ext.Hello.greeting
}

trait Greeting {
  lazy val greeting: String = "Hi, I'm buildExt!"
}
