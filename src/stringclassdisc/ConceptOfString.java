package stringclassdisc;

public class ConceptOfString {
	
	public static void main(String[] args) {
//		There are 2 ways to define the string
		
		String s1 = new String("abc");
		
		String s2 = new String("def");
		
		String s3 = new String("abc");
		
		String s4 = "ghi";
		
		String s5 = "abc";
		
		String s6 = "ghi";
		
//		equals method- It compares the content of 2 string values
		
		boolean isequal = s4.equals(s6);
		
		System.out.println(isequal);
		
		boolean isEqual2 = s5.equals(s1);
		
		System.out.println(isEqual2);
		
//		== it is used to check whether the string is pointing to the same object or not
		
		boolean isequal3 = s5 == s1;
		System.out.println(isequal3);
		
		boolean isequal4 = s4==s6;
		
		System.out.println(isequal4);
		
		
		
	}

}
