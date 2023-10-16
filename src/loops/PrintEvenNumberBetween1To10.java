package loops;

public class PrintEvenNumberBetween1To10 {
	
	public static void main(String[] args) {
		
		int number = 1;
		
		
		while(number<=10)
		{
		
			int	remainder = number % 2;
			
			if(number !=1 && remainder==0)
			{
				System.out.println(number);
			}
			
			number = number + 1;
			
		}
		
		
		
		
		
	}

}
