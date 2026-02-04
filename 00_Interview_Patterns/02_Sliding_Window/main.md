🧠 SLIDING WINDOW – DEEP DIVE (INTERVIEW LEVEL)
```
❓ What is Sliding Window?

Sliding Window is used to process contiguous subarrays / substrings by maintaining a window and sliding it instead of recalculating everything again and again.

👉 Goal:
Avoid repeated work
Turn O(n²) → O(n)

🚨 When should you think of Sliding Window?

Your brain should auto-trigger Sliding Window when you see:

Subarray / Substring

Contiguous elements

“maximum / minimum / longest / shortest”

“at most K”, “exactly K”

Sum, count, frequency

💡 Interview hint:

If brute force = “check all subarrays” → Sliding Window.

🧩 Types of Sliding Window (VERY IMPORTANT)
1️⃣ Fixed Size Window

Window size is constant (k)

[i ..... j]  size = k


Used when:

Window size is given

Find max/min/sum of k elements

Examples:

Maximum sum subarray of size k

First negative number in every window of size k

2️⃣ Variable Size Window (MOST IMPORTANT 🔥)

Window grows and shrinks based on a condition

i →      j →


Used when:

Longest / shortest subarray

At most / exactly k condition

Examples:

Longest substring without repeating characters

Longest subarray with sum ≤ k

🧠 INTERVIEW THINKING FRAMEWORK (MEMORIZE THIS)

Before coding, answer:

What does my window represent?

When do I expand the window?

When do I shrink the window?

What condition must be satisfied?

When do I update the answer?

If you answer these → you win the interview.

🧪 CORE TEMPLATES
🔹 Fixed Size Window Template
int i = 0, sum = 0;

for (int j = 0; j < n; j++) {
    sum += arr[j];

    if (j - i + 1 == k) {
        // update answer
        sum -= arr[i];
        i++;
    }
}

🔹 Variable Size Window Template
int i = 0;

for (int j = 0; j < n; j++) {
    // add arr[j]

    while (condition is violated) {
        // remove arr[i]
        i++;
    }

    // update answer
}

❌ COMMON MISTAKES (INTERVIEW KILLERS)

❌ Confusing fixed vs variable window
❌ Forgetting to shrink window
❌ Updating answer at wrong time
❌ Using nested loops unnecessarily


```