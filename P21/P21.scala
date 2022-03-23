package P21

object P21 extends App {

  def insertAt(x: String, n: Int, ls: List[String]) = {
    (ls.take(n) :+ x) ++ ls.drop(n)
  }

  // List(a, new, b, c, d)
  println(insertAt("new", 1, List("a", "b", "c", "d")))
}