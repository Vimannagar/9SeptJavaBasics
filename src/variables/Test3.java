package variables;

public class Test3 {
	
	int i = 50;
	
	static String s = "abc";
	
	
	public void m1()
	{		
		int i = 80;
		
		System.out.println(i);//80
		
		System.out.println(this.i);//50
		
		System.out.println(s);//abc
		
		System.out.println(this.s);
		
	}
	
	public static void m2()
	{
		Test3 t3 = new Test3();
		System.out.println(t3.i);
		
		int i = 90;
		
		System.out.println(i);
		
	}
	
	
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		
		t3.m1();
	}

}
