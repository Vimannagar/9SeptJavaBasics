package interfacediscussion;

public class B extends A
{

	public void m2() {
		System.out.println("this is method 2 from B class");
	}
	
	
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m2();
		
		b.m1();
		
		b.m3();
		
	}

	
}
