package P19

object P19 extends App {

  def rotate(n: Int, ls: List[Char]): List[Char] = n.compare(0).sign match {
    case 0 => ls
    case 1 => rotate(n-1, ls.tail :+ ls. head)
    case -1 => rotate(n+1, ls.last +: ls.dropRight(1))
  }

  // List(d, e, f, g, h, i, j, k, a, b, c)
  println(rotate(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))

  // List(j, k, a, b, c, d, e, f, g, h, i)
  println(rotate(-2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}