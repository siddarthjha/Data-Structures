import java.util.Arrays;
public class Hash
{
	String arr[];
	int size;
	int items =0;
	public static void main(String[] args)
	{
		Hash obj = new Hash(30);
		String[] elements = {"1", "4", "2", "6", "8", "20", "10", "15"};
		obj.hashFun(elements, obj.arr);
		for(int i = 0; i < elements.length; i++)
		{
			int a = Integer.parseInt(elements[i]);
			
			System.out.println("Value = " + obj.arr[a] + " Position = " + a);
		}
	} 
	
	public void hashFun(String[] strings, String[] arr)
	{
		for(int n = 0; n < strings.length; n++)
		{
			String ele = strings[n];
			arr[Integer.parseInt(ele)] = ele;
		}
	}
	Hash(int size)
	{
		this.size = size;
		arr = new String[size];
		Arrays.fill(arr, "-1");
		
	}
	
	
}
