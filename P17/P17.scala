package P17

object P17 extends App {

  def split(n: Int, ls: List[Char]): (List[Char], List[Char]) = {
    (ls.take(n), ls.drop(n))
  }

  // (List(a, b, c),List(d, e, f, g, h, i, j, k))
  println(split(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}