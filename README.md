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

- `value`: the stored value
- `next`: reference to the next node

---

# Constructor

## LinkedList(int value)

Creates a new linked list with an initial node.

### Example

```java
LinkedList list = new LinkedList(10);
```

### Result

```text
head -> 10 <- tail
length = 1
```

---

# Methods

---

# printList()

Prints all nodes in the linked list along with:

- head
- tail
- length

### Example

```java
list.printList();
```

### Output

```text
node: 10
node: 20
node: 30
tail: 30
head: 10
length: 3
```

---

# append(int value)

Adds a node to the end of the list.

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(1) |
| Space | O(1) |

### Example

```java
list.append(20);
```

---

# removeLast()

Removes the last node from the list.

### Returns

The removed node.

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(n) |
| Space | O(1) |

### Example

```java
Node removed = list.removeLast();
```

---

# prepend(int value)

Adds a node to the beginning of the list.

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(1) |
| Space | O(1) |

### Example

```java
list.prepend(5);
```

---

# removeFirst()

Removes the first node from the list.

### Returns

The removed node.

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(1) |
| Space | O(1) |

---

# get(int index)

Returns the node at a specific index.

### Parameters

| Parameter | Description |
|---|---|
| `index` | Position of the node |

### Returns

- The node if found
- `null` if the index is invalid

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(n) |
| Space | O(1) |

---

# set(int index, int value)

Updates the value of an existing node.

### Returns

- `true` if the value was updated successfully
- `false` if the index is invalid

### Example

```java
list.set(1, 50);
```

---

# insert(int index, int value)

Inserts a node at a specific position.

### Special Cases

- Insert at beginning → `prepend()`
- Insert at end → `append()`

### Returns

- `true` if insertion was successful
- `false` if the index is invalid

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(n) |
| Space | O(1) |

---

# remove(int index)

Removes a node at a specific position.

### Special Cases

- First node → `removeFirst()`
- Last node → `removeLast()`

### Returns

The removed node.

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(n) |
| Space | O(1) |

---

# reverse()

Reverses the entire linked list.

### Before

```text
10 -> 20 -> 30
```

### After

```text
30 -> 20 -> 10
```

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(n) |
| Space | O(1) |

---

# findMiddleNode()

Finds the middle node using the:

## Fast and Slow Pointer Technique

- `slow` moves one node at a time
- `fast` moves two nodes at a time

When `fast` reaches the end:

- `slow` will be at the middle

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(n) |
| Space | O(1) |

### Example

```text
1 -> 2 -> 3 -> 4 -> 5
```

Result:

```text
3
```

---

# hasLoop()

Detects whether the linked list contains a loop (cycle).

Uses:

## Floyd’s Cycle Detection Algorithm

Also known as:

- Tortoise and Hare Algorithm

### How It Works

- `slow` moves one node at a time
- `fast` moves two nodes at a time

If they meet:

```text
A loop exists
```

### Returns

- `true` → loop detected
- `false` → no loop

### Time Complexity

| Case | Complexity |
|---|---|
| Time | O(n) |
| Space | O(1) |

---

# Complete Example

```java
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList(10);

        list.append(20);
        list.append(30);

        list.prepend(5);

        list.insert(2, 15);

        list.printList();

        list.reverse();

        System.out.println("Reversed:");
        list.printList();
    }
}
```

---

# Expected Output

```text
node: 5
node: 10
node: 15
node: 20
node: 30

tail: 30
head: 5
length: 5
```

---

# Overall Time Complexities

| Operation | Complexity |
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

---

# Core Concepts Used

This implementation demonstrates important data structure concepts:

- Singly Linked Lists
- References and Pointers
- Dynamic Memory
- Fast & Slow Pointers
- Floyd Cycle Detection
- In-place Reversal
- Encapsulation
- Inner Classes

---

# Possible Improvements

Potential future improvements:

- `contains()` method
- `clear()` method
- `size()` method
- Doubly Linked List version
- Generic implementation using `<T>`
- Iterator support
- Java Collection integration

---

# Author Jonas Maldonado

Educational implementation of a linked list in Java focused on understanding:

- node manipulation
- references
- classic linked list algorithms
