class MagicIndex
{
	public static void main(String[] args)
	{
		MagicIndex obj = new MagicIndex();
		int arr[] = {-1, 0, 1, 2, 4, 6, 7, 8, 10};
		obj.magic(arr, 0, arr.length - 1);
	}
	
	public void magic(int arr[], int start, int end)
	{
		int mid = (start + end)/ 2;
		while(start <= end)
		{
			if(arr[mid] == mid)
			{
				System.out.println("The magic index is " + mid);
				break;
			}
			else if(arr[mid] > mid)
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			mid = (start + mid)/ 2;
			
		}
	}
}
