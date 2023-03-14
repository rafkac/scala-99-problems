package P23

object P23 extends App {

  def removeAt[A](n: Int, ls: List[A]): (List[A], A) = {
    (ls.filter(x => ls.indexOf(x) != n), ls(n))
  }

  def randomSelect[A](n: Int, ls: List[A]): List[A] = n match {
    case n if n <= 0 => Nil
    case _ =>
      val (rest, e) = removeAt((new util.Random).nextInt(ls.length), ls)
      e :: randomSelect(n - 1, rest)
  }
}