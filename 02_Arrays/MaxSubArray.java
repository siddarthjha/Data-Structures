public class MaxSubArray
{
	public static void main(String[] args)
	{
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		MaxSubArray obj = new MaxSubArray();
		System.out.println("Max = " + obj.subArray(arr));
	} 
	
	public int subArray(int arr[])
	{
		int result = arr[0];
    	int sum = arr[0];
 
    	for(int i = 1; i < arr.length; i++)
		{
			System.out.println("res = " + result + " sum = " + sum);
        	sum = Math.max(arr[i], sum + arr[i]);
        	result = Math.max(result, sum);
   		}
 
    	return result;
	}
}
