package P18

object P18 extends App {

  def slice(i: Int, k: Int, ls: List[Char]): List[Char] =
    ls.filter(x => ls.indexOf(x) >= i && ls.indexOf(x) < k)

  // List(d, e, f, g)
  println(slice(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}