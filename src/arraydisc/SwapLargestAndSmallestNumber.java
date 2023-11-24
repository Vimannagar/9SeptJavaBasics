package arraydisc;

import java.util.Arrays;

public class SwapLargestAndSmallestNumber {
	
	public static void main(String[] args) {
		
		int a [] = {10, 56, 0, 82, 96};
		
	int[] b = Arrays.copyOf(a, a.length);// to copy array a into array b
	System.out.println("b array is ");
	for(int bb:b) {
		
		System.out.print(bb+" ,");
	}
	System.out.println();
	
	System.out.println("*********************************");
	
	Arrays.sort(b);
	System.out.println("Smallest element from b array is "+b[0]);
	
	int lastIndex = b.length-1;
	
	System.out.println("Largest element from b array is "+b[lastIndex]);
	
	
//	finding the index position of largest and smallest element in array a
	int largestindex = 0;
	int smallestindex = 0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]== b[0])
		{
			System.out.println("Smallest element index is "+i);
			smallestindex =i;
			
		}
		if(a[i]==b[lastIndex])
		{
			System.out.println("Largest element is "+i);
			
			largestindex = i;
		}
		
	}
	
	int c = 0;
	
//Swapping the largest and smallest elements
	
	
	 c = a[smallestindex];
	 
	 a[smallestindex] = a[largestindex];
	 
	 a[largestindex] = c;
	 
	 
//	 Printing the a array
	 
	 for(int aa:a)
	 {
		 System.out.print(aa+" ");
	 }
	
	
	
	
	
//	Steps
//	sort b array
//	find out the largest and smallest number of b
//	Find out the index position of smallest and largest number in a
//	Swap the index position in array a
		
		
	}

}
