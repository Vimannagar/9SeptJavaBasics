package loops;

public class BreakKeyword {
	
	
	
		
		public static void main(String[] args) {
			int number = 2;
			for(int i=1; i<=10; i= i+1)
			{
				int multiResult= number*i;
				
				System.out.println(number+" x "+i+" = "+multiResult);
				
				if(i==5)
				{
					break;
				}
				
			}
			
			
			
		
		
		
	}

}
