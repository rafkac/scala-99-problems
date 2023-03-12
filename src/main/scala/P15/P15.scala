package P15

object P15 extends App {

  def duplicateN(n: Int, ls: List[Any]): List[Any] = ls.flatMap(x => List.fill(n)(x))

  // List(a, a, a, b, b, b, c, c, c, c, c, c, d, d, d)
  println(duplicateN(3, List('a', 'b', 'c', 'c', 'd')))
}