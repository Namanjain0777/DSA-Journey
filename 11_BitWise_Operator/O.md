# BIT MANIPULATION – COMPLETE INTERVIEW NOTES

Bit Manipulation deals with **binary representation of numbers** and performing
operations at the **bit level** for speed and optimization.

---

## 🧠 WHY BIT MANIPULATION?
- Faster than arithmetic operations
- Uses less memory
- Common in **DSA, system design, OS, compilers**
- Frequently asked in **coding interviews**

---

## 🔢 Binary Basics
- Decimal → Binary  
  `5  = 101`  
  `10 = 1010`
- Each bit represents a power of 2

---

# 🔹 BITWISE OPERATORS

---

## 1️⃣ AND (`&`)

### Truth Table
| A | B | A & B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   0   |
| 1 | 0 |   0   |
| 1 | 1 |   1   |

### Internal Working
```
5 = 101
3 = 011
& 001 → 1
```

### When to Use
- Check if a bit is set
- Check **even / odd**
- Masking bits

### Interview Tricks
```java
// check odd/even
(n & 1) == 1  → odd
(n & 1) == 0  → even
```
2️⃣ OR (|)

Truth Table
```
A	B	A | B
0	0	0
0	1	1
1	0	1
1	1	1
```
Internal Working
```
5  = 101
3  = 011
---------
|    111 → 7
```
When to Use
```
Set a specific bit

Combine flags
```
Interview Trick
```
// set ith bit
n | (1 << i)
```
3️⃣ XOR (^) ⭐ VERY IMPORTANT

Truth Table
```
A	B	A ^ B
0	0	0
0	1	1
1	0	1
1	1	0
```
Key Properties
```
x ^ x = 0

x ^ 0 = x

XOR is reversible
```
Internal Working
```
5  = 101
3  = 011
---------
^    110 → 6
```
When to Use
```
Find unique element

Swap numbers without temp

Toggle bits
```
Interview Gold
```
// find unique element
ans = 0;
for(int x : arr) ans ^= x;
```
4️⃣ NOT (~)
```
Meaning
Flips all bits (1 → 0, 0 → 1)
```
Internal Working
```
5 = 00000101
~5= 11111010 → -6 (2’s complement)
```
Interview Note
```
~n = -(n + 1)
```
5️⃣ LEFT SHIFT (<<)
```
Meaning
Shift bits left, fill with 0

5 << 1
101 → 1010 → 10
```
Rule
```
n << k = n * (2^k)
```
When to Use
```
Fast multiplication

Bit masking
```
6️⃣ RIGHT SHIFT (>>)
```
Meaning
Shift bits right, keeps sign bit
```
```
10 >> 1
1010 → 0101 → 5
```
Rule
```
n >> k = n / (2^k)
```
7️⃣ UNSIGNED RIGHT SHIFT (>>>) (Java)
```
Shifts right

Fills with 0 (no sign)
```
When to Use
```
Handling negative numbers safely
```
🔥 IMPORTANT BIT TRICKS (INTERVIEW FAVORITES)
```
🔹 Check if number is power of 2
(n & (n - 1)) == 0
🔹 Count set bits (Brian Kernighan)
count = 0;
while(n > 0){
    n = n & (n - 1);
    count++;
}
🔹 Get ith bit
(n >> i) & 1
🔹 Set ith bit
n | (1 << i)
🔹 Clear ith bit
n & ~(1 << i)
🔹 Toggle ith bit
n ^ (1 << i)
🔹 Clear lowest set bit
n & (n - 1)
🔹 Isolate lowest set bit
n & (-n)
```
🧠 INTERNAL WORKING (2’s COMPLEMENT)
```
Why negative numbers work
Stored using 2’s complement

MSB is sign bit

~n + 1 gives -n
```
```
⚠️ COMMON MISTAKES
Confusing & and &&

Forgetting operator precedence

Infinite loops in right shift for negatives

Not using parentheses:
❌ n & 1 == 0
✅ (n & 1) == 0
```
🎯 INTERVIEW QUESTIONS BASED ON BITS
```
Find single number
Find two unique numbers
Count set bits
Check power of 2
Subsets using bitmask
Reverse bits
XOR from 1 to N
Missing number using XOR
```
🏆 INTERVIEW ONE-LINERS
```
AND is used for masking
OR is used for setting bits
XOR is used for uniqueness
Left shift = multiply by 2
Right shift = divide by 2
```

