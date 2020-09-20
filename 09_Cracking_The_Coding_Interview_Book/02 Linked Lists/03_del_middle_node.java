// The "n" points to that particular node and we need to delete it.
void middlenode(Node n)
{   
    if(n == null || n.next == null) // Then it is not middle node
            return;
    
    Node next = n.next;
    n.data = next.data;
    n.next = next.next;
}
  
