package categoriesofmethod;

public class A {
	
	
//	no return and no argument
	
	public void m1()
	{
		System.out.println("method with no return and no argument");
	}
	
	
//	no return and with argument
	
	public void m2(int i)
	{
		System.out.println(i);
	}
	
	public void m3(int i)
	{
		int j = i+2;
		
		System.out.println(j);
	}
	
	public void m4(int h, int k)
	{
		int l = h+k;
		
		System.out.println(l);
	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m2(60);
		
		a.m2(80);
		
		a.m3(8);
		
		a.m4(9, 2);
		
		
		
		
	}

}
