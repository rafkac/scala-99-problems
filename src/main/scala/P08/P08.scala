package P08

object P08 extends App {

  def compress(ls: List[Char]): List[Char] = {

    ls.foldLeft(List[Char]())({ (res, x) =>
      if (res.isEmpty || x != res.last) res :+ x
      else res
    })
  }

  // List(a, b, c, a, d, e)
  println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}