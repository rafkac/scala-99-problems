package P05

object P05 extends App {

  def reverse(ls: List[Any]) = {

    ls.foldLeft(List[Any]())((l, newHead) => newHead :: l)
  }

  // example test
  println(reverse(List(1, 1, 2, 3, 5, 8)))
}
