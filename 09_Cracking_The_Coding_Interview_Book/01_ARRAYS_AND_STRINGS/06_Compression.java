import java.util.Scanner;
public class Compression
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Compression obj = new Compression();
		System.out.println(obj.compress(str));
	}
	
	public String compress(String s)
	{
		String shortstring = "";
		int count = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			count++;
			if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1))
			{
				shortstring += "" + s.charAt(i) + count;
				count = 0; 
			}
		}
		
		return shortstring.length() < s.length() ? shortstring : s;
	}
}
