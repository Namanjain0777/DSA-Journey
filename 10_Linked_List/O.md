# 📘 Linked List – Interview Level Notes (Java)

---

## 🔹 What is a Linked List?
A **Linked List** is a **linear data structure** where elements are stored as **nodes**, and each node contains:
- **Data**
- **Reference (pointer) to the next node**

Unlike arrays, elements are **not stored in contiguous memory**.

Every Element Stored in **Heap** 

**Head** -> First Element of Linked List

**Tail** -> Last Element Of Linked  and Next Node is **None / null / phi**

---

## 🔹 Node Structure

```java
class Node {
    int data;
    Node next;
}
data → stores value

next → stores address of next node
```

🔹 Types of Linked List

1️⃣ Singly Linked List

2️⃣ Doubly Linked List

3️⃣ Circular Linked List

🔹 Singly Linked List
```
Structure
[data | next] → [data | next] → [data | null]
```
Key Points
Traversal only in one direction

Last node points to null

Extra memory used for next

🔹 Doubly Linked List
```
Structure
null ← [prev | data | next] ⇄ [prev | data | next] → null
```
Key Points
Traversal in both directions

More memory overhead

Faster deletion

🔹 Circular Linked List
```
Structure
[data | next] → [data | next]
      ↑_________________↓
```
Key Points
Last node points back to head

No null reference

Useful in round-robin scheduling

🔹 Why Linked List?
Dynamic size

Easy insertion and deletion

No memory wastage due to resizing

🔹 Linked List vs Array (INTERVIEW FAVORITE 🔥)
```
Feature	       Array	     Linked List
Memory	     Contiguous	   Non-contiguous
Size	       Fixed	       Dynamic
Access	        O(1)	        O(n)
Insertion	    O(n)	        O(1) (if node known)
Deletion	    O(n)	        O(1)
```
🔹 Basic Operations
1️⃣ Traversal
```
Node temp = head;
while (temp != null) {
    System.out.print(temp.data + " ");
    temp = temp.next;
}
⏱ Time Complexity: O(n)
```
2️⃣ Insertion
a) At Beginning
```
newNode.next = head;
head = newNode;
⏱ O(1)
```
b) At End
```
while (temp.next != null) {
    temp = temp.next;
}
temp.next = newNode;
⏱ O(n)
```
c) At Given Position
```
Traverse till position

Update links carefully
```
⏱ O(n)

3️⃣ Deletion
a) Delete First Node
head = head.next;
⏱ O(1)

b) Delete Last Node
Traverse till second-last node

⏱ O(n)

c) Delete Given Value
Find previous node

Change prev.next

⏱ O(n)

🔹 Searching in Linked List
```
Node temp = head;
while (temp != null) {
    if (temp.data == target) return true;
    temp = temp.next;
}
return false;
⏱ O(n)
```
🔹 Length of Linked List
```
int count = 0;
Node temp = head;
while (temp != null) {
    count++;
    temp = temp.next;
}
```
🔹 Common Interview Problems 🔥
1️⃣ Reverse a Linked List
```
Iterative (3 pointers)

Recursive approach

⏱ O(n), 📦 O(1)
```
2️⃣ Detect Cycle (IMPORTANT 🔥)
```
Floyd’s Cycle Detection Algorithm

Slow pointer

Fast pointer

slow = slow.next;
fast = fast.next.next;
```
3️⃣ Find Middle Node
```
Slow & Fast pointer

Slow reaches middle
```
4️⃣ Remove Nth Node from End
```
Two pointers

One pointer moves n steps ahead
```
5️⃣ Merge Two Sorted Linked Lists
```
Compare nodes

Build new list
```
🔹 Memory Representation (INTERVIEW 🔥)
```
Each node stored separately in heap

head reference stored in stack

No index-based access
```
🔹 Advantages
```
Dynamic size

Efficient insertion/deletion

No shifting required
```
🔹 Disadvantages
```
No random access

Extra memory for pointers

Traversal is slower
```
🔹 Linked List in Java (Collection)
LinkedList<Integer> list = new LinkedList<>();
Implements:

List

Deque

Queue

Supports:

addFirst()
addLast()
removeFirst()
removeLast()