package exceptionhandling;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		
		int k;
		try {// all risky code
		
		int i = 10;
		
		int j = 0;
		
		 k = i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception arrived hence executing the catch block");
			k= 2;
		
		}
		
		
		System.out.println(k);
		
		System.out.println("20th line");
		
		
		
		System.out.println("last line");
		
		
	}

}
