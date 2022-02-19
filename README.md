# DequeAssignment

A *deque* is a double-ended queue, in which the items can be added to or removed from the head or the tail.
A dequeue supports the following operations:
1. *addFirst(item)*: add an item to the **front** of the queue
2. *addLast(item)*: add an item to the **back**  of the queue
3. *removeFirst()*: remove the item located at the front of the queue and return it
4. *removeLast()*: remove the item located at the back of the queue and return it
5. *size()*: return the number of items inside the deque

A deque is also iterable, i.e., it implements the java.lang.Iterable interface. 

In this assignment, you are required to write a **node-based implementation** of the deque data structure. An important distinction from other data structures is that nodes in a deque are bi-directional, i.e., they have two pointers: a pointer to the next node and a pointer to the previous node. 

Provided with this assigmment the following souce files:
1. *Deque.java*: this is an iterface that describe the supported methods by a deque (do not modify this interface).
2. *Node.java*: this is a class that represents a bi-directional node (do not modify this class).
3. *NodeDequeu.java*: this is a class that represents a node-based implementation of a deque. Unless specified otherwise, you are required to write the implementation of all methods inside this class.
4. *NodeIterator.java*: this is a class taht represents an iterator object for a deque. You are required to write the implementation of all methods inside this class.
5. *NodeDequeTest.java*: this is junit test class with 15 tests (do not modify this test). 
