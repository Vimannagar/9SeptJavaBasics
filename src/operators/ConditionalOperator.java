package operators;

public class ConditionalOperator {

	public static void main(String[] args) {

//		Assignment operator '='
		int i = 5;

//		greater than '>'

		boolean isGreater = 10 > 8;

		System.out.println(isGreater);// true

		int u = 90;

		int v = 78;

		boolean g = u > v;

		System.out.println(g);// true

//		less than '<'

		int t = 40;

		int e = 60;

		boolean r = e < t;

		System.out.println(r);

//		greater than or equal to '>='

		int y = 90;

		int j = 90;

		boolean h = y >= j;
		
		System.out.println(h);// true
		
//		less than or equal to '<='

		int p = 87;

		int q = 96;

		boolean w = p <= q;
		
		System.out.println(w);// true
		
//		equal to '=='
		
		
		int s = 23;
		
		int f = 62;
		
		boolean c = s==f;
		
		System.out.println(c);//false
		
		
		
		System.out.println("****************************************");
		
		int n = 56;
		
		int x = 96;
		
//		syntax for if - else
		
//		if(boolean_condition)
//		{
//			actions to be executed if boolean_condition is true
//		}
//		else
//		{
//			actions to be executed if boolean_condition is false
//		}
		
		
		if(n>=x)
		{
		System.out.println("n is greater than x");	
		}
		else
		{
			System.out.println("n is smaller than x");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
