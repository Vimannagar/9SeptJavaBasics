package polymorphism;

public class D {
	
	
	public void m1()
	{
		System.out.println("D class m1 method");
	}


	
	public void m1(int i)
	{
		System.out.println("D class m1 method");
	}
	
	public static void main(String[] args) {
		D d = new D();
		
		d.m1();
	}

}
