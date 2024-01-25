package collectiondisc;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayIntoCollection {
	
	public static void main(String[] args) {
//		Conversion of array into ArrayList
		
		String [] s = new String [5];
		
		s[0] = "one";
		s[1] = "two";
		s[2] = "Three";
		s[3] = "four";
		s[4] = "five";

		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(al);
		
		
//		Conversion of arraylist into Array
		
		
		String [] ss = new String[5];
		
		
		
		al.toArray(ss);
		
		for(String sss:ss)
		{
			System.out.println(sss);
		}
		
		
		
		
	}

}
