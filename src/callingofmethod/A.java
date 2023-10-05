package callingofmethod;

public class A {
	
	
	public static void m1()
	{
		System.out.println("m1 method");
	}
	
	
	public void m3()
	{
		System.out.println("m3 method");
		m1();// calling of static method inside the non static method
	}
	
	
	
	

	public static void m2()
	{
		m1();// calling of static into another static method		
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		m2();
		System.out.println("*************************************");
		
		A a = new A();
		
		a.m3();
		
		
	}

}
