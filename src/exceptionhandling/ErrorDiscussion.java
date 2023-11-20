package exceptionhandling;

public class ErrorDiscussion {
	
	public static void m1()
	{
		System.out.println("M1 method");
		m2();
	}
	
	public static void m2()
	{
		System.out.println("M2 method");
		m1();
	}
	
	public static void main(String[] args) {
		m1();
		
	}

}
