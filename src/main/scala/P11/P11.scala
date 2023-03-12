package P11

// using pack() function from P09
import P09.P09.pack

object P11 extends App {

  def encodeModified(ls: List[Char]): List[Any] = {
    pack(ls).foldLeft(List[Any]()) ({
      (result, i) => i.size match {
        case 1 => result :+ i.head
        case _ => result :+ (i.size, i.head)
      }
    })
  }

  // List((4,a), b, (2,c), (2,a), d, (4,e))
  println(encodeModified(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}