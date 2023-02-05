package pkg1;

public class This_Method_Assignment {

	public void method()
	{
		System.out.println("Default method");
	}
	
	public void method1(int a)
	{
		this.method4(1, 2, 3, 4);
		this.method();
		System.out.println("One parametarized method");
		this.method3(1, 2, 3);
		this.method2(1, 2);
	}
	
	public void method2(int a, int b)
	{
		System.out.println("Two parametarized method");
	}
	
	public void method3(int a, int b, int c)
	{
		System.out.println("Three parametarized method");
	}
	
	public void method4(int a, int b, int c, int d)
	{
		System.out.println("Four parametarized method");
		
	}
	 public static void main(String[] args) {
		 This_Method_Assignment ref=new This_Method_Assignment();
		 ref.method1(10);
	}
}
