package exceptionhandling;

public class B {

	A a;

	public void m3() {
		System.out.println("m3 method from B class");

		a.m1();

		a.m2();

	}

	public static void main(String[] args) {
		B b = new B();

		b.m3();
	}

}
