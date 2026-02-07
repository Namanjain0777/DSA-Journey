# 🧠 Bitwise Operators – Complete Practice Roadmap (Java / DSA)

## How to Practice (Recommended)
- Do **5–6 questions/day**
- Write **code + 1–2 line explanation**
- Always note **Time & Space Complexity**
- First practice with **pen & paper (binary form)**

---

## 🟢 EASY LEVEL (Warm-up) – Bitwise Basics

### Understanding Operators
1. Explain AND (`&`) with truth table.
2. Explain OR (`|`) with truth table.
3. Explain XOR (`^`) with truth table.
4. Explain NOT (`~`) with examples.
5. Difference between:
   - Bitwise AND (`&`)
   - Logical AND (`&&`)
6. Difference between:
   - Bitwise OR (`|`)
   - Logical OR (`||`)
7. Left Shift (`<<`) – how it works.
8. Right Shift (`>>`) – how it works.
9. Unsigned Right Shift (`>>>`) – how it works.
10. Convert decimal number to binary.
11. Convert binary number to decimal.

---

### Simple Coding Problems
12. Check if a number is **even or odd** using bitwise.
13. Multiply a number by 2 using bitwise.
14. Divide a number by 2 using bitwise.
15. Swap two numbers without using temp variable.
16. Check if a number is positive or negative.
17. Find the least significant bit (LSB).
18. Find the most significant bit (MSB).

---

## 🟡 MEDIUM LEVEL (Logic + Patterns)

### Core Bit Manipulation
19. Check if a number is a power of 2.
20. Count number of set bits (1s) in a number.
21. Count number of unset bits.
22. Turn ON a specific bit.
23. Turn OFF a specific bit.
24. Toggle a specific bit.
25. Check if a specific bit is set.
26. Clear the lowest set bit.
27. Find position of the only set bit.
28. Find number of bits required to represent a number.
29. Check if two numbers have opposite signs.
30. Find XOR of numbers from 1 to N.

---

### Array-Based Bitwise Problems
31. Find the element that appears **once** (others appear twice).
32. Find the element that appears **once** (others appear thrice).
33. Find two non-repeating elements in an array.
34. Find missing number using XOR.
35. Find duplicate number using XOR.
36. XOR of all subarrays.
37. Find subset XOR totals.

---

## 🔴 INTERVIEW LEVEL (🔥 MUST-DO)

### Advanced Bitwise Concepts
38. Why XOR is used to find unique elements?
39. Difference between `>>` and `>>>`.
40. Why left shift is faster than multiplication?
41. Why bitwise operations are faster than arithmetic?
42. Find the rightmost set bit using bitwise.
43. Brian Kernighan’s Algorithm (count set bits).
44. Check if a number is power of 4.
45. Reverse bits of a number.
46. Find complement of a number.

---

### Bitmasking (VERY IMPORTANT)
47. Generate all subsets using bitmasking.
48. Check if a character is lowercase/uppercase using bitwise.
49. Toggle case of a character using bitwise.
50. Find day of week using bitmasking.
51. Solve problems using bitmask DP (intro).

---

## ⭐ BONUS (Top Interview Favorites)

### Conceptual Questions
52. Difference between:
    - Arithmetic shift
    - Logical shift
53. Why XOR of a number with itself is zero?
54. Why XOR with zero gives the same number?
55. Can bitwise operators be used on floating numbers? Why not?
56. Why bitwise NOT gives negative values?
57. Two’s complement representation explained.
58. How negative numbers are stored in binary.
59. Explain signed vs unsigned numbers.
60. When should bit manipulation be avoided?

---

## 🧠 Pattern Recognition (VERY IMPORTANT)

- **Odd / Even** → `n & 1`
- **Power of 2** → `n & (n - 1)`
- **Unique element** → XOR
- **Turn OFF bit** → `n & ~(1 << k)`
- **Turn ON bit** → `n | (1 << k)`
- **Toggle bit** → `n ^ (1 << k)`
- **Clear lowest set bit** → `n & (n - 1)`

---

## 🧪 Practice Strategy (BEST WAY)

1. Always write number in **binary**
2. Apply operation bit by bit
3. Convert back to decimal
4. Then write code

---

## 🎯 Final Goal

By the end of this list, you should be able to:
- Solve bit manipulation interview problems confidently
- Recognize patterns instantly
- Optimize brute force solutions using bits

