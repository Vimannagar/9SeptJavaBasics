package accesstest;

import accessmodifiers.A;
import accessmodifiers.MT;
import accessmodifiers.Test1;
//import accessmodifiers.Test3;


public class AccessTestOutsidePackage {
	
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		
//		Test2 t2 = new Test2(); This class is  not accessible here as it is default and it can only be accessible within the same package.
		
		
//		Test3 t3 = new Test3();
		
		MT.m1();// public method
		
		
//		MT.m2();// default method - Error as it is default hence it will be accessible only within the package
		
		
		A a = new A();
		
//		a.m1();This is protected hence it is not accessible out side the package if we dont use child class reference variable and call it inside child class.
		
		
		
		
		
	}

}
