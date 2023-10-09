package callingofmethod;

public class C {
	
	public void m8()
	{
		B b = new B();
		
		b.m6();
		System.out.println("Method 8");
	}
	
	public static void main(String[] args) {
		
		
		C c = new C();
		
		c.m8();
		
		
	}

}
