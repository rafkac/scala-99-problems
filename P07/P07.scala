package P07

object P07 extends App {

  def flatten(myList: List[Any]): List[Int] = {
    myList.foldLeft(List[Int]()) { (result, el) =>
      el match {
        case i: Int => result :+ i  // if element is an Int -> append list
        case ls: List[_] => result ++ flatten(ls)    // if element is a list -> go deeper
      }
    }
  }

  // example test
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}
