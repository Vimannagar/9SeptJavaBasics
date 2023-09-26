package datatypes;

public class NonPrimitive {
	
	
	public static void main(String[] args) {
		// datatype variablename = value;
		
		String s = "this is string value";
		
		System.out.println(s);//this is string value
		
		
// 1. Concatenation +
		
		String s1 = "Pune";
		
		String s2 = "Mahanagar";
		
		String s3 = s1+s2;
		
		System.out.println(s3);//PuneMahanagar
		
		
		String s4 = s1+" "+s2;
		
		System.out.println(s4);//Pune Mahanagar
		
		
		String s5 = "Mumbai";
		
		String s6 = "India's financial capital is ";
		
		String s7 = s6+s5;
		
		System.out.println(s7);//India's financial capital is Mumbai
		
		System.out.println(s6+s5);//India's financial capital is Mumbai
		
		int a = 10;
		
		int b = 20;
		
		System.out.println(a+b);//30
		
		
//		String with numbers:
		
		int z = 100;
		
		int y = 20;
		
		int e = z+y;
		
		System.out.println(e);//70
		
		System.out.println("The addition of "+z+" and "+y+" is "+e);// The addition of c and d is 70
		
		
		
		System.out.println("*****************************************");
		
		System.out.println(20+2);//22
		
		System.out.println("20"+"2");//202
		
		System.out.println("20"+2);//202
		
		System.out.println("20"+2+2);//2022
		
		System.out.println("50"+true);//50true
		
		System.out.println(5+3+"53");//853
		
		
		System.out.println("5"+'3');//53
	}

}
