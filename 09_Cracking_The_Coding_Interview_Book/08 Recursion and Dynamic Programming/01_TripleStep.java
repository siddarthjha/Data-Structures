import java.util.Scanner;
class TripleStep
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		TripleStep obj = new TripleStep();
		System.out.println("Enter the number of stairs");
		int stairs = sc.nextInt();
		sc.close();
		System.out.println(obj.findStep(stairs));
		System.out.println(obj.findstep(stairs));
		
	}
	
	public int findStep(int stairs) // Recursive Solution- O(3^n)
	{
		if(stairs < 0)
			return 0;
		else if(stairs == 1 || stairs == 0)
			return 1;
		else if(stairs == 2)
			return 2;
		else
		{
			return findStep(stairs - 3) + findStep(stairs - 2) + findStep(stairs - 1);
		}
	}
	
	public int findstep(int stairs) // Dynamic Programming - O(n)
	{
		int count[] = new int[stairs + 1];
		count[0] = 1;
		count[1] = 1;
		count[2] = 2;
		for(int i = 3; i <= stairs; i++)
		{
			count[i] = count[i -1] + count[i -2] + count[i - 3];
		}
		return count[stairs];
	}
}
