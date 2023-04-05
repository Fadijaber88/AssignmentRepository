package pkg1;

public class SwiftVDI extends Swift
{
	public void mytype()
	{
		System.out.println("I am child class");
	}
	public static void main(String[] args) 
	{
		SwiftVDI s=new SwiftVDI();
		s.modelType();
		s.mytype();
		s.price();
		s.price=100;
		System.out.println("Price is "+s.price);
	}
	
}
