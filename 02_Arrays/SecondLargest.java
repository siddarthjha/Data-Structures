public class SecondLargest
{
	public static void main(String[] args)
	{
		int arr[] = {1, 3, 7, 2, 6, 4, 9};
		int lar = arr[0], i = 0, s_lar = 0;
		for(i = 1; i < arr.length; i++)
		{
			lar = Math.max(lar, arr[i]);
		}
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i] != lar)
				s_lar = Math.max(s_lar, arr[i]);
		}
		System.out.println("Second Largest element is " + s_lar);
	}
}
