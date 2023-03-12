package P12

object P12 extends App {

  def decode(ls: List[(Int, Char)]) = {
    ls.foldLeft(List.empty[Char])({
      (result, x) => result ++ List.fill(x._1)(x._2)
    })
  }

  // List(a, a, a, a, b, c, c, a, a, d, e, e, e, e)
  println(decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))))
}