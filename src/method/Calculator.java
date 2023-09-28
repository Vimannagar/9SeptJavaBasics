package method;

public class Calculator {
	
	public static void addition()
	{
		int a = 10;
		
		int b = 50;
		
		int c =  a+b;
		
		System.out.println(c);
	}
	
	public static void substraction()
	{
		int a = 10;
		
		int b = 50;
		
		int c =  a-b;
		
		System.out.println(c);
	}
	
	public static void multiplication()
	{
		int a = 10;
		
		int b = 50;
		
		int c =  a*b;
		
		System.out.println(c);
	}
	
	public static void division()
	{
		double a = 10;
		
		double b = 50;
		
		double c =  a/b;
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		addition();//60
		
		substraction();//-40
		
		multiplication();//500
		
		division();//0.2
		
	}

}
