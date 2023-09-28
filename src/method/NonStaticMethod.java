package method;

public class NonStaticMethod {
	
	
//	Syntax:
//	public void name_of_method()
//	{
//		logic which is to be executed
//	}
	
		
		public void m1()
		{
			System.out.println("m1 non static method from NonStaticMethod class");
		}
		
		
		public void m2()
		{
			System.out.println("Non static method m2");
		}
		
		
		
		public static void main(String[] args) {
		
//		create object:
//		Syntax: 
//		classname variable_name = new classname();
		
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		nsm.m1();//m1 non static method from NonStaticMethod class
		
		nsm.m1();//m1 non static method from NonStaticMethod class
		
		nsm.m2();//Non static method m2
		
		NonStaticMethod nsm2 = new NonStaticMethod();
		
		nsm2.m1();//m1 non static method from NonStaticMethod class
		
		nsm.m1();//m1 non static method from NonStaticMethod class
		
	
	}
		
		
		
		

}
