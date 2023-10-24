package inheritance;

public class Ccons extends Pcons {

	public Ccons(int i)
	{
		super("abc");
		System.out.println("one argument child class constructor");
	}

	public static void main(String[] args) {
//	Ccons c = new Ccons();// Error which says we need to first call the Child class constructor then we will be able to call the parent class constructor
		
		
		Ccons c = new Ccons(50);
	}
}
