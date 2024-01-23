package collectiondisc;

import java.util.ArrayList;

public class ArrayListDisc {

	
	public static void main(String[] args) {
		
		
		String [] a = new String [3];// array
		
		a[0] = "abc";
		a[1] = "def";
		a[2] = "ghi";
	
		for(String aa:a)
		{
			System.out.println(aa);
		}
		
		ArrayList al = new ArrayList();// ArrayList which is the part of collection
		
		al.add("Pune");
		al.add(false);
		al.add(65);
		
		System.out.println(al);
		
		
		
		
		
		
		
		
	}
}
