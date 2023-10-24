package polymorphism;

public class A {
	
	public void m1()
	{
		System.out.println("Method with 0 argument");
	}

	
	public void m1(int i)
	{
		System.out.println("method with 1 argument");
	}

	
	public void m1(int i, String s)
	{
		System.out.println("method with 2 argument");
	}
	
	
	public void m1(String s, int i)
	{
		System.out.println("method with 2 argument");
	}
}
