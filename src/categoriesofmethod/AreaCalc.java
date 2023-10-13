package categoriesofmethod;

public class AreaCalc {

	public int area(int length, int breadth) {

		int landArea = length * breadth;

		return landArea;

	}

	public static void main(String[] args) {
		
		AreaCalc land = new AreaCalc();
		
	int area1 = land.area(50, 50);//2500
	
	int area2 = land.area(80, 20);//1600
	
	int area3 = land.area(10, 20);//200
	
	int totalArea = area1+area2+area3;
	
	System.out.println("Total area is "+totalArea);
	
		
		
	}

}
