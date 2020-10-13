public class SubProductArray
{
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5, 6};
		SubProductArray obj = new SubProductArray();
		obj.product(arr);
	} 
	
	public void subArray(int arr[]) // With Division
	{
		int pr = 1;
		for(int i = 0; i < arr.length; i++)
		{
			pr = pr * arr[i];
		}
		for(int  i = 0; i < arr.length; i++)
		{
			arr[i] = pr / arr[i];
		}
		for(int  i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public void product(int arr[]) // Without Division
	{
		int n = arr.length;
		int l[] = new int[n];
		int r[] = new int[n];
		l[0] = 1;
		r[n - 1] = 1;
		for(int i = 1; i < n; i++)
		{
			l[i] = arr[i - 1] * l[i - 1];
		}
		for(int j = n - 2; j >= 0; j--)
		{
			r[j] = arr[j + 1] * r[j + 1];
		}
		for(int i = 0; i < n; i++)
		{
			l[i] = l[i] * r[i];
		}
		for(int i = 0; i < n; i++)
		{
			System.out.println(l[i] + " ");
		}
	}
}
