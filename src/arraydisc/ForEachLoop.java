package arraydisc;

public class ForEachLoop {
	
	
	public static void main(String[] args) {
		
		int a [] = {85, 5, 2, 76, 102, 98};
		
		for(int t:a)
		{
			System.out.println(t);
		}
		
		String [] s = new String[3];
		
		s[0] = "Pune";
		
		s[1] = "Bangalore";
		
		s[2] = "Delhi";
		
		for(String ss:s)
		{
			System.out.println(ss);
		}
		
	}

}
