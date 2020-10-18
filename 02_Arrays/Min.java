public class Min
{
	public static void main(String[] args)
	{
		int arr[] = {1, 4, 7, 2, 6, 3, 9};
		int max = 0, res = arr[0], min = 0;
		for(int i = 1; i < arr.length; i++)
		{
			max = Math.max(res, arr[i]);
			min = Math.min(res, arr[i]);
		}
		System.out.println("The minimum element of array = " + min + " max = " + max);
	}
}
