package collectiondisc;

import java.util.ArrayList;

public class ArrayListDisc2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Pune");// to add the data inside the collection
		al.add("Mumbai");
		al.add("Delhi");
		al.add("Chennai");

		System.out.println(al);//[Pune, Mumbai, Delhi, Chennai]

		al.remove("Delhi");// to remove the data from collection

		System.out.println(al);//[Pune, Mumbai, Chennai]

		al.set(2, "Bengaluru");// to update a value at a specific position

		System.out.println(al);//[Pune, Mumbai, Bengaluru]
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.addAll(al);// to add a particular collection inside another collection
		
		al2.add("Kanpur");
		
		System.out.println(al2);//[Pune, Mumbai, Bengaluru, Kanpur]
		
		
	}

}
