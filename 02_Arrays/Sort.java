public class Sort
{
	public static void main(String [] args)
	{
		int arr[] = {1, 6, 7, 10, 2, 69, 40, 23, 58};
		System.out.println("The array initially");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Sort obj = new Sort();
		obj.SelectionSort(arr);
		obj.BubbleSort(arr);
		obj.InsertionSort(arr);
	}
	
	public void SelectionSort(int arr[])
	{
		for(int i = 0; i < arr.length - 1; i++)
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
		for(int  i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void BubbleSort(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Bubble Sort Sort Result:");
		for(int  i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void InsertionSort(int arr[])
	{
		for(int i = 1; i < arr.length; i++)
		{
			int val = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > val)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = val;
		}
		System.out.println("Insertion Sort Sort Result:");
		for(int  i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
