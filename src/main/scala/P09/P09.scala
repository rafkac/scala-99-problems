package P09

object P09 extends App {

  def pack(ls: List[Char]): List[List[Char]] = {
    ls.foldLeft(List(List[Char]()))({ (result, x) =>

      if (result.last.isEmpty) List(List(x))
      else if (result.last.contains(x)) {
        result.dropRight(1) ++ List(result.last :+ x)
      }
      else result :+ List(x)
    })
  }

  // List(List(a, a, a, a), List(b), List(c, c), List(a, a), List(d), List(e, e, e, e))
  println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}