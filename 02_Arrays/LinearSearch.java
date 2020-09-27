import java.util.Scanner;
public class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinearSearch obj = new LinearSearch();
		int[] ar = {1, 9, 7, 2, 6, 10, 4, 6}; 
		obj.search(sc, ar);
	}
	
	public void search(Scanner sc, int ar[])
	{
		System.out.println("The array is:");
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the element to search");
		int s = sc.nextInt();
		int c = 0;
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] == s)
			{
				System.out.println("The element is found at position: " + i);
				c++;
				break;
			}
		}
		if(c == 0)
			System.out.println("The element not found in array.");
	}
}
