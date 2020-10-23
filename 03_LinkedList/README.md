# LinkedList

### Single linked list
* [Linked list in C](LinkedList.c)
* [Linled List in Java](Linkedlist.java)
### Double Linked List
* [Double Linked List](Linkedlist1.java)

**In Circular Linked list instead of placing null in the last node of "next", we will point it to the head which is the first value.**

In this way the circular linked list is implemented.
There will be minor changes in all the functions of normal linked list.
```
void insert()
{
  Node n = new Node(data);
  n.next = null;
if(head == null)
{
  head = n;
  n.next = null;
}
}
```
There will be minute changes as above.

The linkedlist.java consists of functions:
1. Insertion
2. Print 
3. Search
4. Insertion At Start
5. Insertion At given Index
6. Deletion
7. Print from K-last
8. Reverse
9. Find Loop
10. Remove Duplicate

All these are implemented (Most of them are in optimized run-time)
