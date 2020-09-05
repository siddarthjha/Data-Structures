import java.util.Scanner;

class Node
{
	int data;
	Node next;
		
}

class A
{
	Node head;
	
	
	//Insert
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
	// Print
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
	// Search
	void find(int search)
	{
		if(head == null)
		{
			System.out.println("----Empty list to search-----");
		}
		else
		{
			Node n = head;
			int c = 0;
			while(n!=null)
			{
				
				if(n.data == search)
				{
					System.out.println("The search of  "+ n.data+ "is found");
					c++;
					
					break;
				}
				n = n.next;
			}
			if(c == 0)
			{
				System.out.println("The entered element not found in list");
			}
		}
	}
	// Insert At Start
	void insertStart(int value)
	{
		if(head == null)
		{
			Node obj = new Node();
			obj.data = value;
			obj.next = null;
			head = obj;
		}
		else
		{
			
			Node obj = new Node();
			//temp = head;
			obj.data = value;
			obj.next = head;
			head = obj;
		}
		System.out.println("Value inserted");
	}
	// Insert at Given Index
	void insertAt(int ind, int value)
	{
		if(ind == 0)
		{
			insertStart(value);
		}
		else
		{
			Node n = head;
			Node obj = new Node();
			obj.data = value;
			obj.next = null;
			for(int i = 0; i < ind -1; i++)
			{
				n = n.next;
			}
			obj.next = n.next;
			n.next = obj;
			System.out.println("Value Inserted");
		}
	}
	// Delete the Given value
	void delete(int value)
	{
		Node n = head;
		while(n!=null)
		{
			if(n.data == value)
			{
				
			}
		}
	}
	
}

public class Linkedlist
{
	public static void main(String[] args) throws Exception
	{ 
		A obj1 = new A();
		Scanner obj = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Select Option\n1. Insert\n2. Print List\n3. Search\n4. Insert At Start\n5. Insert at given Index\n6. Exit");
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
				System.out.println("Enter the element for search");
				int search = obj.nextInt();
				obj1.find(search);
			}
			else if(n == 4)
			{
				System.out.println("Enter value");
				int value = obj.nextInt();
				obj1.insertStart(value);
			}
			else if(n == 5)
			{
				System.out.println("Enter index");
				int ind, value;
				ind = obj.nextInt();
				System.out.println("Enter value");
				value = obj.nextInt();
				obj1.insertAt(ind, value);
			}
			else
			{
				System.out.println("******THE END******");
				obj.close();
				break;
			}
		}
		
		
	}
	
}
