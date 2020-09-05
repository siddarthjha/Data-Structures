import java.util.Scanner;

class Node
{
	int data;
	Node next;
		
}

class A
{
	Node head;
	void insert(int value)
	{
		Node obj = new Node();
		obj.data = value;
		obj.next = null;
		
		if(head == null)
		{
			head = obj;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = obj;
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
			while(n.next!=null)
			{
				System.out.print(n.data + ", ");
				n = n.next;
			}
			System.out.print(n.data+".");
			System.out.println();
		}
	}
}

public class Linkedlist
{
	public static void main(String[] args)
	{ 
		A obj1 = new A();
		Scanner obj = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Select Option\n1. Insert\n2. Print List\n3. Search\n4. Exit");
		 	int n = obj.nextInt();
			if(n == 1)
			{
				System.out.println("How many you want to enter");
				int s = obj.nextInt();
				for(int i = 0; i < s; i++)
				{
					System.out.println("Enter value");
					int value = obj.nextInt();
					obj1.insert(value);
				}
			}
			else if(n == 2)
			{
				obj1.show();
			}
			else if(n == 3)
			{
				
			}
			else
			{
				break;
			}
		}
		
		
	}
	
}
