package practiceprograms;

public class Program3 {
	
	public static void main(String[] args) {
		String s = "hjhakfhj";
		int count =0;
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c == 'j')
			{
				count = count +1;
			}
		}
		
		System.out.println(count);
		
		
	}

}
