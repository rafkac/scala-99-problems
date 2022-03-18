## P12. Decode a run-length encoded list.

- **Category:** working with lists
- **Difficulty:** **

Given a run-length code list generated as specified in problem [P10](https://github.com/rafalkac02/scala-99-problems/tree/main/P10), construct its uncompressed version.

```
Example:
scala> decode(List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e')))
res0: List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
```