import java.util.Scanner;
import static java.lang.System.*;
class Queue
{
	int front = -1, rear = -1;
	int m = 5; // Size
	int queue[] = new int[m];
	void enqueue(int data)
	{
		if(rear == m-1)
		{
			out.println("Overflow");
			return;
		}
		if(front == -1 && rear == -1)
		{
			front = 0;
			rear = 0;
		}
		else
		{
			rear += 1;
		}
		queue[rear] = data;
		out.println("Value Inserted");
	} 
	
	void dequeue()
	{
		if(front == -1 || front > rear)
		{
			out.println("Underflow");
		}
		else
		{
			front += 1;
			out.println("Value Deleted");
		}
	}
	
	void display()
	{
		
		if(rear == -1)
		{
			out.println("Empty Queue");
			return;
		}
		else
		{
			out.println("Queue Elements displayed");
			for(int i = front; i <= rear; i++)
			{
				out.print(queue[i] + ", ");
			}
			out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Queue obj = new Queue();
		while(true)
		{
			out.println("1. Insert\n2. Delete\n3. Display\n4. EXIT");
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
				out.println("EXIT");
				break;
			}
		}
	}
}
