package P14

object P14 extends App {

  def duplicate(ls: List[Char]):List[Char] = {
    ls.foldLeft(List.empty[Char])((res, x) => res ++ List(x, x))
  }

  // example test
  println(duplicate(List('a', 'b', 'c', 'c', 'd')))
}