# LinkedList Implementation in Java

## Description

This project contains a custom implementation of a **Singly Linked List** in Java.

The linked list supports:

- Adding nodes to the beginning and end
- Removing nodes
- Accessing and updating nodes by index
- Inserting nodes at specific positions
- Reversing the list
- Finding the middle node
- Detecting loops (cycles)
- Finding the k-th node from the end
- Removing duplicate values
- Converting binary numbers to decimal



---

# Class Structure

```java
public class LinkedList
```

The class contains the following attributes:

| Attribute | Description |
|---|---|
| `head` | First node in the list |
| `tail` | Last node in the list |
| `length` | Total number of nodes |

---

# Inner Node Class

```java
class Node {
    int value;
    Node next;
}
```

Each node contains:

- `value`: stored integer value
- `next`: reference to the next node

---

# Constructor

## LinkedList(int value)

Creates a new linked list with an initial node.

```java
LinkedList list = new LinkedList(10);
```

---

# append(int value)

Adds a node to the end of the list.

### Complexity

| Time | Space |
|---|---|
| O(1) | O(1) |

---

# removeLast()

Removes the last node from the list.

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# prepend(int value)

Adds a node to the beginning of the list.

### Complexity

| Time | Space |
|---|---|
| O(1) | O(1) |

---

# removeFirst()

Removes the first node from the list.

### Complexity

| Time | Space |
|---|---|
| O(1) | O(1) |

---

# get(int index)

Returns the node at the specified index.

### Returns

- Node if found
- `null` if index is invalid

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

### Why Space Complexity is O(1)

The method only uses:

- one temporary pointer (`temp`)
- one loop counter (`i`)

No additional data structures are created.

---

# set(int index, int value)

Updates the value of a node.

### Returns

- `true` if updated successfully
- `false` if index is invalid

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# insert(int index, int value)

Inserts a node at a specific position.

### Special Cases

- Beginning → `prepend()`
- End → `append()`

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# remove(int index)

Removes a node at a specific position.

### Special Cases

- First node → `removeFirst()`
- Last node → `removeLast()`

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# reverse()

Reverses the linked list in-place.

### Example

Before:

```text
10 -> 20 -> 30
```

After:

```text
30 -> 20 -> 10
```

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# findMiddleNode()

Finds the middle node using the:

## Fast and Slow Pointer Technique

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# hasLoop()

Detects whether the linked list contains a cycle.

Uses:

## Floyd’s Cycle Detection Algorithm

Also known as:

- Tortoise and Hare Algorithm

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# findKthFromEnd(int k)

Returns the k-th node from the end of the linked list.

Uses the:

## Two Pointer Technique

### How It Works

- `fast` moves `k` positions ahead
- `slow` starts at the head
- Both move together until `fast` reaches the end

At that point:

- `slow` points to the k-th node from the end

### Example

```text
1 -> 2 -> 3 -> 4 -> 5
```

```java
list.findKthFromEnd(2);
```

Result:

```text
4
```

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# removeDuplicates()

Removes duplicate values from the linked list.

Uses:

## HashSet

to track values already encountered.

### Example

Before:

```text
1 -> 2 -> 2 -> 3 -> 1
```

After:

```text
1 -> 2 -> 3
```

### Complexity

| Time | Space |
|---|---|
| O(n) | O(n) |

### Why Space Complexity is O(n)

Because the `HashSet` can store up to `n` unique values.

---

# binaryToDecimal()

Converts a binary number stored in the linked list into a decimal integer.

Each node should contain:

- `0`
- `1`

### Example

Linked List:

```text
1 -> 0 -> 1 -> 1
```

Binary value:

```text
1011₂
```

Decimal result:

```text
11
```

### Core Formula

```java
num = num * 2 + current.value;
```

### Complexity

| Time | Space |
|---|---|
| O(n) | O(1) |

---

# Overall Time Complexities

| Operation | Time Complexity |
|---|---|
| append | O(1) |
| prepend | O(1) |
| removeFirst | O(1) |
| removeLast | O(n) |
| get | O(n) |
| set | O(n) |
| insert | O(n) |
| remove | O(n) |
| reverse | O(n) |
| findMiddleNode | O(n) |
| hasLoop | O(n) |
| findKthFromEnd | O(n) |
| removeDuplicates | O(n) |
| binaryToDecimal | O(n) |

---

# Concepts Used

This implementation demonstrates:

- Singly Linked Lists
- Pointer Manipulation
- Dynamic Memory
- Fast & Slow Pointers
- Floyd Cycle Detection
- HashSet Usage
- In-place Reversal
- Binary Conversion Logic
- Encapsulation
- Inner Classes

---

# Possible Improvements

Potential future additions:

- `contains()`
- `clear()`
- `size()`
- Generic implementation using `<T>`
- Iterator support
- Doubly Linked List version
- Java Collections integration
