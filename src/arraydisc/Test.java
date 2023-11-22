package arraydisc;

public class Test {
	
	
	public static void main(String[] args) {
//		syntax to define array:
//		data_type [] variable_Name = new data_type [size-of-array];
		
		int [] i = new int[5];
		
		i[0] = 50;
		i[1] = 90;
		i[2] = 2;
		i[3] = 96;
		i[4] = 48;
		i[5] = 96;// this line will throw the exception as array size is 5 which is defined hence we cannot provide more than 5
		
		System.out.println(i[0]);//50
	}

}
