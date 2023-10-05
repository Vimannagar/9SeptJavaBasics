package callingofmethod;

public class B {

	
	public static void m4()
	{
		B b = new B();
		b.m5();//calling of non-static method into static method
		System.out.println("m4 method");
	}
	
	public void m5()
	{
		System.out.println("m5 method");
	}
	
//	calling of non static into another non static method
	
	public void m6()
	{
		System.out.println("non static m6 method");
	}
	
	
	public void m7()
	{
		m6();
		System.out.println("non static m7 method");
	}
	
	
	
	public static void main(String[] args) {
		m4();
		
		B b = new B();
		b.m7();
	}
	
	
}
