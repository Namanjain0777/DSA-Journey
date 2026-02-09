

## Easy / Basic

1. What is Space Complexity?
2. Why do we analyze space complexity?
3. Difference between space complexity and time complexity.
4. What is auxiliary space?
5. What is input space?
6. What does O(1) space complexity mean?
7. What does O(n) space complexity mean?
8. Is space complexity dependent on hardware?
9. Why is recursion considered space expensive?
10. Can an algorithm have O(1) time but O(n) space?

11. Find the space complexity:
```java
int a = 10;
int b = 20;
int c = a + b;
````

12. Find the space complexity:

```java
int[] arr = new int[n];
```

13. Space complexity of accessing an array element.
14. Space complexity of printing array elements.
15. Space complexity of swapping two variables.

---

## Medium

16. Difference between auxiliary space and total space complexity.

17. Space complexity of iterative vs recursive approach.

18. Why does recursion use extra memory?

19. Space complexity of linear search.

20. Space complexity of binary search (recursive vs iterative).

21. Find the space complexity:

```java
void fun(int n){
    if(n <= 0) return;
    fun(n - 1);
}
```

22. Find the space complexity:

```java
void fun(int n){
    if(n <= 1) return;
    fun(n / 2);
}
```

23. Space complexity of storing input in an array.
24. Space complexity of using HashMap.
25. Space complexity of ArrayList.
26. Space complexity of LinkedList.
27. Space complexity of Stack and Queue implementations.

---

## Hard

28. Why recursive algorithms usually have higher space complexity?
29. Space complexity of Merge Sort.
30. Space complexity of Quick Sort.
31. Why Merge Sort is not in-place?
32. What does in-place algorithm mean?
33. Space complexity of Heap Sort.
34. Space complexity of DFS (recursive).
35. Space complexity of BFS.
36. Space complexity of adjacency list graph representation.
37. Space complexity of adjacency matrix graph representation.
38. Space complexity of storing recursion stack.
39. Space complexity of memoization.
40. Space complexity of tabulation (DP).

---

## Interview Level

41. Difference between in-place and out-of-place algorithms.
42. Why Quick Sort is considered in-place?
43. Space complexity of Java HashMap in worst case.
44. Space complexity of recursion tree.
45. Space complexity of tail recursion.
46. Can tail recursion reduce space complexity?
47. Space complexity of iterative Fibonacci.
48. Space complexity of recursive Fibonacci.
49. Space complexity of using set to remove duplicates.
50. Space complexity of string concatenation.

---

## Difficult / Advanced

51. Find the space complexity:

```java
void fun(int n){
    int[] arr = new int[n];
    if(n <= 1) return;
    fun(n - 1);
}
```

52. Find the space complexity:

```java
void fun(int n){
    if(n <= 1) return;
    fun(n / 2);
    fun(n / 2);
}
```

53. Space complexity of backtracking algorithms.
54. Space complexity of generating all subsets of an array.
55. Space complexity of generating all permutations.
56. Space complexity of N-Queens problem.
57. Space complexity of recursion with multiple calls.
58. Space complexity of storing all subsequences.
59. Space complexity of Trie data structure.
60. Space complexity of segment tree.

---

## Tricky / Real Interview

61. Can space complexity be optimized without changing time complexity?
62. When is higher space complexity acceptable?
63. Why space-time tradeoff is important?
64. Can an algorithm have constant auxiliary space but linear total space?
65. Space complexity of static variables.
66. Space complexity of global variables.
67. Space complexity of function call stack.
68. Space complexity of iterative deepening DFS.
69. Space complexity of memoized recursion vs plain recursion.
70. Space complexity of dynamic programming solutions.

---

## Final Boss

71. Convert a recursive solution to reduce space complexity.
72. Identify unnecessary memory usage in an algorithm.
73. Optimize space complexity from O(n) to O(1).
74. Compare space usage of two given algorithms.
75. Explain space complexity using recursion stack diagram.

