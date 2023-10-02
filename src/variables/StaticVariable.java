package variables;

public class StaticVariable {
	
	
//	Syntax to define the static variable
	
//	static datatype variable_name = value;
	
	
	static int a = 50; 
	
	static int i = 10;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(a);//50
		
		System.out.println(StaticVariable.a);//50
		
		a = 90;
		
		System.out.println(a);//90
		
		
		System.out.println(i);
		
		
		
	}

}
