package abstractdiscussion;

public class C extends B
{
	public void f6() {
	System.out.println("f6 from c class");
	
	}
	public static void main(String[] args) {
		C c = new C();
		
		c.f1();
		c.f2();
		c.f4();
		c.f6();
	}

}
