package variables;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(StaticVariable.a);//50	
		
		
		StaticVariable.a = 60;
		
		
		System.out.println(StaticVariable.a);//60
		
		System.out.println("*****************************");
		
		NonStaticVariable var = new NonStaticVariable();
		
		System.out.println(var.i);
		
		
		
		System.out.println(var.s);
		
		
		
	}

}
