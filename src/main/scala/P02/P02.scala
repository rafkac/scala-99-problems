package P02

object P02 extends App {

  def penultimate(ls: List[Any]): Any = ls.length match {
    case 0 | 1 => "invalid input"
    case 2 => ls.head
    case _ => penultimate(ls.tail)
  }

  // 5
  println(penultimate(List(1, 1, 2, 3, 5, 8)))
}