package method;

public class StaticMethod {
	
	
//	Syntax:
//	public static void method_name()
//	{
//		logic which we want to run	
//	}
	
	
	public static void methodOne()
	{		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
	}
	
	public static void addition()
	{
		int a = 10;
		
		int b = 50;
		
		int c =  a+b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
//		calling the static method inside the main method-- > directly methodname();
	
		addition();
		
		methodOne();
		
		methodOne();
		
		methodOne();
		addition();
		
//		Calling static method using second way-> classname.methodname();
		
		StaticMethod.addition();
		
		
		
	}
	
	
	
	

}
