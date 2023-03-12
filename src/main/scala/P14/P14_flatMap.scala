// Alternative solution

package P14

object P14_flatMap {

  def duplicate(ls: List[Char]): List[Char] = ls.flatMap(x => List(x, x))

  // List(a, a, b, b, c, c, c, c, d, d)
  println(duplicate(List('a', 'b', 'c', 'c', 'd')))
}