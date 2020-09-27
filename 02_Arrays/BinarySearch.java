import java.util.Scanner;
public class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BinarySearch obj = new BinarySearch();
		int arr[] = {1, 8, 9, 12, 13, 20, 26, 34, 36, 40};
		for(int  i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the element for search");
		int s;
		s = sc.nextInt();
		obj.search(0, arr.length - 1, arr, s);
	}
	
	public void search(int start, int last, int arr[], int s)
	{
		int mid = (start + last)/2;
		while(start <= last)
		{
			if(arr[mid] == s)
			{
				System.out.println("Element found at position " + mid);
				return;
			}
			else if(s > arr[mid])
			{
				start = mid + 1;
			}
			else if(s < arr[mid])
			{
				last = mid - 1;
			}
			mid = (start + last)/2;
		}
		if(start > last)
			System.out.println("Element Not found");
	}
}
