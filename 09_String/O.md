# 📘 Java String – Interview Level Notes

## 🔹 What is String in Java?
- `String` is a **class** in Java (`java.lang.String`)
- Strings are **immutable** (cannot be changed once created)
- Stored in **heap memory**
- String literals are stored in **String Constant Pool (SCP)**

---

## 🔹 String Immutability (VERY IMPORTANT 🔥)

### Definition
Once a `String` object is created, **its value cannot be modified**.

```java
String name = "Naman";
name = "Jain";
✔ "Naman" is NOT modified
✔ A new String object "Jain" is created
✔ name now points to "Jain"
```
🔹 Why Strings are Immutable?
```
Security (passwords, URLs)

Thread safety

Caching & performance

String Pool optimization
```

🔹 String Literal vs String Object
```
String Literal
String a = "Naman";
String b = "Naman";
Stored in String Constant Pool

Same value → same object

a == b → true

Using new Keyword
String a = new String("Naman");
String b = new String("Naman");
Objects created in heap (outside SCP)

Always creates new objects

a == b → false
```
🔹 String Constant Pool (SCP)
```
Special memory area inside heap

Stores unique string literals

Avoids duplicate objects

Improves memory efficiency

Example:

String a = "Java";
String b = "Java";
Only one "Java" object exists in SCP.
```

🔹 Reference vs Value Comparison (INTERVIEW FAVORITE 🔥)

1️⃣ == Operator
```
Compares references

Checks if both variables point to the same object

String a = "Naman";
String b = "Naman";
System.out.println(a == b); // true
String a = new String("Naman");
String b = new String("Naman");
System.out.println(a == b); // false
```
2️⃣ .equals() Method
```
Compares content / value

Recommended for String comparison

System.out.println(a.equals(b)); // true
```
🔹 When to Use What?
```
Requirement	Use
Check same object	==
Check same value	equals()
```
🔹 Garbage Collection with Strings
```
String name = "Naman";
name = "Jain";
"Naman" becomes eligible for garbage collection

"Jain" is newly referenced
```

🔹 Important String Methods (INTERVIEW 🔥)
```
a.length();          // length of string
a.charAt(index);    // character at index
a.equals(b);        // value comparison
a.compareTo(b);     // lexicographical comparison
a.substring(i, j);  // extract substring
a.toUpperCase();    // convert to uppercase
a.toLowerCase();    // convert to lowercase
🔹 charAt() Example
String s = "Java";
System.out.println(s.charAt(1)); // 'a'
```
🔹 Key Interview One-Liners (MEMORIZE 🔥)
```
"Strings in Java are immutable."

"String literals are stored in String Constant Pool."

"== compares references, equals() compares values."

"new String() always creates a new object."

"Immutability improves security and performance."
```

⚠️ Interview Trap Questions
```
Q: Why is String immutable but StringBuilder mutable?
👉 For security, caching, and thread safety.

Q: Where is String Constant Pool located?
👉 Inside heap memory.

Q: Can String objects be garbage collected?
👉 Yes, if no reference exists.
```
# 📘 Java StringBuilder, Printing & Formatting – Interview Notes

## 🔹 `toString()` Method

- Defined in `Object` class
- Returns **string representation of an object**
- Automatically called when an object is printed

```
Object obj = new Object();
System.out.println(obj.toString());
```
🔹 Printing Arrays
```
❌ Wrong Way
System.out.println(arr);
✅ Correct Way
Arrays.toString(arr);        // 1D array
Arrays.deepToString(arr);   // 2D array
```

🔹 Wrapper Classes (Concept)
```
Used to convert primitive types into objects

Required for Collections Framework

Example:

int x = 10;
Integer y = Integer.valueOf(x);
```
🔹 Pretty Printing (IMPORTANT 🔥)
```
Used to control output format.

Float Formatting
float a = 23.1334f;
System.out.printf("%.2f", a);
Output
23.13
📌 %.2f → rounds to 2 decimal places
```
🔹 printf() Placeholders
```
Placeholder	Meaning
%d	Integer
%f	Floating point
%s	String
%c	Character
%n	New line
```
Example:
```
System.out.printf("Hello %s, age is %d%n", "Naman", 20);
```
🔹 Escape Sequences
```
Sequence	Meaning
\n	New line
\t	Tab
\"	Double quote
\\	Backslash
```
🔹 String Concatenation with + Operator
```
System.out.println("Hello " + 5 + 10);
Output:

Hello 510
📌 + works with primitives and Strings
📌 Evaluation happens left to right
```
🔹 StringBuilder (VERY IMPORTANT 🔥)
```
What is StringBuilder?
Mutable string class

Allows modification without creating new objects

Faster than String for multiple modifications

Not thread-safe
```

