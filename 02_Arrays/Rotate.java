public class Rotate
{
	public static void main(String[] args)
	{
		int arr[] = {1, 4, 7, 2, 6, 3, 9};
		Rotate obj = new Rotate();
		obj.left(arr, 2);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		obj.right(arr, 3);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public void left(int arr[], int n)
	{
		int x = arr.length;
		int temp [] = new int[x];
		for(int i = 0; i < n; i++)
		{
			temp[i] = arr[i];
		}
		for(int i = n; i < x; i++)
		{
			arr[i - n] = arr[i];
		}
		for(int i = 0; i < n; i++)
		{
			arr[i + x - n] = temp[i];
		}
	}
	
	public void right(int arr[], int n)
	{
		int x = arr.length;
		int temp [] = new int[x - n];
		for(int i = 0; i < x - n; i++)
		{
			temp[i] = arr[i];
		}
		for(int i = x - n; i < x; i++)
		{
			arr[i - n - 1] = arr[i];
		}
		for(int i = 0; i < x - n; i++)
		{
			arr[i + n] = temp[i];
		}
	}
}