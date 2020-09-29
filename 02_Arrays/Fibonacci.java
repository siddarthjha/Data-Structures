import java.util.Scanner;
public class Fibonacci
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		Fibonacci obj = new Fibonacci();
		obj.fib(n);
	}
	
	public void fib(int n)
	{
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		for(int i = 3; i <= n; i++)
		{
			int c = a + b;
			a = b; 
			b = c;
			System.out.print(" " + c);
		}
	}
}
