## P13. Run-length encoding of a list (direct solution).

- **Category:** working with lists
- **Difficulty:** **

Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like [P09's](https://github.com/rafalkac02/scala-99-problems/tree/main/P10) pack); do all the work directly.

```
Example:
scala> encodeDirect(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
res0: List[(Int, Char)] = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))
```