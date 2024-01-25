package collectiondisc;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> al = new HashSet<Integer>();
		
		al.add(50);
		al.add(10);
		al.add(50);
		al.add(60);
		al.add(2);
		al.add(41);
		al.add(102);
		al.add(8);
		al.add(null);
		al.add(null);
		System.out.println(al);//[null, 50, 2, 102, 8, 41, 10, 60]
		
		
LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
lhs.add(50);
lhs.add(10);
lhs.add(50);
lhs.add(60);
lhs.add(2);
lhs.add(41);
lhs.add(102);
lhs.add(8);
lhs.add(null);
lhs.add(null);
		System.out.println(lhs);//[50, 10, 60, 2, 41, 102, 8, null]
		
			
	}

}
