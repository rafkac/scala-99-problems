package P20

object P20 extends App {

  def removeAt[A](n: Int, ls: List[A]): (List[A], A) = {
    (ls.filter(x => ls.indexOf(x) != n), ls(n))
  }

  // (List(a, c, d),b)
  println(removeAt(1, List('a', 'b', 'c', 'd')))
}