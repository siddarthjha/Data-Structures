int size;// The size of the linked list tkaen while inserting elements

public boolean palindrome()
{
    node curr = head;
    int mid = (size % 2 == 0)? (size/2):((size + 1)/2);
    for(int i = 1; i < mid; i++)
    {
        curr = curr.next;
    }
    Node revlist = reverse(curr.next);// Returns the head of reversed list
    
    while(head!= null && revlist!= null)
    {
        if(head.data!= revlist.data)
            return false;
        head = head.next;
        revlist = revlist.next;
    }
    return true;
}


public Node reverse(Node head)
{
    Node curr = head;
    Node prev = null, next = null;
    while(curr!= null)
    {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}    

public static void main(String[] args)
{
    Plaindrome p = new Plaindrome();
    //List insertion;
    //List display
    boolean b = p.palindrome();
    if(p)
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");
}
