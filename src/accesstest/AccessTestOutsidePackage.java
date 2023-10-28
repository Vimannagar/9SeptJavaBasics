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
		
		System.out.println(MT.i);// public variable from accessmodifier - MT class
		
//		System.out.println(MT.s);// s is default inside MT class hence it will not be accessible outside the package
		
//		System.out.println(a.i);// i is protected inside the A class hence it will not be accessible outside the package using parent class reference variable it will only be accessible using child class reference variable only
		
		
		
	}

}
