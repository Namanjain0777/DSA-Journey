```
1️⃣ What is Two Pointers? (Very Simple)

Two pointers means:

We use two variables (indexes) to look at two positions in a list/string at the same time.

Instead of checking everything one by one (slow), we move pointers smartly (fast).

2️⃣ When do we use Two Pointers?

Use this pattern when:
    You have an array or string
    You need to compare elements
    The array is often sorted (very common)
    Or you need to check something from both ends

🔍 Trigger words in questions:
    “pair”
    “two elements”
    “from start and end”
    “palindrome”
    “sorted array”

3️⃣ Mental Model (IMPORTANT)
Imagine this 👇
Array:  [1, 2, 3, 4, 5]
          ↑           ↑
        left        right

    One pointer starts from left
    One pointer starts from right
    You move them inward based on condition

4️⃣ EASY EXERCISE (Try Yourself First)
🧠 Problem:
Check if a string is a palindrome.
📌 A palindrome reads the same forward and backward.

Examples:
"madam" → ✅ true
"racecar" → ✅ true
"hello" → ❌ false

👉 Think: compare first & last characters, then move inward.

5️⃣ SOLUTION (Explained Line by Line)
```
```java
✅ JavaScript Solution
function isPalindrome(str) {
    let left = 0;                 // start pointer
    let right = str.length - 1;   // end pointer

    while (left < right) {
        if (str[left] !== str[right]) {
            return false;         // mismatch found
        }
        left++;                   // move forward
        right--;                  // move backward
    }

    return true;                  // all matched
}
```
```
🧠 Explanation:
left starts at beginning
right starts at end
Compare characters
If mismatch → not palindrome
If match → move both pointers
Loop ends when they cross

⏱️ Time Complexity: O(n)
📦 Space Complexity: O(1)

6️⃣ VISUAL WALKTHROUGH

Example: "madam"

m a  d  a  m
↑         ↑  match
  ↑     ↑    match
    ↑ ↑      stop

7️⃣ INTERVIEW QUESTION (No Solution – Try It)
❓ Question:

Given a sorted array and a number target,
check if there exist two numbers whose sum equals target.

Example:

arr = [1, 2, 4, 6, 10]
target = 8
Output: true (2 + 6)


👉 Hint:
One pointer at start
One at end
Move based on sum

8️⃣ When NOT to use Two Pointers?
❌ Unsorted array (sometimes still usable, but tricky)
❌ When you need all combinations
❌ When random access is not allowed

```