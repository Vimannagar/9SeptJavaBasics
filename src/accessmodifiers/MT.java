package accessmodifiers;

public class MT {
	
	public static void m1()
	{
		System.out.println("public m1 method from MT class");
	}
	
	
	static void m2()
	{
		System.out.println("default static m2 method from MT class");
	}
	
	private void m3()
	{
		System.out.println("Private m3 method");
		
	}
	
	public static void main(String[] args) {
		
		
		MT mt = new MT();
		
		mt.m3();
	}

}
