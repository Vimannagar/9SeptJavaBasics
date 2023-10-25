package accesstest;

import accessmodifiers.Test1;
import accessmodifiers.Test3;


public class AccessTestOutsidePackage {
	
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		
//		Test2 t2 = new Test2(); This class is  not accessible here as it is default and it can only be accessible within the same package.
		
		
		Test3 t3 = new Test3();
		
	}

}
