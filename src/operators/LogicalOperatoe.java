package operators;

public class LogicalOperatoe {

	public static void main(String[] args) {

//		AND -> &&
//		OR -> ||

		int i = 50;

		int j = 70;

		int k = 80;
//					false	true
		boolean y = i > 60 && k < 100;

		System.out.println(y);// false

		boolean z = i <= 70 && k >= 50;

		System.out.println(z);// true

		boolean u = i == 50 && j > 50 && k < 90;

		System.out.println(u);// true

		boolean t = i > 60 || k < 100;

		System.out.println(t);// true

//		NOT -> !

		boolean r = false;

		boolean o = !r;

		System.out.println(o);// true

		int p = 90;

		int q = 101;

		boolean e = !(p > q);

		System.out.println(e);// true

		boolean w = q != 90;

		System.out.println(w);// true
	}

}
