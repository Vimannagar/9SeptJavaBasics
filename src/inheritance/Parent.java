package inheritance;

public class Parent extends GrandParent  {
	
	static String s = "abc";
	
	int i = 20;
	
	public void home()
	{
		System.out.println("Home from parent");
	}
	
	public void car()
	{
		System.out.println("Car from parent");
	}
	
	public void furniture()
	{
		System.out.println("furniture from parent");
	}
	
	public void capital()
	{
		System.out.println("Capital from parent");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.car();
		
//		p.bike();// this is not allowed because inheritance is applicable only in one direction
		
	}

}
