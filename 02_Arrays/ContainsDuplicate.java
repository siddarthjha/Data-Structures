import java.util.Arrays;
public class ContainsDuplicate
{
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 1, 3};
		Arrays.sort(arr); // We can use any sort algorithm which gives runtime of O(n.logn)
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] == arr[i + 1])
				System.out.println("Duplicate");
		}
	}
}
