package practiceprograms;

public class Program2 {
	
	
	public static void main(String[] args) {
		
		String number="";
		String s = "5dsd60sdsdhkjashdas32a61asdsa9";
		int sum = 0;
		
	boolean	isNumberPresent = false;
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isDigit(c))
			{
			number	= number + c;
			isNumberPresent = true;
			if(i!=s.length()-1)
			{
				continue;
			}
			
			
			}
			
			if(isNumberPresent)
			{
				int value = Integer.parseInt(number);
				number = "";
				isNumberPresent = false;
			sum = sum + value;
			}
			
			
			
		}
		
		System.out.println("Total sum is "+sum);
			
		
		
		
	}

}
