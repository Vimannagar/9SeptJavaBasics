package stringclassdisc;

public class MethodsOfString {
	
	public static void main(String[] args) {
//		1. length() 
		
		String s1 = "Pune";
		
		int countOfCharacter = s1.length();
		
		System.out.println(countOfCharacter);//4
		
		System.out.println("********************************************");
		
//		2. charAt(int i)
		
		String s2 = "Mumbai";
		
		char ch = s2.charAt(3);
		
		System.out.println(ch);//b
		
//		WAP to print all the character of string line by line
		
//		WAP to print reverse of string
		
//		3. equals
		
		String s3 = "Mumbai";
		
		String s4 = "mumbai";
		
	boolean isEqual = s3.equals(s4);
	
	System.out.println(isEqual);// false
	
//	4. equalsIgnoreCase(String)
	
	boolean isEquals = s3.equalsIgnoreCase(s4);
		
	System.out.println(isEquals);//true
		
	
//	5. toLowerCase()
	
	String s5 = "BangaloRe";
	
	
	String s6 = s5.toLowerCase();
	
	System.out.println(s6);//bangalore

	
//	6. toUpperCase()
	
	String s7 = "Chennai";
	
	
	String s8 = s7.toUpperCase();
	
	System.out.println(s8);//CHENNAI
	
//	7. subsString(int begin)
	
	String s9 = "Ahmednagar";
	
	String s10 = s9.substring(5);
	
	System.out.println(s10);//nagar
	
// 8 	subsString(int begin, int end)
	
	String s11 = "Srinagar";
	
	String s12 = s11.substring(0, 3);

	System.out.println(s12);
	
//	9. replace(char old, char new)
	
	String s13 = "Vishakhapattnam";
	
	String s14 = s13.replace('a', 'A');
	
	System.out.println(s14);//VishAkhApAttnAm
	
	
//	10. replace(String old, String new)
	
	String s15 = "Ahmedabad";
	
	String s16 = s15.replace("Ahmed", "Hyder");
	
	System.out.println(s16);//Hyderabad
	
//WAP to remove all the spaces from the string - this is string
	
//	11. trim()
	
	String s17 = "             Hello      World        ";
	
	String s18 = s17.trim();
	
	System.out.println(s18);//Hello      World
	
	
	
	
	
	
	
		
	}

}
