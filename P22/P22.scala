package P22

import scala.sys.exit

object P22 extends App {

  def range(start: Int, end: Int): List[Int] = {
    if (start == end) List[Int](end)
    else if (start < end) List[Int](start) ++ range(start+1, end)
    else {
      println("Error. Start value must be less than end value")
      exit(-1)
    }
  }

  // List(4, 5, 6, 7, 8, 9)
  println(range(4, 9))
}