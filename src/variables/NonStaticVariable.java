package variables;

public class NonStaticVariable {
	
//	syntax:
	
//	datatype variable_name	= value;
	
	 String s = "abc";
	
	 
	 int i = 10;
	
	
	public static void main(String[] args) {
		
		NonStaticVariable nsv = new NonStaticVariable();
		
		System.out.println(nsv.s);//abc
		
		NonStaticVariable nsv1 = new NonStaticVariable();
		
		System.out.println(nsv1.i);//10
		
		System.out.println(nsv.i);//10
		
		
		nsv.s = "def";
		
		System.out.println(nsv.s);
	}
	

}
