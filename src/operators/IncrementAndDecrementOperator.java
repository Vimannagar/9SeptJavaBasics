package operators;

public class IncrementAndDecrementOperator {
	
		public static void main(String[] args) {
			
			int x = 10;
			
			int y = x++;// first value will transfer the value to y and then increment
			
			System.out.println(y);//10
			
			System.out.println(x);//11
			
			System.out.println("********************************************");
			
			int u = 10;
			int v = ++u;// first increment and then transfer the value to v
			
			System.out.println(u);//11
			
			System.out.println(v);//11
			
			System.out.println("********************************************");
			int p = 10;
			int q = p--;// first transfer the value to q and then decrement the value of p
			
			System.out.println(p);//9
			
			System.out.println(q);//10
			
	System.out.println("********************************************");
			
			int c = 10;
			int d = --c;// first decrement and then transfer the value to d
			
			System.out.println(c);//9
			
			System.out.println(d);//9
			
			
		}
	

}
