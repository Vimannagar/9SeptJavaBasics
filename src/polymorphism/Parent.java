package polymorphism;

public  class Parent {

	
	final int i = 60;
	
	static final int j = 90;
	
	
	public int  home()
	{
		System.out.println("Home from parent");
		return 0;
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
	
	
	public final void marry()
	{
		System.out.println("Marry method suggested by Parent class");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		
		System.out.println(p.i);
		
		System.out.println(j);
		
		
		
		
	}
	
}
