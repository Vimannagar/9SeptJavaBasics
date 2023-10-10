package variables;

public class College {

	String name;
	static String collegename;
	int age;
	int mathsmarks;
	int physicsmarks;

	
	public static void main(String[] args) {
		
		
		College student1 = new College();
		
		student1.name = "Albert";
		student1.age = 12;
		student1.mathsmarks = 50;
		student1.physicsmarks = 40;
		collegename = "Coep";
		
College student2 = new College();
		
		student2.name = "Daniel";
		student2.age = 21;
		student2.mathsmarks = 60;
		student2.physicsmarks = 70;
		
		
		System.out.println(student2.name);//Daniel
		
		System.out.println(student1.physicsmarks);//40
		
		
	}
}
