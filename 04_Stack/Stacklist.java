import java.util.Scanner;
import static java.lang.System.*;

class Node
{
	int data;
	Node next;
}

class Stack
{
	Node top;
	// Constructor
	public Stack()
	{
		this.top = null;
	}
	void push(int data)
	{
		Node obj = new Node();
		if(obj == null)
		{
			out.println("Heap Overflow");
			return;
		}
		else
		{
			out.println("Inserting " + data);
			obj.data = data;
			obj.next = top;
			top = obj;
		}
	}
	public void peek()
	{
		if(top == null)
		{
			out.println("Stack Underflow");
			return;
		}
		else
		{
			out.println(top.data);
		}
	}
	public void pop()
	{
		if(top == null)
		{
			out.println("Stack Underflow");
			return;
		}
		else
		{
			out.println("Removed ");
			peek();
			top = top.next;
		}
	}
	void print()
	{
		out.println("Stack Elements");
		if(top == null)
		{
			out.println("Stack Underflow");
			return;
		}
		else
		{
			Node temp = top;
			while(temp!=null)
			{
				out.println(temp.data);
				temp = temp.next;
			}
		}
	}
}

class Stacklist
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack obj = new Stack();
		obj.push(5);
		obj.push(4);
		obj.push(3);
		obj.push(2);
		obj.push(1);
		obj.print();
		out.println("The TOS is ");
		obj.peek();
		obj.pop();
		obj.print();
		
	}
}
