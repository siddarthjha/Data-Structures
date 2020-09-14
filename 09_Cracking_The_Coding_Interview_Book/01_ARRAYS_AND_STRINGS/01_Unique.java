import java.util.Scanner;
public class Unique
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string..");
		String s = sc.nextLine();
		boolean b = isUniqueChars(s);
		if(b)
			System.out.println("Entered String has unique Characters");
		else
			System.out.println("Entered String doesn't have unique Characters");
	}
	
	public static boolean isUniqueChars(String str) 
	{
		if (str.length() > 128) 
		{
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length()-1; i++)
		{
			int val = str.charAt(i);
			if (char_set[val]) 
				return false;
			char_set[val] = true;
		}
		return true;
	}
	
}
