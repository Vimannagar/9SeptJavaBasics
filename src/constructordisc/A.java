package constructordisc;

public class A {
	
//	Multiple constructors inside the class
	
	public A()
	{
		System.out.println("zero argument constructor");
		System.out.println("**************Zero argument*****************");
	}
	
	public A(int i)
	{
		this();
		
		System.out.println("One argument constructor");
		
		System.out.println("Value of argument is "+i);
		System.out.println("**************one argument*****************");
	}
	
	public A(String s, boolean b)
	{
		this(60);
		
		System.out.println("2 argument constructor");
		System.out.println(s+b);
		System.out.println("**************two argument*****************");
	}
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		A a2 = new A(10);
	
		
		A a3 = new A("abc", false);
		
		
	}
	
	
	

}
