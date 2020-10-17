public class RemoveEven
{
	public static void main(String[] args)
	{
		int arr[] = {1, 4, 7, 2, 6, 3, 9};
		int c = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 1)
				arr[c++] = arr[i];
		}
		for(int i = 0; i < c; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
