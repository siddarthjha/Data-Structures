import java.util.Scanner;
public class Power
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number(Base) for power");
		int n = sc.nextInt();
		System.out.println("Enter the n-th power(Exponent)");
		int x = sc.nextInt();
		sc.close();
		int temp = 1;
		for(int i = 0; i < x; i++)
		{
			temp = temp * n;
			System.out.print(temp + " ");
		}
		System.out.println("final = " + temp);
	}
}
