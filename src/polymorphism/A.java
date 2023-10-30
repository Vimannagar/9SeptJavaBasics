package polymorphism;

public class A {
	
	public A()
	{
		System.out.println("0 argument constructor");
	}
	
	public A(int i)
	{
		System.out.println("1 argument constructor");
	}
	
	public void m1()
	{
		System.out.println("Method with 0 argument");
	}
	
	public static void m1(String s)
	{
		System.out.println("M1 static method");
		
		System.out.println(s);
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
	
	public int m1(int i, boolean b)
	{
		return 50;
	}
	
	 int m1(int i, boolean b, String s)
	{
		return 50;
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.m1(90);
		
		m1("Daniel");
		
		
	}
}
