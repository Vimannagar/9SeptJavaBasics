package accesstest;

import accessmodifiers.A;

public class B extends A {
	
	
	public static void main(String[] args) {
		
		A a = new A();
		
//		a.m1(); m1 is protected hence it will be called on the  basis of child class variable inside the child classs only
		
		B b = new B();
		
		b.m1();// valid as B is a child class
		
		A.m2();
		
		
		
	}

}
