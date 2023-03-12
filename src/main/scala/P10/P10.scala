package P10

// using pack() function from P09
import P09.P09.pack

object P10 extends App{

  def encode(ls: List[Char]): List[Any] = {
    pack(ls).foldLeft(List.empty[(Int, Char)]) ({
      (result, x) => result :+ (x.size, x.head)
    })
  }

  // List((4,a), (1,b), (2,c), (2,a), (1,d), (4,e))
  println(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}