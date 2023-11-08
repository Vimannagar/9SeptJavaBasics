package exceptionhandling;

public class TryCatchCombination {
	
	
	public static void main(String[] args) {
		
		try
		{
			int i = 10/0;
		}
		catch (NullPointerException e) {
			
			System.out.println("Null pointer exception arrived");
			
		}
		catch (ArrayIndexOutOfBoundsException a) {
			
			System.out.println("Array index out of bound exception arrived");
			
		}
		catch(StringIndexOutOfBoundsException r)
		{
			System.out.println("String index out of bound");
		}
		
		
		
		
	}

}
