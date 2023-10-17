package loops;

public class Example1 {
//	syntax:		1					2,5,8			4,7,10
//	for(any_java_statement; boolean_condition; any_java_statement)
//{
//	3,6,9
//	actions to be executed only if boolean_condition is true
//
//}

	public static void main(String[] args) {
		
		int number = 2;
		for(int i = 1; i<=10; i= i+1 )
		{
			int j = number*i;
			
			System.out.println(j);//2, 4, 
		}
	}

}