🔹 Why StringBuilder?
```
Strings are immutable

Repeated modifications create many objects

StringBuilder avoids this overhead
```
🔹 Creating StringBuilder
```
StringBuilder sb = new StringBuilder();
```
🔹 Common StringBuilder Methods
```
sb.append("text");           // add text
sb.insert(index, "text");    // insert at index
sb.delete(start, end);       // delete substring
sb.reverse();                // reverse string
sb.toString();               // convert to String
```
🔹 Example
```
StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");
sb.insert(5, ",");
sb.delete(5, 6);
System.out.println(sb);
Output:

Hello World
```

🔹 String vs StringBuilder (INTERVIEW FAVORITE 🔥)
```
Feature	          String	    StringBuilder
Mutability	     Immutable	      Mutable
Performance	      Slower	       Faster
Thread-safe	       Yes	             No
Memory	        More objects	Fewer objects
```
🔹 When to Use What?
```
Use String

When value does not change

Thread safety needed

Use StringBuilder

When frequent modifications are required

Performance matters
```
🔥 Interview One-Liners (MEMORIZE)
```
"String is immutable, StringBuilder is mutable."

"StringBuilder avoids creating new objects."

"printf() allows formatted output."

"+ operator works with Strings and primitives."
```
⚠️ Interview Trap Questions
```
Q: Why is StringBuilder faster than String?
👉 Because it modifies the same object instead of creating new ones.

Q: Is StringBuilder thread-safe?
👉 No.

Q: What method converts StringBuilder to String?
👉 toString()
```


# 📘 Java StringBuffer – Interview Level Notes

## 🔹 What is StringBuffer?
- `StringBuffer` is a **mutable sequence of characters**
- Part of `java.lang`
- Similar to `StringBuilder`
- **Thread-safe** (synchronized)

```java
StringBuffer sb = new StringBuffer();
```
🔹 Key Properties of StringBuffer
```
Mutable (can be modified)
Thread-safe
Slower than StringBuilder
Uses synchronization internally
Stored in heap memory
```
🔹 Why StringBuffer?
```
Strings are immutable
StringBuilder is not thread-safe
StringBuffer provides safe modification in multithreaded environments
```
🔹 Constructors of StringBuffer (IMPORTANT)
```
1️⃣ Default Constructor
StringBuffer sb = new StringBuffer();
Default capacity = 16

2️⃣ String Constructor
StringBuffer sb = new StringBuffer("Naman Jain");
Capacity = 16 + length of string

3️⃣ Capacity Constructor
StringBuffer sb = new StringBuffer(30);
Initial capacity = 30
```
🔹 Capacity Concept (INTERVIEW FAVORITE 🔥)
```
sb.capacity();
Default capacity = 16

Capacity grows automatically when exceeded

Growth formula:

newCapacity = (oldCapacity * 2) + 2
```
🔹 Common StringBuffer Methods 🔥
```
sb.append("text");            // add text
sb.insert(index, "text");     // insert at index
sb.replace(start, end, "x");  // replace substring
sb.delete(start, end);        // delete substring
sb.reverse();                 // reverse content
sb.capacity();                // current capacity
sb.toString();                // convert to String

🔹 Example
StringBuffer sb = new StringBuffer("Hi");
sb.append(" Java");
sb.insert(2, ",");
sb.reverse();
System.out.println(sb);
```
🔹 Advantages of StringBuffer
```
Mutable
Thread-safe
Safe for concurrent access
Prevents data inconsistency in multithreading
```
🔹 Disadvantages of StringBuffer
```
Slower due to synchronization
Performance overhead in single-threaded programs
```
🔹 String vs StringBuilder vs StringBuffer (INTERVIEW 🔥)
```
Feature	          String	       StringBuilder	StringBuffer
Mutability	  ❌ Immutable	  ✅ Mutable	     ✅ Mutable
Thread-safe	     ✅ Yes	       ❌ No	          ✅ Yes
Performance	       Slow	         Fastest	       Slower
Synchronization	   N/A	           ❌	           ✅
```
🔹 When to Use What?
```
String
    Fixed value
    Thread safety required
StringBuilder
    Single-threaded
    High performance
StringBuffer
    Multithreaded environment
    Data consistency required
```
🔥 Interview One-Liners (MEMORIZE)
```
"StringBuffer is thread-safe but slower."
"StringBuilder is faster but not thread-safe."
"String is immutable."
"StringBuffer methods are synchronized."
```

