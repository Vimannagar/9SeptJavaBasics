package polymorphism;

public class Child extends Parent {

	public void bike()
	{
		System.out.println("Bike from child");
	}
	
	public void furniture()
	{
		System.out.println("Furniture method from Child class");
	}
	
	public int home()
	{
		System.out.println("Child class home method");
	int rent = 15000;
		return rent;
	
	}
	
	public void childMarry()
	{
		System.out.println("Marry method by Child class");
	}
	
	public void capital()
	{
		System.out.println("Capital from parent");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Child c  = new Child();
			
		c.home();
		
		c.furniture();
		
		c.marry();
		
		
		
	
	}
	
	
}
