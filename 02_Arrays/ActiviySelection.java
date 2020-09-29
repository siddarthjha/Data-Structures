public class ActiviySelection
{
	public static void main(String [] args)
	{	
		ActiviySelection obj = new ActiviySelection();
		int s[] = {1, 3, 4, 5, 3, 7, 10, 8, 8, 12, 13};
		int f[] = {4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15}; // Already sorted in ascending order
		obj.schedule(s, f, s.length);
	}
	
	public void schedule(int s[], int f[], int len)
	{
		int i, j;
		i = 0;
		System.out.println("The activities selected are :");
		System.out.print(i + " ");
		for(j = 1; j < len; j++)
		{
			if(s[j] >= f[i])
			{
				System.out.print(j + " ");
				i = j;
			}
		}
	}
}
