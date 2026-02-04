🧠 TWO POINTERS – DEEP DIVE (INTERVIEW LEVEL)
```
❓ What exactly is Two Pointers?

Two Pointers is an optimization technique where we use two indices to scan data in a single pass, instead of nested loops.

👉 Goal:
Reduce O(n²) → O(n)
Reduce extra space → O(1)

🚨 When should your brain auto-switch to Two Pointers?

Think Two Pointers IMMEDIATELY if you see:

Arrays / Strings

Sorted data

“pair”, “triplet”

Palindrome

Remove / move elements in-place

Compare from both ends

💡 Interview hint:

If brute force uses two loops, try two pointers.

🧩 Types of Two Pointer Patterns (VERY IMPORTANT)
1️⃣ Opposite Direction Pointers
L →           ← R


Used when:

Comparing both ends

Sorted array problems

Palindrome check

Examples:

Palindrome string

Two Sum (sorted)

Container With Most Water

2️⃣ Same Direction (Slow & Fast)
slow → fast →


Used when:

Removing elements

Skipping duplicates

In-place updates

Examples:

Remove duplicates

Move zeros

Remove element

🧠 Interview Thinking Framework (USE THIS ALWAYS)

Before writing code, answer these 5 questions:

Where does pointer1 start?

Where does pointer2 start?

What condition moves pointer1?

What condition moves pointer2?

When do I stop?

If you answer these → code becomes trivial.

🧪 Core Templates
🔹 Opposite Direction Template
int l = 0, r = n - 1;

while (l < r) {
    if (condition) {
        l++;
    } else {
        r--;
    }
}

🔹 Slow–Fast Template
int slow = 0;

for (int fast = 0; fast < n; fast++) {
    if (condition) {
        arr[slow] = arr[fast];
        slow++;
    }
}

❌ Common Interview Mistakes (DON’T DO THESE)

❌ Using extra array when in-place is asked
❌ Forgetting sorted condition
❌ Infinite loop (pointer not moving)
❌ Jumping directly to brute force in interview

🏋️ PRACTICE SET – SOLVE IN THIS ORDER
✅ EASY (5)

Reverse an array

Check if a string is palindrome

Move all zeros to the end

Remove duplicates from sorted array

Find a pair with given sum (sorted array)

⚡ MEDIUM (3)

Two Sum II (sorted array)

Container With Most Water

Remove Element (in-place)

🔥 HARD (2)

Trapping Rain Water

3Sum (unique triplets = 0)
```