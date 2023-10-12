package categoriesofmethod;

	public class B {
		
	//	method with return type and no argument
		
		public static String m5()
		{
			return "abc";
		}	
	
		
		
		public int m6()
		{
			System.out.println("This is method with return and no arg");
			
			return 70;
			
		}
		
		
		public String uniqueId()
		{
			String name = "Ron";
			
			int roll = 50;
			
			String id = name+roll;
			
			return id;
		}
		
		
		public static void main(String[] args) {
			
			B b  = new B();
			
			int var = b.m6();
			
			System.out.println(var);//70
			
			int y = var + 2;
			
			System.out.println(y);//72
			
			String idvalue = b.uniqueId();
			
			System.out.println(idvalue);//Ron50
			
			String collegename = "coep";
			
			String finalcode = collegename+idvalue;
			
			System.out.println(finalcode);//coepRon50
		}
	}
