package practiceprograms;

public class Program5 {
	
	public static void main(String[] args) {
		String s = "hfjabcsdhfabcjsdkfabchksd";
		
		String pattern = "abc";
		int count =0;
		int end = 3;
		int numberOfCombination = s.length()-2;
		
		String [] sarray = new String[numberOfCombination];
	
		for(int startingIndex=0; end<=s.length(); end++)
		{
			String value = s.substring(startingIndex, end);
			
			sarray[startingIndex]= value;
			
			startingIndex++;
			
		}
		
		for(String data:sarray)
		{
		if(data.equals(pattern))
		{
			count++;
		}
			
		}
		
		System.out.println(count);
		
	}

}
