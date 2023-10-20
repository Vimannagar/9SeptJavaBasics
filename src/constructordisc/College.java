package constructordisc;

public class College {

	String name;
	static String collegename;
	int age;
	int mathsmarks;
	int physicsmarks;

	public College(String name, int age, int mathsmarks, int physicsmarks) {
		this.name = name;
		this.age = age;
		this.mathsmarks = mathsmarks;
		this.physicsmarks = physicsmarks;
	}

	public static void main(String[] args) {

		College s1 = new College("Daniel", 12, 56, 80);
		College s2 = new College("Eder", 13, 65, 72);

		System.out.println(s1.name);

	}

}
