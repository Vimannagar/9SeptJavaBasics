package callingofmethod;

public class A {
	
	
	public static void m1()
	{
		System.out.println("m1 method");
	}
	
	

	public static void m2()
	{
		m1();		
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		m2();
	}

}
