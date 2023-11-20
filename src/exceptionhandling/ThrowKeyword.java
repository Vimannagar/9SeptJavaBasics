package exceptionhandling;

public class ThrowKeyword {
	
	
	public static void main(String[] args)
	{
		
		int i = 50;
		
		int j = 20;
		
		if(i>j)
		{
			throw new NullPointerException("something went wrong please try again later !!!");
		}
	}

}
