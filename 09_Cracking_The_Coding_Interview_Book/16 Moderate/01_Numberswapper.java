import java.util.Scanner;
class Numberswapper
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the Second number");
		int b = sc.nextInt();
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a = " + a + " b = " + b);
		
	}
}
