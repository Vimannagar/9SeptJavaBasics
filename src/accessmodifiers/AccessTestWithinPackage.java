package accessmodifiers;

public class AccessTestWithinPackage {
	
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();// public class
		
		Test2 t2 = new Test2();// default class
		
		Test3 t3 = new Test3(); // public class
		
		MT.m1();// public method
		
		MT.m2();// default method
		
		MT mt = new MT();
		
//		mt.m3();// Private m3 method from MT class
		
		
		A a = new A();
		
		a.m1();
		
		
		A.m2();
	}
	
	

}
