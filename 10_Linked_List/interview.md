# 🔗 Linked List – Edge Cases & Checks (Singly & Doubly)

This file lists **all important edge cases** you must keep in mind while implementing
**Singly Linked List (SLL)** and **Doubly Linked List (DLL)**.

Interviewers mainly test you on **these cases**, not basic insertion.

---

## 🧠 GENERAL EDGE CASES (Applies to BOTH SLL & DLL)

### 1️⃣ Empty List
- `head == null`
- `tail == null`
- size = 0

⚠️ Always check before:
- delete
- traverse
- access `head.next` or `tail.prev`

---

### 2️⃣ Single Node List
- `head == tail`
- `head.next == null`
- `tail.prev == null` (DLL)

⚠️ Deleting this node must:
- set `head = null`
- set `tail = null`
- size = 0

---

### 3️⃣ Index Validation

Always check:
```java
index < 0 || index > size   // insertion
index < 0 || index >= size // deletion
❌ Missing this causes runtime crashes.
```
4️⃣ Size Maintenance
```
Increment size exactly once on insert

Decrement size exactly once on delete

Never double increment (common bug!)
```
5️⃣ Early Return After Delegation
```
If you call:

addAtStart()

addAtEnd()

deleteAtStart()

deleteAtEnd()

👉 Return immediately, or logic will run twice.
```
### 🔹 SINGLY LINKED LIST (SLL) – EDGE CASES

🟢 Insert at Start
```
If list empty → update tail

node.next = head

head = node
```
🟢 Insert at End
```
If list empty → update both head & tail

Else:

tail.next = node;
tail = node;
```
🔴 Delete at Start
```
Edge cases:

Empty list → do nothing

Single node → set head = tail = null
```
🔴 Delete at End (MOST TRICKY IN SLL)
```
Need to stop at size - 2

Cannot jump backward

Time complexity: O(n)
```
🔴 Delete at Index
```
index = 0 → deleteAtStart

index = size - 1 → deleteAtEnd

Middle:

temp.next = temp.next.next;
```
⚠️ SLL Common Mistakes
```
Forgetting to update tail

NullPointerException on last node

Looping size - 1 instead of size - 2
```
### 🔹 DOUBLY LINKED LIST (DLL) – EDGE CASES

🟢 Insert at Start
```
Order matters:

node.next = head;
head.prev = node;
head = node;
❌ Never update head before fixing links.
```
🟢 Insert at End
```
tail.next = node;
node.prev = tail;
tail = node;
```
🟢 Insert at Index
```
Must update 4 links:

node.next = temp.next;
node.prev = temp;
temp.next.prev = node;
temp.next = node;
Missing even one link breaks DLL.
```
🔴 Delete at Start
```
Edge cases:

Empty list

Single node

Correct steps:

head = head.next;
head.prev = null;
```
🔴 Delete at End
```
Correct steps:

tail = tail.prev;
tail.next = null;
Handle single node separately.
```
🔴 Delete at Index
```
Must update both directions:

temp.next = toDelete.next;
toDelete.next.prev = temp;
```
⚠️ DLL Common Mistakes
```
Forgetting prev updates

Self-loop (node.prev = node)

Not clearing prev / next

Wrong pointer update order
```
🔁 LOOP & TRAVERSAL CASES
```
Forward Traversal
Node temp = head;
while (temp != null)
Backward Traversal (DLL only)
Node temp = tail;
while (temp != null)
```
🧪 TEST CASES YOU SHOULD ALWAYS TRY
```
1. Insert into empty list
2. Delete from empty list
3. Insert at index 0
4. Insert at last index
5. Delete first node
6. Delete last node
7. Delete middle node
8. Single element insert → delete
9. Continuous inserts and deletes
```
🧠 INTERVIEW GOLD STATEMENTS
```
SLL delete at end is O(n), DLL is O(1)

DLL uses extra memory for prev

Pointer update order is critical

Size consistency prevents hidden bugs
```
