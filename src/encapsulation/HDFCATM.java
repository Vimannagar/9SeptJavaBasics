package encapsulation;

public class HDFCATM {
	
	
	public static void main(String[] args) {
		
		
		SBIServer server = new SBIServer();
		
		server.getBalance(1234);//Abstraction
		
		server.setBalance(1234, 20000);
		
	}

}
