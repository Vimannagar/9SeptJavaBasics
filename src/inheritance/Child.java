package inheritance;

public class Child extends Parent
{
	
	
	public void bike()
	{
		System.out.println("Bike from child");
	}

	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.home();
		
		c.car();
		
		c.bike();
		
	}
}
