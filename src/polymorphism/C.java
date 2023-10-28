package polymorphism;

public class C extends B {

	
	public void m1()
	{
		System.out.println("C class m1 method");
	}
	
	public void m2()
	{
		System.out.println("C class m2 method");
	}
	
	
	
	public static void main(String[] args) {
		
		C c = new C();
		c.m1();//C class m1 method
		
		B b = new B();
		
		b.m1();// B class m1 method
		
		
		B bb = new C();
		
//		C cc = new B(); - This object is invalid as Parent class can hold the child class object but child class cannot hold parent class object
		
		bb.m1();// C class m1 method
		
		bb.m2();//C class m2 method
		
		bb.m3();// B class m3 method.
		
	}
}
