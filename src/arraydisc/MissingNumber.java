package arraydisc;

public class MissingNumber {
	
	
	public static void main(String[] args) {
		
		
		int a [] = {1, 2, 3, 4, 6, 7};
		
//		WAP to print the missing number from Array
		
		
		for(int i=0; i<a.length-1; i++)
		{
			boolean isCorrect = a[i] + 1 == a[i+1];
			
			if(!isCorrect)
			{
				System.out.println(a[i]+1);
			}
		}
	}

}
