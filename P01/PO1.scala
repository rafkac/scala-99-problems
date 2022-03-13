package P01

object PO1 extends App {

  def last(ls: List[Any]): Any = ls.length match {
    case 0 => "invalid input"
    case 1 => ls.head
    case _ => last(ls.tail)
  }

  // example test
  println(last(List(1, 1, 2, 3, 5, 8)))
}