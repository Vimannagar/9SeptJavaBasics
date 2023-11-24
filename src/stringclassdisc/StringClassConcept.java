package stringclassdisc;

public class StringClassConcept {
	
	public static void main(String[] args) {
	String a = "abc";
		
	String b	= a + "software"; 
	
	System.out.println(b);//abcsoftware
	
	
	a.concat("software");
	
	System.out.println(a); // abc--> immutable
	
	System.out.println("********************************************");
//	string buffer
	
	
	StringBuffer sb = new StringBuffer("abc");
	
	sb.append("software");
	
	
	System.out.println(sb);// abcsoftware - mutable
	
	
	}

}
