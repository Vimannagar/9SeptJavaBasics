package arraydisc;

public class DefiningArray {
	
	public static void main(String[] args) {
//		syntax to define array:
//		data_type [] variable_Name = new data_type [size-of-array];
		
		int [] i = new int[5];
		
		i[0] = 50;
		i[1] = 90;
		i[2] = 2;
		i[3] = 96;
		i[4] = 48;
		
		System.out.println(i[0]);//50
		
	int sizeOfArray = i.length;
	System.out.println(sizeOfArray);
	
//	Assignment: WAP to print all the elements present inside the array using for loop
		
	}

}
