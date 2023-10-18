package loops;

public class ContinueKeyword {
	
	
	
	public static void main(String[] args) {
		
		
		for(int i=1; i<=10; i++ )
		{
			int remainder = i%2;
			
			if(remainder ==0)
			{
				continue;
			}
			
			System.out.println(i);
		}
		
		
		
	}

}
