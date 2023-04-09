package pkg1;

public class StaticAssignment 
{
 static int c = 5;
	
	public void test()
	{
		test1();
		System.out.println("Static test "+c);
	}
	
	public static void test1()
	{
		test2();
		System.out.println("Static test1 "+c);
	}
	
	public static void test2()
	{
		System.out.println("Static test2 "+c);
	}
	public static void main(String[] args) 
	{
		StaticAssignment rf=new StaticAssignment();
		rf.test();
	}

}
