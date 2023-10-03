package variables;

public class G {
	static int i = 50; // static variable
	
	int j = 80; // non static variable
	
	
	public static void main(String[] args) {
		
		System.out.println(i);//50
		
		G g1 = new G();
		
		System.out.println(g1.j);//80
		
		g1.j = 70;
		
		System.out.println(g1.j);//70
		
		g1.j = 100;
		
		System.out.println(g1.j);//100
		
		G g2 = new G();
		
		System.out.println(g2.j);//80
		
		System.out.println(g1.j);//100
		
		System.out.println("******************************************");
		
		System.out.println(i);//50
		
		i = 90;
		
		System.out.println(i);//90
		
		System.out.println(g1.i);//90
		
		System.out.println(g2.i);//90
		
		g1.i = 120;
		
		System.out.println(g1.i);//120
		
		System.out.println(g2.i);//120
		
		System.out.println(i);//120
		
		
		
	}

}
