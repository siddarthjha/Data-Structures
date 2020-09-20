public void dups()
{
  Node curr = head;
  while(curr!= null)
  {
    Node runn = curr;
    while(runn!= null)
    {
      if(runn.next.data == curr.data) // If the data is same then removed else iterate next value
          runn.next = runn.next.next;
      else
        runn = runn.next;
    }
    curr = curr.next;
  }
