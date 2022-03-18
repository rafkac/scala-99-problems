package P06

object P06 extends App {

  def isPalindrome(ls: List[Any]) = ls == ls.reverse

  // true
  println(isPalindrome(List(1, 2, 3, 2, 1)))
}