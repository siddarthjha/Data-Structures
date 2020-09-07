import java.util.Scanner;
import static java.lang.System.*;

class QueueNode
{
	int data;
	QueueNode next;
	// Constructor
	QueueNode(int val)
	{
		data = val;
		next = null;
	}
}

class Queue
{
	QueueNode front, rear;
	
	// Constructor
	public Queue()
	{
		front = null;
		rear = null;
	}
	// Add Elements
	void enqueue(int val)
	{
		QueueNode n = new QueueNode(val);
		
		if(rear == null)
		{
			front = rear = n;
			out.println("Value inserted");
			return;
		}
		else
		{
			rear.next = n;
			rear = n;
			out.println("Value Inserted");
		}
	}
	// Delete elements
	void dequeue()
	{
		if(front == null)
		{
			out.println("Empty Queue");
			return;
		}
		else
		{
			front = front.next;
			out.println("Value Deleted");
			if(front == null)
				rear = null;
		}
	}
	// Display Elements
	void display()
	{	
		QueueNode temp = front;
		if(front == null)
		{
			out.println("Empty Queue");
			return;
		}
		else
		{
			out.println("***Queue Elements***");
			while(temp!=null)
			{
				out.print(temp.data+" ");
				temp = temp.next;
			}
			out.println();
		}
	}
	
}
public class Queuelist
{
	public static void main(String args[])
	{
		Queue obj = new Queue();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			out.println("1. Add element\n2. Delete Element\n3. Display Element\n4. EXIT");
			int n = sc.nextInt();
			if(n == 1)
			{
				out.println("Enter value");
				int val = sc.nextInt();
				obj.enqueue(val);
			}
			else if(n == 2)
			{
				obj.dequeue();
			}
			else if(n == 3)
			{
				obj.display();
			}
			else
			{
				out.println("EXITING");
				sc.close();
				break;
			}
		}
		
	}
}
