package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedCategory {
	
	public static void main(String[] args) {
		
		String path = "F:\\Desktop\\VimanNagar\\9 Sept\\Nonstaticvariable.png";
	
		try {
			
			FileInputStream fis =new FileInputStream(path);
		} 
		catch (FileNotFoundException e) {
			System.out.println("file not found exception arrived");
		}
		
	}
	

}
