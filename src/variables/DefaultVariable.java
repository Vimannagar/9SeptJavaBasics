package variables;

public class DefaultVariable {
	
	
	static int i ;
	String s;
	boolean b;
	static char c;
	double d;
	
	
	public static void main(String[] args) {
		
		System.out.println(i);//0
		
		DefaultVariable dv = new DefaultVariable();
		
		System.out.println(dv.s);//null
		
		System.out.println(dv.b);//false
		
		System.out.println(c);//<space>
		
		System.out.println(dv.d);// 0.0
		
		
		
		
		
	}
}
