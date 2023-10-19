package constructordisc;

public class A {
	
//	Multiple constructors inside the class
	
	public A()
	{
		System.out.println("zero argument constructor");
	}
	
	public A(int i)
	{
		this();
		
		System.out.println("One argument constructor");
		
		System.out.println("Value of argument is "+i);
	}
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		A a2 = new A(10);
	
		
		
	}
	
	
	

}
