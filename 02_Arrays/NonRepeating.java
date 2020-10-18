import java.util.*;
public class NonRepeating
{
	public static void main(String[] args)
	{
		int arr[] = {1, 4, 7, 2, 6, 4, 1};
		Map<Integer, Integer> obj = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++)
		{
			if(obj.containsKey(arr[i]))
			{
				obj.put(arr[i], obj.get(arr[i]) + 1);
			}
			else
			{
				obj.put(arr[i], 1);
			}
		}
		for(int i = 0; i < arr.length; i++)
		{	
			if(obj.get(arr[i]) == 1)
			{
				System.out.println("The First non repeating element is " + arr[i]);
				break;
			}
		}
	}
}