⚠️ Interview Trap Questions
```
Q: Why is StringBuffer thread-safe?
👉 Because all its methods are synchronized.
Q: Which is faster: StringBuilder or StringBuffer?
👉 StringBuilder.
Q: Default capacity of StringBuffer?
👉 16.
Q: Growth formula of StringBuffer?
👉 (oldCapacity * 2) + 2
```

# 📘 Java BigInteger & BigDecimal – Interview Level Notes

## 🔹 Why BigInteger & BigDecimal?
Primitive data types (`int`, `long`, `float`, `double`) have **fixed size and precision**.

- `int` / `long` → **overflow problem**
- `float` / `double` → **precision errors**

👉 Java provides:
- `BigInteger` → for **very large integers**
- `BigDecimal` → for **high-precision decimal calculations**

---

## 🔹 BigInteger

### 📌 What is BigInteger?
- A class in `java.math`
- Used to store **arbitrarily large integers**
- Immutable
- Extends `Number`
- Implements `Comparable<BigInteger>`

```java
import java.math.BigInteger;
🔹 Why Not int / long?
int x = Integer.MAX_VALUE;
x = x + 1;   // overflow
```
👉 BigInteger avoids overflow.

🔹 Creating BigInteger Objects
```
1️⃣ From String (MOST COMMON)
BigInteger a = new BigInteger("12345678901234567890");
2️⃣ Using valueOf()
BigInteger b = BigInteger.valueOf(1000);
```
🔹 Converting BigInteger to Primitive
```
int x = a.intValue();
long y = a.longValue();
⚠️ Value may truncate if out of range.
```

🔹 BigInteger Operations (IMPORTANT 🔥)
```
BigInteger c = a.add(b);
c = a.subtract(b);
c = a.multiply(b);
c = a.divide(b);
c = a.remainder(b);
❌ Operators like + - * / do NOT work
```
🔹 Comparison
```
a.compareTo(b)
Returns:

0 → equal

>0 → a > b

<0 → a < b
```

🔹 Range of BigInteger
```
No fixed range
Limited only by memory
Stores values as signed magnitude
```
🔹 BigDecimal
```
📌 What is BigDecimal?
Used for precise decimal calculations
Avoids floating-point precision issues
Immutable
Found in java.math
import java.math.BigDecimal;
```
🔹 Why BigDecimal Over float/double?
```
Floating Point Problem
double a = 0.1;
double b = 0.2;
System.out.println(a + b); // 0.30000000000000004
👉 Caused by binary representation of decimals
```
BigDecimal Solution
```
BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.2");
System.out.println(a.add(b)); // 0.3
✔ Exact result
```
🔹 Creating BigDecimal (INTERVIEW TRAP 🔥)
❌ Wrong:
```
BigDecimal a = new BigDecimal(0.1);
✅ Correct:

BigDecimal a = new BigDecimal("0.1");
🔹 BigDecimal Operations
BigDecimal c = a.add(b);
c = a.subtract(b);
c = a.multiply(b);
c = a.divide(b);
Division with scale:

a.divide(b, 2, RoundingMode.HALF_UP);
🔹 Scale & Precision (IMPORTANT 🔥)
Scale → digits after decimal point

Precision → total number of digits

Example:

BigDecimal x = new BigDecimal("123.45");
Precision = 5

Scale = 2

🔹 BigDecimal Range
Arbitrary precision

Not limited like float (32-bit) or double (64-bit)

Precision depends on memory
```
🔹 BigInteger vs BigDecimal
```
Feature	                    BigInteger	         BigDecimal
Type	                     Integer	           Decimal
Precision	               Unlimited	          Unlimited
Use case	              Large numbers	    Financial calculations
Decimal support            	❌ No	              ✅ Yes
```
🔹 When to Use What?
```
BigInteger
    Cryptography
    Factorials
    Large numeric computations
BigDecimal
    Currency
    Banking
    Scientific calculations
```
🔥 Interview One-Liners (MEMORIZE)
```
"BigInteger handles arbitrarily large integers."
"BigDecimal avoids floating-point precision errors."
"Always create BigDecimal using String."
"BigInteger and BigDecimal are immutable."
```
⚠️ Interview Trap Questions
```
Q: Can we use + with BigInteger?
❌ No, must use methods.
Q: Why BigDecimal is preferred for money?
👉 Exact precision.
Q: Are BigInteger objects mutable?
❌ No, immutable.
```
