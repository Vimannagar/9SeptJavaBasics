package casting;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
//		syntax for primitive casting:
			
//data_type  variablename =(data_type_to which we want to cast)variable_to_casted;
		
			
//		Implicit casting
		
		byte b = 20;
		
	int	ii = (int)b;
	
	System.out.println(ii);//20
	
	
	short s = 90;
	
	long y = (long)s;
	
	System.out.println(y);//90
	
	
	
//	Explicit casting
	
	int i = 10;
	
	byte bb = (byte)i;
	
	System.out.println(bb);//10
	
	
	int k = 129;
	
	byte cc = (byte)k;
	
	System.out.println(cc);//-127
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
