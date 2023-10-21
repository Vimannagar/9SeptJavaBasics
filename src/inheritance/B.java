package inheritance;

public class B extends A
{
	
	public void m4()
	{
		System.out.println("m4 method");
	}

	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m4();
		
		b.m1();
		
		b.m2();
		
		m3();
		
		
		
	}
}
