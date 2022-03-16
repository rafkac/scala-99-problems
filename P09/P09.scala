package P09

object P09 extends App {

  def pack(ls: List[Char]): List[List[Char]] = {
    ls.foldLeft(List(List[Char]()))({ (result, el) =>

      if (result.last.isEmpty) List(List(el))
      else if (result.last.contains(el)) {
        result.dropRight(1) ++ List(result.last :+ el)
      }
      else result :+ List(el)
    })
  }


  // example test
  println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}