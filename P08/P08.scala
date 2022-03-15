package P08

object P08 extends App{


  def compress(ls: List[Char]): List[Char] = {
    var result = List[Char]()
    for (el <- ls) {
      if (result.isEmpty || el != result.last) {
        result = result :+ el
      }
    }
    result
  }

  // example test
  val myList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
  println(compress(myList))

}
