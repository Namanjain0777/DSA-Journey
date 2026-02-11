## 1. What is Time Complexity?
Time Complexity measures how the running time of an algorithm grows as the input size increases.

## 2. Why do we use Time Complexity instead of execution time?
Execution time depends on hardware, compiler, and system, while time complexity gives a machine-independent measure of algorithm efficiency.

## 3. What is Big-O notation?
Big-O notation represents the upper bound (worst-case growth rate) of an algorithm’s time complexity.

## 4. What is the difference between Time Complexity and Space Complexity?
Time Complexity → Measures how runtime grows with input size

Space Complexity → Measures how memory usage grows with input size

## 5. What are best case, average case, and worst case?
Best Case → Minimum time taken for ideal input

Average Case → Expected time for random input

Worst Case → Maximum time taken for worst input
## 6. What does O(1) represent?
Constant time — execution time does not depend on input size.

## 7. What does O(n) represent?
Linear time — runtime increases directly proportional to input size.

## 8. When does O(n²) occur?
When we use nested loops over the same input size.

## 9. Is Big-O dependent on hardware or programming language?
No. Big-O is independent of hardware, compiler, or programming language.

## 10. Why are constants ignored in Big-O notation?
As input grows very large, constants have negligible impact compared to growth rate.

## 11. Find the time complexity:
```java
for(int i = 0; i < n; i++){
    System.out.println(i);
}
````
O(n)


## 12. Find the time complexity:

```java
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        System.out.println(i + j);
    }
}
```
O(n²)

## 13. What is the time complexity of accessing an array element?
O(1)

## 14. What is the time complexity of printing all elements of an array?
O(n)

## 15. What is the time complexity of checking if an array is empty?
O(1)
---