package arraydisc;

public class AdditionOfElements {
	
	
public static void main(String[] args) {
	
	int  [] a = {5, 8, 9, 63, 88};
	
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	
//	Assignment1: WAP to add all the elements from the array
	int sum = 0;
	for(int j=0; j<a.length; j++)
	{
		sum = sum + a[j];
	}
	
	System.out.println(sum);
	
//	Assignment2: WAP to add all the odd elements from the array
	
//	Assignment3: WAP to add all the even elements from the array
	
//	Assignment4: WAP to add all the odd index position elements from the array
	
//	Assignment5: WAP to add all the even index position elements from the array
	
}

}
