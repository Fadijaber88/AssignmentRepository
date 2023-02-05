package pkg1;

public class This_Assignment1
{
	public This_Assignment1()
	{
		this(11,22,33);
		System.out.println("Defaul contsructor");
	}
	
	public This_Assignment1(int a)
	{
		System.out.println("One parametarized contsructor");
	}
	
	public This_Assignment1(int a, int b)
	{
		System.out.println("Two parametarized contsructor");
	}
	
	public This_Assignment1(int a, int b, int c)
	{
		System.out.println("Three parametarized contsructor");
	}
	
	public This_Assignment1(int a, int b, int c, int d)
	{
		this(10);
		System.out.println("Four parametarized contsructor");
	}
	
	public static void main(String[] args) 
	{
		This_Assignment1 ref=new This_Assignment1();
		This_Assignment1 ref1=new This_Assignment1(5,4,3,2);
		This_Assignment1 ref2=new This_Assignment1(5,4);
	}
	
	

}
