package pkg1;

import java.util.Scanner;

public class A2_jan22 
{
	public int multi(int x1, int x2)
	{
	int c= x1*x2;
	return c;
	}
	public int sub(int sumx, int x3)
	{
	int c= sumx-x3;
	return c;
	}
	public int sum(int x5, int x6)
	{
		int result;
		result = x5 * x6;
		return result;
	}
	public int div(int x5, int x6)
	{
		int result;
		result = x5 / x6;
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter the data");
		Scanner a=new Scanner(System.in);
		int x1 = a.nextInt();
		int x2 = a.nextInt();
		int x3 = a.nextInt();
		int x4 = a.nextInt();
		int x5 = a.nextInt();
		int x6 = a.nextInt();
		
		A2_jan22 ob=new A2_jan22();
		int multiresult = ob.multi(x1,x2);
		int subresult = ob.sub(multiresult,x3);
		int sumresult = ob.sum(subresult,x4);
		int subresult2 = ob.sub(sumresult,x5);
		int divide = ob.div(subresult2, x6);
		
		System.out.println("final result is "+divide);
		
	}

}
