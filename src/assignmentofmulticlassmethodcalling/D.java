package assignmentofmulticlassmethodcalling;

public class D extends E{
	
	
	
	public void m10()
	{
		System.out.println("*******M10 method started******************");
		
		a.m3();
		b.m4();
		c.m9();
		
		System.out.println("*******M10 method end******************");
	}
	
	

	public void m11()
	{
		System.out.println("*******M11 method started******************");
		
		c.m7();
		a.m2();
		
		System.out.println("*******M11 method end******************");
	}
	
	
	
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m10();
		
		d.m11();
		
		
	}
	
	
	

}
