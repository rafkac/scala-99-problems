package P06

object P06 extends App {

  def isPalindrome(ls: List[Int]): Boolean = ls == ls.reverse

  // example test
  println(isPalindrome(List(1, 2, 3, 2, 1)))
}