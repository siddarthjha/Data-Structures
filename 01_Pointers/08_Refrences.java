class A
{
	void fun()
	{
		System.out.println("Function");
	}
}
public class Refrences
{
	public static void main(String[] args)
	{
    // Any time you are creating an object in java you are creating a pointer to object
		A obj = new A();
		// obj is a reference of A containg it's address of A's object
		obj.fun();
	}
}
