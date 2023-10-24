package inheritance;

public class B extends A
{
	String ps1 = "Mumbai";
	
	public void m4()
	{
		System.out.println(this.ps1);//mumbai
		
		System.out.println(super.ps1);//Pune
		
		System.out.println("m4 method");
	}

	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m4();
		
		b.m1();
		
		b.m2();
		
		m3();
		
		System.out.println(b.ps1);// mumbai
		
		
	}
}
