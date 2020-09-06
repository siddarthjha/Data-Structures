import java.util.Scanner;
import static java.lang.System.*;
class Stack
{
	int n = 20;
	int stack[] = new int[n];
	int top = -1;
	
	void push(Scanner sc)
	{
		if(top == n-1)
		{
			out.println("Overflow");
		}
		else
		{
			out.println("Enter value");
			int val = sc.nextInt();
			top++;
			stack[top] = val;
			out.println("Item pushed"); 
		}
	}
	
	void pop()
	{
		if(top == -1)
		{
			out.println("Underflow");
		}
		else
		{
			--top;
			out.println("Item popped");
		}
	}
	
	void print()
	{
		out.println("******Elements of Stack*****");
		if(top == -1)
		{
			out.println("Empty Stack---Underflow");
			return;
		}
		for(int i = top; i >= 0; i--)
		{
			out.println(stack[i]);
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack obj = new Stack();
		while(true)
		{
			out.println("Enter choice of Operation ot perform");
			out.println("1. Push\n2. Pop\n3. Print Stack\n4. Exit");
			int a = sc.nextInt();
			if(a == 1)
			{
				obj.push(sc);
			}
			else if(a == 2)
			{
				obj.pop();
			}
			else if(a == 3)
			{
				obj.print();
			}
			else
			{
				out.println("******EXIT*****");
				break;
			}
		}
	} 
}

