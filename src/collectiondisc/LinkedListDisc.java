package collectiondisc;

import java.util.LinkedList;

public class LinkedListDisc {
	
	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();

		al.add("Pune");// to add the data inside the collection
		al.add("Mumbai");
		al.add("Delhi");
		al.add("Chennai");

		System.out.println(al);//[Pune, Mumbai, Delhi, Chennai]

		al.remove("Delhi");// to remove the data from collection

		System.out.println(al);//[Pune, Mumbai, Chennai]

		al.set(2, "Bengaluru");// to update a value at a specific position

		System.out.println(al);//[Pune, Mumbai, Bengaluru]
		
		LinkedList<String> al2 = new LinkedList<String>();
		
		al2.addAll(al);// to add a particular collection inside another collection
		
		al2.add("Kanpur");
		
		System.out.println(al2);//[Pune, Mumbai, Bengaluru, Kanpur]
		
		String valueAtThirdIndex = al2.get(3);
		
		System.out.println(valueAtThirdIndex);
		
		LinkedList<String> al3 = new LinkedList<String>();
		
		al3.add("Satara");
		al3.add("Baramati");
		al3.add("Navi Mumbai");
		
		al2.addAll(al3);
		
		
		System.out.println(al2);//[Pune, Mumbai, Bengaluru, Kanpur, Satara, Baramati, Navi Mumbai]
		
		
		al2.removeAll(al);// To remove all the content of al from al2
		
		System.out.println(al2);//[Kanpur, Satara, Baramati, Navi Mumbai]
		
		boolean isPresent = al2.containsAll(al);// this will check whether a collection - al2 has content of al
		
		System.out.println(isPresent);//false
		
		boolean isBaramatiPresent = al2.contains("Baramati");
		
		System.out.println(isBaramatiPresent);//true
		
		al2.retainAll(al3);// This method is to retain all the content of al3 from al2 and remove apart from that
		
		System.out.println(al2);//[Satara, Baramati, Navi Mumbai]
		
	}

}
