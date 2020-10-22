import java.util.Scanner;
import static java.lang.System.*;

class Node
{
	int data;
	Node prev;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
	}
}

class Linked
{
	Node head = null;
	
	
	void insert(int val)
	{
		Node n = new Node(val);
		n.next = null;
		
		if(head == null)
		{
			head = n;
			head.prev = null;
			System.out.println("Value Inserted");
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = n;
			n.prev = temp;
				
		}
		
	}
	
	void show()
	{
		if(head == null)
		{
			System.out.println("----Empty List---");
		}
		else
		{
			Node n = head;
			System.out.println();
			while(n!=null)
			{
				System.out.print(n.data + ", ");
				n = n.next;
			}
			System.out.print(".");
			System.out.println();
		}
	}
	
	void del(int ind)
	{
		
		if(head == null)
		{
			out.println("Empty list");
			return;
		}
		if(ind == 0)
		{
			head = head.next;
			head.prev = null;
			out.println("Index value deleted");
		}
		else
		{
			Node n = head;
			for(int i = 0; i < ind-1; i++)
			{
				n = n.next;
			}
			Node temp = n.next;
			Node temp1 = n.prev;
			n.next = temp.next;
			n.prev = temp1;
			out.println("Index Deleted");
		}
	}
}

class DoubleLinked
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Linked obj = new Linked();
		 	
		System.out.println("--Double Linked List--");
		int n;
		while(true)
		{
			out.println("Enter your choice of Operation:\n1. Insert\n2. Print\n3. Delete\n4. Exit");
			n = sc.nextInt();
			if(n == 1)
			{
				System.out.println("Enter value");
				int val = sc.nextInt();
				obj.insert(val);
			}
			else if(n == 2)
			{
				obj.show();
			}
			else if(n == 3)
			{
				out.println("Enter index of the value to delete");
				int ind = sc.nextInt();
				obj.del(ind);
			}
			else
			{
				out.println("EXIT");
				sc.close();
				break;
			}
		}
	}
}	
