public class Sort
{
	public static void main(String [] args)
	{
		int arr[] = {1, 6, 7, 10, 2, 69, 40, 23, 58};
		System.out.println("The array initially");
		for(int i = 0; i < arr.length - 1; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Sort obj = new Sort();
		obj.SelectionSort(arr);
		obj.BubbleSort(arr);
	}
	
	public void SelectionSort(int arr[])
	{
		for(int i = 0; i < arr.length -2; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Selection Sort Result:");
		for(int  i = 0; i < arr.length - 1; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void BubbleSort(int arr[])
	{
		for(int i = 0; i <arr.length; i++)
		{
			for(int j = ; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					
				}
			}
		}
	}
}
