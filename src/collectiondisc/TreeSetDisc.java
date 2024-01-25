package collectiondisc;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDisc {
	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(50);
		ts.add(10);
		ts.add(50);
		ts.add(60);
		ts.add(2);
		ts.add(41);
		ts.add(102);
		ts.add(8);
	
		
		System.out.println(ts);//[2, 8, 10, 41, 50, 60, 102]
		
//		descending order
		
		NavigableSet<Integer> desSet = ts.descendingSet();
		
		System.out.println(desSet);
	}

}
