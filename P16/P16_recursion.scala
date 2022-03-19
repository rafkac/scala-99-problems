package P16

object P16_recursion extends App {

  def drop(n: Int, ls: List[Any]): List[Any] = ls.length match {
    case l if l > n => ls.take(n - 1) ++ drop(n, ls.drop(n))
    case _ => ls.take(n)
  }

  // List(a, b, d, e, g, h, j, k)
  println(drop(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}
