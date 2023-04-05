package pkg1;

import java.util.Scanner;

public class A1e 
{
	public int sum(int x, int y)
	{
		int a = x+y;
		return a;
	}
	
	public int sub(int x, int y)
	{
		int a = x-y;
		return a;
	}
	
	public float multi(float x, float y)
	{
		float a = x*y;
		return a;
	}
	
	public float div(float x, float y)
	{
		float a = x/y;
		return a;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter the first value");
		Scanner e=new Scanner(System.in);
		int x1=e.nextInt();
		
		System.out.println("Please enter the second value");
		int x2=e.nextInt();
		
		System.out.println("Please enter the third value");
		int x3=e.nextInt();
		
		System.out.println("Please enter the fourth value");
		int x4=e.nextInt();
		
		System.out.println("Please enter the fifth value");
		int x5=e.nextInt();
		
		System.out.println("Please enter the sixth value");
		int x6=e.nextInt();
		
		
		A1e s=new A1e();
		int sumresult=s.sum(x1,x2);
		int sumresult2=s.sum(sumresult,x3);
		int subresult=s.sub(sumresult2,x4);
		float divresult=s.div(subresult,x5);
		float multiresult=s.multi(divresult,x6);
		
		System.out.println("The total is "+multiresult);
			
		
	}

}
