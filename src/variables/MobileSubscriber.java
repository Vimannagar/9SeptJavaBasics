package variables;

public class MobileSubscriber {
	
	String customername;
	long mobile;
	static String companyname;
	static String cityname;
	
	
	
	public static void main(String[] args) {
		MobileSubscriber cust1 = new MobileSubscriber();
		cust1.customername = "eder";
		cust1.mobile = 9876543210l;
		companyname = "Airtel";
		cityname = "Pune";
		
		MobileSubscriber cust2 = new MobileSubscriber();
		cust2.customername = "Daniel";
		cust2.mobile = 9866543210l;

				
		
		
	}
	

}
