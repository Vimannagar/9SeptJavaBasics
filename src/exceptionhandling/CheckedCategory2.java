package exceptionhandling;

public class CheckedCategory2 {
	
	
	public static void main(String[] args)   {
		
		
		System.out.println("This is first line");
		
		try {
		Thread.sleep(5000);
		}
		catch (InterruptedException e) 
		{
			System.out.println("Catch block is executing");
		}
		
		System.out.println("This is last line");
	}

	
//	final vs finally vs finalize
}
