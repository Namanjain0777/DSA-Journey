FAST & SLOW POINTERS 
🧠 Core Idea (ONE LINE)

Use two pointers moving at different speeds to detect patterns like cycles, middle, or repeats.

🐢 Slow pointer → moves 1 step

🐇 Fast pointer → moves 2 steps

🤔 Why does this even work?

Imagine a circular race track 🏃‍♂️🏃‍♂️
If one person runs faster, they will eventually catch up to the slower one.

👉 That’s how we detect cycles.

🚨 When should you think of Fast & Slow Pointers?

Your brain should auto-trigger this pattern when you see:

Linked List

Cycle / Loop

Middle of linked list

Duplicate number

Happy Number

💡 Interview hint:

“If something repeats or loops → Fast & Slow Pointers”

🧩 Where is this pattern used?
1️⃣ Cycle Detection

Linked List has a loop or not

Happy Number

Circular array

2️⃣ Finding Middle Element

Middle of linked list

Split list into two halves

3️⃣ Finding Duplicate

Duplicate number in array (without extra space)

🧠 How to THINK (MOST IMPORTANT)

Before writing code, ask:

Where do slow & fast start?

How fast do they move?

What means “they met”?

What do I do after they meet?

If you answer these → done ✅

🧪 BASIC TEMPLATE (MEMORIZE)
slow = head
fast = head

while (fast != null && fast.next != null) {
    slow = slow.next
    fast = fast.next.next

    if (slow == fast) {
        // cycle exists
    }
}

🔥 Example 1: Detect Cycle in Linked List
Visual:
1 → 2 → 3 → 4 → 5
          ↑       ↓
          ← ← ← ←


Slow moves 1 step

Fast moves 2 steps

If cycle exists → they must meet

Logic:

If fast becomes null → ❌ no cycle

If slow == fast → ✅ cycle exists

🔥 Example 2: Find Middle of Linked List
Why it works:

When fast reaches the end,
slow is automatically at the middle.

while (fast != null && fast.next != null) {
    slow = slow.next
    fast = fast.next.next
}
return slow; // middle

🔥 Example 3: Happy Number (VERY POPULAR)
Idea:

Replace number with sum of squares of digits

If it loops → not happy

If it reaches 1 → happy

Cycle detection = Fast & Slow pointers 😎

❌ Common Mistakes (INTERVIEW FAILS)

❌ Forgetting fast.next != null
❌ Using extra space when not needed
❌ Infinite loop
❌ Not explaining WHY pointers meet