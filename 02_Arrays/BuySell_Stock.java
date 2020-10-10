public class BuySell_Stock
{
	public static void main(String [] args)
	{
		int arr[] = {8, 5, 7, 1, 6, 4, 10, 2};
		int min = Integer.MAX_VALUE;
		int profit = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
			else if(arr[i] - min > profit)
				profit = arr[i] - min;
		}
		System.out.println("Profit = " + profit);
	}
}
