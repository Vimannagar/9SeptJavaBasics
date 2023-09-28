package method;

public class Test {
	

	
	public static void main(String[] args) {
		
		StaticMethod.methodOne();
		
		StaticMethod.addition();
		
//		Calling the non static method:
		
		NonStaticMethod var1 = new NonStaticMethod();
		
		var1.m1();
		
		var1.m2();
		
		
		
	}

}
