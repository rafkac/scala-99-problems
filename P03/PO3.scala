package P03

object PO3 extends App {

  def nth(k: Int, ls: List[Any]): Any = k match {
    case x if (x==0 && !ls.isEmpty) => ls.head
    case x if (x>0) => nth(k-1, ls.tail)
    case _ => "Invalid input"
  }

  // example test
  println(nth(2, List(1, 1, 2, 3, 5, 8)))
}