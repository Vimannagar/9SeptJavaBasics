package casting;

public class Child extends Parent
{
	//data_type  variablename =(data_type_to which we want to cast)variable_to_casted;

	public void bike()
	{
		System.out.println("Bike");
	}
	
	public void marry()
	{
		System.out.println("Marry method from Child class");
	}

	
	public static void main(String[] args) {
		
		Child c =  new Child();
		
	Parent p1 = (Parent)c;// Up casting
	
	p1.marry();//child class marry method
	
	p1.car();// Parent class car method
	
	p1.home();// parent class home method
	
	
	Parent p = new Parent();
	
//	Child cc = (Child)p;// Down casting
//	
//	cc.marry();
//	
//	cc.home();
//	
//	cc.car();
	
	
	Child cc1 = (Child)p1;// down casting which is performed after up casting
	
	
	cc1.marry();// Child class marry method
	
	cc1.home();// parent class home method
	
	cc1.car();// parent class car method
	
	
	
	
		
	}
	
	
}
