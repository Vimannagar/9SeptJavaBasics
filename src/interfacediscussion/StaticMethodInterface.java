package interfacediscussion;

	public interface StaticMethodInterface {
		
		int i = 20;
		
		public static void m1()
		{
			System.out.println("static method from interface");
		}
		
		
		
		public static void main(String[] args) {
			
			m1();
			
			StaticMethodInterface.m1();
	
			System.out.println(StaticMethodInterface.i);
		}
		
		
		
	
	}
