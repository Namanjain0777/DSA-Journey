
1️⃣ What is Sliding Window? (Super Simple)
```
Sliding Window means:

    We look at a small part (window) of the array/string,
    then slide that window instead of recomputing everything again.

Think of a window moving over data.
```
2️⃣ Why do we need Sliding Window?
```
Without sliding window, we do:
    Nested loops ❌
    Recalculate sums again & again ❌
    Time complexity becomes O(n²) ❌
With sliding window:
    Single loop ✅
    Reuse previous work ✅
    Time complexity O(n) ✅
```
3️⃣ When to Use Sliding Window?
```
Use this pattern when you see:
“subarray”
“substring”
“contiguous”
“window of size k”
“maximum / minimum / longest / shortest”
```
🧠 Keyword = contiguous


4️⃣ Types of Sliding Window
```
There are 2 types (very important):

A) Fixed Size Window
    Window size is given (k)

B) Variable Size Window
    Window size changes based on condition
```
5️⃣ FIXED SIZE SLIDING WINDOW (Start Here)
```
🧠 Problem:
Find the maximum sum of subarray of size k.

Example:
arr = [2, 1, 5, 1, 3, 2]
k = 3
Output: 9  → [5,1,3]

❌ Brute Force (Don’t Do This)

Check all subarrays → slow (O(n²))

✅ Sliding Window Idea
Calculate sum of first k elements
Slide window:
    subtract element going out
    add element coming in
```
6️⃣ SOLUTION (Line-by-Line)
```
✅ JavaScript Code
function maxSumSubarray(arr, k) {
    let windowSum = 0;
    let maxSum = 0;

    for (let i = 0; i < k; i++) {
        windowSum += arr[i];  // initial window sum
    }

    maxSum = windowSum;

    for (let i = k; i < arr.length; i++) {
        windowSum = windowSum - arr[i - k] + arr[i];
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}
```
🧠 Explanation
```
First loop → sum of first window
Second loop:
    remove left element
    add right element
Keep track of max
```
⏱️ Time: O(n)
📦 Space: O(1)

7️⃣ VISUAL EXPLANATION
```
[2, 1, 5] 1 3 2 → sum = 8
  2 [1, 5, 1] 3 2 → sum = 7
    2 1 [5, 1, 3] 2 → sum = 9 ✅
```
8️⃣ EASY EXERCISE (Try Yourself)
```
❓ Question:
Find the minimum sum subarray of size k.
Example:
arr = [3, 4, 1, 1, 6]
k = 2
Output: 2  → [1,1]

👉 Hint: same logic, change max to min
```
9️⃣ INTERVIEW QUESTION (No Solution)
```
❓ Question:
Find the maximum average subarray of size k.
🔥 QUICK CHECK (Answer in your head)
If question says:
    “Longest substring with…”
    “Smallest subarray with…”

➡️ Sliding Window (Variable Size)

```