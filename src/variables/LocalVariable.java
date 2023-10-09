package variables;

public class LocalVariable {
	
	int u = 80;// non static variable
	static int j = 80;// static variable
	
	public static void m1()
	{
		int i = 20;// local variable
		
		System.out.println(i);
	}
	
	
	public void m2()
	{
		int k = 60;
		
		System.out.println(k);
		
		System.out.println(u);
	}
	
	
	
	
	public static void main(String[] args) {
		
		int l = 80;// local variable
		String s = "abc";// local variable
		
		System.out.println(l);//80
		System.out.println(s);//abc
		
		System.out.println("*****************************************");
		
		LocalVariable lv = new LocalVariable();
		
		lv.m2();
		
		
		
	}

}
