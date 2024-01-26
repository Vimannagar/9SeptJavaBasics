package collectiondisc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceDisc {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(12, "Pune");// to add the data inside the hashmap
		hm.put(15, "Solapur");
		hm.put(100, "Chinchwad");
		hm.put(7, "Borivali");
		hm.put(100, "Pimpri");
		hm.put(150, "Pimpri");
		
		System.out.println(hm);//{100=Pimpri, 150=Pimpri, 7=Borivali, 12=Pune, 15=Solapur}
		
		
		Set<Integer> allKeys = hm.keySet();// to get all the keys from the hashmap
		
		
		for(int key :allKeys)
		{
			System.out.println(key);
		}
		
		Collection<String> allValues = hm.values();// To get all the values from the hashmap
		
		for(String value:allValues)
		{
			System.out.println(value);
		}
		
		
		boolean isKeyPresent = hm.containsKey(100);
		
		System.out.println(isKeyPresent);//true
		
		boolean isPresent = hm.containsValue("Chinchwad");
		
		System.out.println(isPresent);//false
		
		String valueReturned = hm.get(100);
		
		System.out.println(valueReturned);//Pimpri
		
		
		
		Set<Entry<Integer, String>> keyvalue = hm.entrySet();
		
		for(Entry<Integer, String> kv :keyvalue)
		{
		Integer key = kv.getKey();
		
		String value = kv.getValue();
		
		System.out.println(key+" "+value);
		}
		
		
		
LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(12, "Pune");// to add the data inside the hashmap
		lhm.put(15, "Solapur");
		lhm.put(100, "Chinchwad");
		lhm.put(7, "Borivali");
		lhm.put(100, "Pimpri");
		lhm.put(150, "Pimpri");
		
		System.out.println(lhm);//{12=Pune, 15=Solapur, 100=Pimpri, 7=Borivali, 150=Pimpri}
		
		
		
		
		
		
	}

}
