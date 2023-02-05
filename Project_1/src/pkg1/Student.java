package pkg1;

public class Student {
	int age; 
	int roll_no;
	
	public void display1()
	{
		System.out.println("welcome tp all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
    public static void main (String[] args)
    {
    	Student rv=new Student();
    	rv.display1();
    	rv.display2();
    	rv.age=20;
    	rv.roll_no=1;
    	System.out.println(rv.age);
    	System.out.println(rv.roll_no);

    	
    	    }
}
