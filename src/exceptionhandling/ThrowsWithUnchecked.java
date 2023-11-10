package exceptionhandling;

public class ThrowsWithUnchecked {
	
	
	public static void main(String[] args) throws ArithmeticException
	{
		
		int i = 0;
		
		int j = 0;
		
		int k = i/j;
		
		System.out.println(k);
		
	}

}
