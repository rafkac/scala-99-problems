package P16

object P16 extends App {

  def drop(n: Int, ls: List[Any]): List[Any] = ls.filter(x => (ls.indexOf(x) + 1) % n != 0)

  // List(a, b, d, e, g, h, j, k)
  println(drop(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}