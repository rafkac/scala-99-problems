## P10. Run-length encoding of a list.

- **Category:** working with lists
- **Difficulty:** *

Use the result of problem [P09](https://github.com/rafalkac02/scala-99-problems/tree/main/P09) to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

```
Example:
scala> encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
res0: List[(Int, Char)] = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))
```