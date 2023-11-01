package encapsulation;

public class SBIServer {
	
private	int customerBalance = 50000;
	
	
	public void getBalance(int pin)
	{
		if(pin==1234)
		{
			System.out.println(customerBalance);
		}
		else
		{
			System.out.println("Incorrect pin please try again");
		}
	}
	
	public void setBalance(int pin, int amount)
	{
		if (pin == 1234)
		{
			if(amount<customerBalance)
			{
				customerBalance= customerBalance - amount;
				System.out.println("Your account balance is :"+customerBalance);
			}
		}
		
		else
		{
			System.out.println("Incorrect pin please try again");
		}
	}

}
