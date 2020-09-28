public class MergeSort
{
	public static void main(String [] args)
	{
		MergeSort obj = new MergeSort();
		int arr [] = {3, 1, 5, 9, 12, 4, 6, 10};
		int n = arr.length - 1;
		obj.sort(arr, 0, n);
		for(int i = 0; i < arr.length -1; i++)
			System.out.print(arr[i] + " ");
	}
	
	public void sort(int arr[], int start, int end)
	{
		int mid;
		if(start < end)
		{
			mid = (start + end)/2;
			sort(arr, start, mid);
			sort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
		
	}
	
	public void merge(int arr[], int start, int mid, int end)
	{
		int l = mid - start + 1;
		int r = end - mid;
		
		int larr[] = new int[l];
		int rarr[] = new int[r];
		
		for(int i = 0; i < l; ++i)
		{
			larr[i] = arr[start + i];
		}
		for(int  j = 0; j < r; ++j)
		{
			rarr[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = start;
		while(i < l && j < r)
		{
			if(larr[i] <= rarr[j])
			{
				arr[k] = larr[i];
				i++;
			}
			else
			{
				arr[k] = rarr[j];
				j++;
			}
			k++;
		}
		while(i < l)
		{
			arr[k] = larr[i];
			i++;
			k++;
		}
		while(j < r)
		{
			arr[k] = rarr[j];
			j++;
			k++;
		}
		
	}
	
	
}
