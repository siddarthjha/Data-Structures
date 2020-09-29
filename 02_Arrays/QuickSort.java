public class QuickSort
{
	public static void main(String [] args)
	{
		QuickSort obj = new QuickSort();
		int arr [] = {3, 1, 5, 9, 12, 4, 6, 10};
		int n = arr.length - 1;
		obj.sort(arr, 0, n);
		for(int i = 0; i < arr.length -1; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void sort(int arr[], int start, int end)
	{
		int piv;
		if(start < end)
		{
			piv = partition(arr, start, end);
			sort(arr, start, piv - 1);
			sort(arr, piv + 1, end);
		}
	}
	
	public static int partition(int arr[], int start, int end)
	{
		int left, right, temp, piv, flag = 0;
		piv = left = start;
		right = end;
		while(flag != 1)
		{
			while((arr[piv] <= arr[right]) && (piv != right))
			{
				right--;
			}
			if(piv == right)
			{
				flag = 1;
			}
			else if(arr[piv] > arr[right])
			{
				temp = arr[piv];
				arr[piv] = arr[right];
				arr[right] = temp;
				piv = right;
			}
			if(flag != 1)
			{
				while((arr[piv] >= arr[left]) && (piv != left))
				{
					left++;
				}
				if(piv == left)
					flag = 1;
				else if(arr[piv] < arr[left])
				{
					temp = arr[piv];
					arr[piv] = arr[left];
					arr[left] = temp;
					piv = left; 
				}
			}
		}
		
		return piv;
	}
}

