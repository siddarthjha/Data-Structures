import java.util.Scanner;
import static java.lang.System.*;

class Node
{
	int data;
	Node prev;
	Node next;
}

class Linked
{
	void insert(int val)
	{
		Node n = new Node();
		n.data = val;
		n.next = null;
		n.prev = null;
		if(head == null)
		{
			head = n;
			out.println("Value Inserted");
		}
		else
		{
			while()	
		}
		
	}
	
	void search(int val)
	{
		
	}
	
	void del(int val)
	{
		
	}
}

class DoubleLinked
{
	Scanner sc = new Scanner(System.in);
	Linked obj = new Linked();
	Node head = null; 	
	out.println("---------Hello Welcome to Double Linked List----------");
	int n;
	while(true)
	{
		out.println("Enter your choice o =f Operation:\n1. Insert\n2. Print\n3. Delete\n4. Exit");
		n = sc.nextInt();
		if(n == 1)
		{
			out.pritnln("How many values to be entered");
			int a = sc.nextInt();
			for(int i = 0; i < a; i++)
			{
				out.println("Enter value");
				int val = sc.nextInt();
				obj.insert(int val);
			}
		}
	}
	
}
