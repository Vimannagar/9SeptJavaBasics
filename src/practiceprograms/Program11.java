package practiceprograms;

public class Program11 {
	
	
	public static void main(String[] args) {
		
		String s = "45sadasd7sdsa12sdsads8";
		
		String num ="";
		
		int sum=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch= s.charAt(i);
			
			if(Character.isDigit(ch))
			{
			num	= num + ch;
			
			int number = Integer.parseInt(num);
			
			sum = sum+ number;
			
			num = "";
			}
		
		
		}
		
		System.out.println(sum);
		
	}

}
