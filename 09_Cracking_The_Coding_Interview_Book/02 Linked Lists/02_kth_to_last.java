	//K-th to last print
	public void kth(int ind)
	{
		Node n = head;
		for(int i = 0; i < ind; i++)
		{
			if(n == null)
			{
				out.println("bye");
				break;
			}
			n = n.next;
		}
		while(n!= null)
		{
			System.out.print(n.data + ", ");
			n = n.next;
		}
		out.println();
	}