# 🔢 Negative Binary Numbers & Range of Numbers (Interview Notes)

These concepts are **core fundamentals** behind:
- Bit manipulation
- Integer overflow
- System-level programming
- Java / C / C++ internals

Interviewers LOVE these topics.

---

## 🧠 WHY NEGATIVE NUMBERS ARE TRICKY IN BINARY

Binary has only:
- `0`
- `1`

So computers need a **special representation** to store **negative numbers**.

👉 This is done using **2’s Complement**.

---

# 🔹 REPRESENTATION OF NEGATIVE NUMBERS

There are **3 methods** (but only ONE is used in real systems):

---

## 1️⃣ Sign Magnitude (❌ NOT USED)

- MSB (Most Significant Bit) = sign
- `0` → positive
- `1` → negative

### Example (8-bit)
+5 → 00000101
-5 → 10000101


❌ Problems:
- Two zeros (+0 and -0)
- Arithmetic is complex

---

## 2️⃣ One’s Complement (❌ NOT USED)

- Invert all bits

### Example
+5 = 00000101
-5 = 11111010


❌ Problems:
- Two zeros again
- Extra correction needed

---

## 3️⃣ Two’s Complement (✅ USED EVERYWHERE)

### Steps to find negative number:
1. Convert number to binary
2. Take 1’s complement (invert bits)
3. Add 1

### Example: `-5` (8-bit)
+5 = 00000101
~5 = 11111010
+1 = 11111011 → -5


---

## ✅ WHY 2’s COMPLEMENT IS USED

✔ Only **one zero**
✔ Addition & subtraction work naturally
✔ Hardware-friendly
✔ Used in **Java, C, C++, Python**

---

## 🔥 MOST IMPORTANT FORMULA (INTERVIEW GOLD)

```text
~n = -(n + 1)
Example:

~5 = -(5 + 1) = -6
```
🔹 HOW TO IDENTIFY NEGATIVE NUMBER IN BINARY
```
MSB = 1 → Negative

MSB = 0 → Positive

Example (8-bit):

10000001 → negative
01111111 → positive
```
🔹 RANGE OF NUMBERS (VERY IMPORTANT)
```
Range depends on number of bits.
```
📌 GENERAL FORMULA (2’s COMPLEMENT)
```
For n bits:

Minimum = -2^(n-1)
Maximum =  2^(n-1) - 1
```
🔢 EXAMPLES
```
🔹 4-bit number
Min = -2^3 = -8
Max =  2^3 - 1 = 7
Range: -8 to +7
Binary:

1000 → -8
0111 → +7
```
🔹 8-bit number
```
Min = -128
Max = +127
Range: -128 to +127
```
🔹 16-bit number
```
Min = -32768
Max = +32767
```
🔹 32-bit number (Java int)
```
Min = -2^31
Max =  2^31 - 1
Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE =  2147483647
```
🔹 64-bit number (Java long)
```
Min = -2^63
Max =  2^63 - 1
```
🔹 FORMULA TO CALCULATE RANGE (SUMMARY)
```
Bits	Min	Max
n	-2^(n-1)	2^(n-1) - 1
```
🔹 WHY POSITIVE RANGE IS SMALLER?
```
Because:
1 bit is reserved for sign
Zero must exist

That’s why:
Range is asymmetric
Example (8-bit):
-128 to +127
```
🔥 INTERVIEW TRAPS (VERY IMPORTANT)
```
❌ Wrong assumption
8-bit range = -127 to +128 ❌
✅ Correct
8-bit range = -128 to +127
```
⚠️ OVERFLOW EXAMPLE (INTERVIEW FAVORITE)
```
int x = Integer.MAX_VALUE;
x = x + 1;
System.out.println(x);
Output:
-2147483648
👉 This happens due to 2’s complement overflow.
```
🔹 HOW NEGATIVE NUMBERS ADD WORK
```
Example:
5  = 00000101
-5 = 11111011
-------------
Sum= 00000000
✔ No special subtraction logic required
✔ Hardware handles it naturally
```
🧠 INTERVIEW ONE-LINERS (MEMORIZE)
```
“Computers store negative numbers using 2’s complement”
“Range of n-bit integer is -2^(n-1) to 2^(n-1)-1”
“Overflow wraps around in 2’s complement”
“MSB determines the sign”
```