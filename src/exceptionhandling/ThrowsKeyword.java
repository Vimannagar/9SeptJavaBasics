package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		
		System.out.println("first line");
		
		Thread.sleep(2000);
		
		System.out.println("Last line");
		
		String path = "F:\\Desktop\\VimanNagar\\9 Sept\\Nonstaticvariable.png";
		
		FileInputStream fis =new FileInputStream(path);
		
		
		
	}

}
