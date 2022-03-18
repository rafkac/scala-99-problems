package P05

object P05 extends App {

  def reverse(ls: List[Any]) = {

    ls.foldLeft(List.empty[Any])((l, newHead) => newHead :: l)
  }

  // List(8, 5, 3, 2, 1, 1)
  println(reverse(List(1, 1, 2, 3, 5, 8)))
}