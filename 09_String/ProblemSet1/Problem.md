# How to Practice (Recommended)
```
Do 5–7 questions/day
Write code + explain logic in 1–2 lines
```

🟢 EASY LEVEL (Warm-up)
Strings
```
Check if two strings are equal using equals().
Check if two strings point to the same object using ==.
Find the length of a string without using .length() (loop).
Print all characters of a string using charAt().
Convert a string to uppercase and lowercase.
Count the number of vowels in a string.
Reverse a string using:
    StringBuilder
Check if a string is empty or null safely.
```
StringBuilder / StringBuffer
```
Append multiple strings using StringBuilder.
Reverse a string using StringBuffer.
Insert a substring at a given index using StringBuilder.
Delete a portion of a string using StringBuilder.
Convert StringBuilder to String.
```
BigInteger / BigDecimal
```
Add two very large numbers using BigInteger.
Multiply two large numbers using BigInteger.
Convert BigInteger to int.
Add two decimal numbers accurately using BigDecimal.
```
# Done till this
🟡 MEDIUM LEVEL (Logic + Concept)
Strings
```
Check if a string is a palindrome (use StringBuilder).
Count frequency of each character in a string.
Remove duplicate characters from a string.
Check if two strings are anagrams.
Find the first non-repeating character in a string.
Compare two strings lexicographically using compareTo().
Replace all spaces in a string with %20.
```
StringBuilder vs String
```
Show why string concatenation in a loop is inefficient.
Rewrite the same logic using StringBuilder.
Write a program where StringBuilder outperforms String.
```
StringBuffer (Thread Safety Concept)
```
Write a program that modifies a string in multiple threads using StringBuffer.
Convert a StringBuffer to String.
Check capacity growth of StringBuffer.
```
BigInteger
```
Find factorial of a number using BigInteger.
Compute power (a^b) using BigInteger.
Compare two BigInteger values.
Find GCD of two large numbers using BigInteger.
```
BigDecimal
```
Calculate total bill amount using BigDecimal.
Divide two numbers with 2 decimal precision.
Demonstrate precision error using double and fix it using BigDecimal.
```
🔴 INTERVIEW LEVEL (Must-Do 🔥)
Conceptual + Coding Mix
```
Explain with code:
    Why String is immutable but StringBuilder is mutable?

Show memory difference between:
    String a = "Java";
    String b = new String("Java");

Write a program proving String Constant Pool behavior.

Write a function that:
    Takes a string
    Returns a new reversed string
    Without modifying original string
```
Advanced String Problems
```
Find the longest word in a sentence.
Check if a string contains only digits.
Compress a string
    Example: "aaabbc" → "a3b2c1"
Remove all special characters from a string.
```
Performance & Design
```
Why is StringBuilder faster than String? (Code + explanation)
Why is StringBuffer slower than StringBuilder?
When would you prefer StringBuffer over StringBuilder?
```
BigInteger / BigDecimal (REAL INTERVIEW)
```
Implement bank account balance calculation using BigDecimal.
Calculate compound interest using BigDecimal.
Show why BigDecimal(double) is dangerous.
Implement large Fibonacci numbers using BigInteger.
Check if a very large number is prime using BigInteger.
```

⭐ BONUS (Top Interview Favorites)
```
Difference between ==, equals(), and compareTo().
How does StringBuilder grow internally?
Can StringBuilder be used in multithreading? Why / why not?
Why BigDecimal is preferred in finance applications?
Are BigInteger and BigDecimal mutable or immutable? Prove with code.
```