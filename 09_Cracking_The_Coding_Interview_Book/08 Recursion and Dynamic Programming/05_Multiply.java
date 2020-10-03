import java.util.Scanner;
class Multiply
{
	public static void main(String[] args)
	{
		Multiply obj = new Multiply();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for multiplication:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(obj.mul(x, y));
		
	}
	
	public int mul(int a, int b)
	{
		int x = a > b ? a : b;
		int y = a > b ? b : a;
		if(y == 0 || x == 0)
			return 0;
		if(y > 0)
			return (x + mul(x, y-1));
		if(y < 0)
			return -mul(x, -y);
		return -1;
		
	}
}
