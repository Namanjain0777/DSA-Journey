

## Easy / Basic

1. What is Time Complexity?
2. Why do we use Time Complexity instead of execution time?
3. What is Big-O notation?
4. What is the difference between Time Complexity and Space Complexity?
5. What are best case, average case, and worst case?
6. What does O(1) represent?
7. What does O(n) represent?
8. When does O(n²) occur?
9. Is Big-O dependent on hardware or programming language?
10. Why are constants ignored in Big-O notation?
11. Find the time complexity:
```java
for(int i = 0; i < n; i++){
    System.out.println(i);
}
````

12. Find the time complexity:

```java
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        System.out.println(i + j);
    }
}
```

13. What is the time complexity of accessing an array element?
14. What is the time complexity of printing all elements of an array?
15. What is the time complexity of checking if an array is empty?

---

## Medium

16. What is the difference between O(n) and O(log n)?
17. Why is O(log n) faster than O(n)?
18. What is logarithmic time complexity?
19. Why is binary search O(log n)?
20. Can two algorithms have the same Big-O but different execution times?
21. Find the time complexity:

```java
for(int i = 1; i <= n; i = i * 2){
    System.out.println(i);
}
```

22. Find the time complexity:

```java
for(int i = 0; i < n; i++){
    for(int j = i; j < n; j++){
        System.out.println(i + j);
    }
}
```

23. Find the time complexity:

```java
void fun(int n){
    if(n <= 1) return;
    fun(n - 1);
}
```

24. Find the time complexity:

```java
void fun(int n){
    if(n <= 1) return;
    fun(n / 2);
}
```

25. What is the time complexity of linear search?
26. What is the time complexity of binary search?
27. What is the time complexity of finding the maximum element in an array?

---

## Hard

28. What is amortized time complexity?
29. What is the difference between worst case and amortized analysis?
30. Why is HashMap O(1) on average but O(n) in the worst case?
31. What is the difference between Big-O, Big-Theta, and Big-Omega?
32. Why is average case analysis difficult?
33. Find the time complexity:

```java
for(int i = 0; i < n; i++){
    for(int j = 1; j < n; j = j * 2){
        System.out.println(i + j);
    }
}
```

34. Find the time complexity:

```java
void fun(int n){
    if(n <= 1) return;
    fun(n - 1);
    fun(n - 1);
}
```

35. Find the time complexity:

```java
void fun(int n){
    if(n <= 1) return;
    fun(n / 2);
    fun(n / 2);
}
```

36. What is the time complexity of Merge Sort?
37. What is the time complexity of Quick Sort (best, average, worst)?
38. What is the time complexity of Heap Sort?
39. What is the time complexity of insertion in a heap?
40. What is the time complexity of BFS and DFS?

---

## Interview Level

41. Why is Quick Sort preferred over Merge Sort in practice?
42. Why can’t binary search be applied to an unsorted array?
43. Why is O(n log n) considered efficient?
44. Can an algorithm be faster than O(1)?
45. Why does recursion increase space complexity?
46. Why are lower-order terms ignored in Big-O?
47. Is O(2n) the same as O(n)? Explain.
48. What is the time complexity of Java HashMap operations?
49. What is the time complexity of ArrayList add and remove?
50. What is the time complexity of LinkedList operations?

---

## Difficult / Advanced

51. Solve the recurrence relation: T(n) = T(n - 1) + 1
52. Solve the recurrence relation: T(n) = T(n / 2) + 1
53. Solve the recurrence relation: T(n) = 2T(n / 2) + n
54. Find the time complexity:

```java
for(int i = 0; i < n; i++){
    for(int j = 0; j < i; j++){
        for(int k = 0; k < j; k++){
            System.out.println(i + j + k);
        }
    }
}
```

55. What is the time complexity of recursive Fibonacci?
56. Why does Dynamic Programming reduce time complexity?
57. What is the time complexity of backtracking algorithms?
58. What is the time complexity of generating all subsets of an array?
59. What is the time complexity of generating all permutations?
60. What is the time complexity of checking palindrome recursively?

---

## Tricky / Real Interview

61. Can time complexity change based on input distribution?
62. When is average case more important than worst case?
63. Why is quicksort worst case rare?
64. Can nested loops ever be O(n)?
65. Compare time complexity:

```java
while(n > 0) n--;
```

vs

```java
while(n > 0) n /= 2;
```

66. What is the time complexity of matrix traversal?
67. What is the time complexity of graph representation using adjacency list vs adjacency matrix?
68. Why is space-time tradeoff important?
69. What is the time complexity of string concatenation inside a loop?
70. What is the time complexity of recursion stack memory?

---

## Final Boss

71. Derive the exact time complexity expression from given code.
72. Convert a time complexity expression into Big-O notation.
73. Optimize an O(n²) solution to O(n).
74. Identify the bottleneck in a given algorithm.
75. Explain time complexity using the recursion tree method.


