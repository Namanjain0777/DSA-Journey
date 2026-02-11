
## 1. What is Space Complexity?

Space Complexity measures how much memory an algorithm uses relative to the input size.

It includes:
- Input space
- Auxiliary space
---

## 2. Why do we analyze space complexity?

We analyze space complexity to:
- Prevent memory overflow
- Optimize memory usage
- Compare algorithms based on memory efficiency

Interview Line:
Space complexity helps evaluate memory efficiency of an algorithm.

---

## 3. Difference between Space Complexity and Time Complexity

| Time Complexity | Space Complexity |
|-----------------|-----------------|
| Measures execution time | Measures memory usage |
| Related to performance speed | Related to memory consumption |
| Example: O(n), O(log n) | Example: O(n), O(1) |

Interview Line:
Time complexity measures speed, while space complexity measures memory usage.

---

## 4. What is Auxiliary Space?

Auxiliary space is the extra memory used by an algorithm excluding the input.

Example:
Temporary variables, recursion stack, extra arrays.

---

## 5. What is Input Space?

Input space is the memory required to store the input data.

Example:
An array of size n requires O(n) input space.

---

## 6. What does O(1) space complexity mean?

It means the algorithm uses constant memory, regardless of input size.

Example:
Using a few variables only.

---

## 7. What does O(n) space complexity mean?

It means memory usage grows linearly with input size.

Example:
Creating an array of size n.

---

## 8. Is space complexity dependent on hardware?

No.
Space complexity is independent of hardware and measures growth rate, not exact memory bytes.

---

## 9. Why is recursion considered space expensive?

Recursion uses stack memory.
Each recursive call adds a new frame to the call stack.

If recursion depth is n:
Space complexity becomes O(n).

---

## 10. Can an algorithm have O(1) time but O(n) space?

Yes.

Example:
Creating an array of size n instantly.

Example:
int[] arr = new int[n];

Time: O(1)
Space: O(n)

---

## 11. Find the space complexity:

```java
int a = 10;
int b = 20;
int c = a + b;
````

Analysis:
Only three integer variables are used.

Space Complexity:
O(1)

---

## 12. Find the space complexity:

```java
int[] arr = new int[n];
```

Analysis:
An array of size n is created.

Space Complexity:
O(n)

---

## 13. Space complexity of accessing an array element

Example:
arr[5]

No extra memory used.

Space Complexity:
O(1)

---

## 14. Space complexity of printing array elements

Example:
for(int i = 0; i < n; i++){
System.out.println(arr[i]);
}

No extra memory is created.

Space Complexity:
O(1)

---

## 15. Space complexity of swapping two variables

Example:
int temp = a;
a = b;
b = temp;

Only one extra variable used.

Space Complexity:
O(1)

---

# Summary Table

| Operation         | Space Complexity |
| ----------------- | ---------------- |
| Few variables     | O(1)             |
| Array of size n   | O(n)             |
| Recursion depth n | O(n)             |
| Access array      | O(1)             |
| Print array       | O(1)             |
| Swap variables    | O(1)             |

---

End of Space Complexity Answers

```

