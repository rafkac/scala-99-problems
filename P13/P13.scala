package P13

object P13 extends App {

  def encodeDirect(ls: List[Char]): List[(Int, Char)] = {
    ls.foldLeft(List.empty[(Int, Char)]) ({
      (result, x) =>
            if (result.isEmpty) {
              result :+ (1, x)
            }
            else if (result.last._2 == x) {
              var newList = List.empty[(Int, Char)]
              newList = result.dropRight(1) :+ (result.last._1 + 1, x)
              newList
            }
            else {
              result :+ (1, x)
            }
    })
  }

  // example test
  println(encodeDirect(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}