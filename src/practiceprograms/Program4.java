package practiceprograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Program4 {
	
	public static void main(String[] args) {
		
		String s = "abcdefabcdefaabbcc";
		
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
		char charValue 	=	s.charAt(i);
		
		if(hm.containsKey(charValue))
		{
			hm.put(charValue, hm.get(charValue)+1);
		}
		else
		{
			hm.put(charValue, 1);
		}
			
		}
		
		System.out.println(hm);
		
		Set<Entry<Character, Integer>> hmValue = hm.entrySet();
		
		for(Entry<Character, Integer> kv:hmValue)
		{
			Character keyValue = kv.getKey();
			
			Integer values = kv.getValue();
			
			if(values>=3)
			{
				System.out.println(keyValue);
			}
		}
		
	}

}
