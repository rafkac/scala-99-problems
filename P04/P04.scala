package P04

object P04 extends App {

  def length(ls: List[Any]): Any = {
    ls.foldLeft(0)((sum, _) => sum + 1)
  }

  // 6
  println(length(List(1, 1, 2, 3, 5, 8)))
}