package abstractdiscussion;

public abstract  class A {
	
	public int i = 50;
	
	public A()
	{
		System.out.println("zero argument constructor");
	}
	
	public void f1()
	{
		System.out.println("feature 1 code");
	}
	
	public void f2()
	{
		System.out.println("feature 2 code");
	}
	
	public static void f7()
	{
		System.out.println("Static method non-abstract from A Class");
	}
	
	public abstract void f3();
	
	public abstract void f4();
	
	public abstract void f5();
	
	
	public abstract void f6();
	
}
