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
		String linebyline= "abc";
		for(int i = 0; i<linebyline.length(); i++)
		{
			
			char c = linebyline.charAt(i);
			
			System.out.println(c);
		}
		
//		WAP to print reverse of string
		System.out.println("*****************************");
		String reverse = "";//o//ol//oll//olle//olleH
		String s0 = "Hello";
		for(int i=s0.length()-1; i>=0; i-- )
		{
		 reverse = reverse + s0.charAt(i);
		}
		
		System.out.println("Reverse of String "+s0+" is "+reverse);//olleH
		
		
		
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
	System.out.println("***************************");
//	12. indexOf(char ch)
	
	String s19 = "abcdaf";
	
	int index = s19.indexOf('a');
	
	System.out.println(index);//2
	
	
//	13. split(String s)
	
	String s20 = "This is String";
	
	String[] s21 = s20.split(" ");
	
	for(String ss:s21)
	{
		System.out.println(ss);
	}
	
	
//	Assignment: WAP to reverse a String without reversing the characters
//	Input = This is String
//	Output = String is This
	
	
//	14. startsWith(String s)
	
	String s22 = "Denver";
	
	boolean isStarts = s22.startsWith("Den");
	
System.out.println(isStarts);//true
	

//15 . endsWith(String s)

String s23 = "New York";

boolean s24 = s23.endsWith("rk");

System.out.println(s24);//true

//Convert the primitive data type into String

int i = 20;

String s25 = String.valueOf(i);

System.out.println(s25+2);//202
	
	boolean s26 = false;
	String s27 = String.valueOf(s26);
	
	System.out.println(s27);//false
	
	
//	Convert the String into primitive data type
	
	String s28 = "60";
	
	int s29 = Integer.parseInt(s28);
	
	System.out.println(s29+2);//62
	
	
String s30 = "86.55";

double s31 = Double.parseDouble(s30);

System.out.println(s31);//86.55



//16. toCharArray()

String s32 = "pennsylvania";

char[] s33 = s32.toCharArray();

for(char cc:s33)
{
	System.out.println(cc);
}


//17. isDigit(char c)

char s34 = 'o';

boolean isnumber = Character.isDigit(s34);

System.out.println(isnumber);





	
	
		
	}

}
