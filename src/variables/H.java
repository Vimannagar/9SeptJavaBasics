package variables;

public class H {
	
	
	int i = 50;// global variable
	static int j = 90;// global variable
	
	String k = "def";
	
	public  void m2()
	{
		System.out.println(i);//50
		System.out.println(this.i);//50
		
		int i = 60;//local variable
		
		System.out.println(i);//60
		
		System.out.println(this.i);
		
		System.out.println(k);//def
		
		System.out.println(this.k);//def
		System.out.println(this.j);//90
		System.out.println(j);//90
		
		
		
		
		
	}
	
	public static void m1()
	{
		System.out.println(j);//90
		
		H h = new H();
		
		System.out.println(h.i);//50
		
//		System.out.println(this.j);// this keyword is not applicable inside the static area
	}
	
	
	public static void main(String[] args) {
		
		
//		System.out.println(this.i);// this keyword is not applicable inside the static area
		System.out.println(j);
	
		
	}
	
	
	

}
