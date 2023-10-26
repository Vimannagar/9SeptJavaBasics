package accesstest;

import accessmodifiers.A;

public class C extends B {
	
public static void main(String[] args) {
		
		A a = new A();
		
//	a.m1();// m1 is protected hence it will be called on the  basis of child class variable inside the child classs only
		
		B b = new B();
		
	//	b.m1();
		
		C c = new C();
		c.m1();
		
		C.m2();
		
		
		
		
	}

}
