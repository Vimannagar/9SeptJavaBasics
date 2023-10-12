package categoriesofmethod;

public class C {
	
//method with return type and with argument
	
	public static String m9(String s, int i)
	{
		String word = s+" "+i;
		
		System.out.println(word);
		
		return word;
	}
	
	public int m10(String a, boolean b)
	{
		String c =a+b;
		
		return 50;
	}
	
	
	public static void main(String[] args) {
		String s1= m9("India",7);//India 7
		
		String area = s1+" largest country";
		
		System.out.println(area);// India 7 largest country
		
		
		System.out.println(m9("Russia", 1));
		
		C c = new C();
		
		System.out.println(c.m10("abc", false));//50
		
		
	}
	
}
