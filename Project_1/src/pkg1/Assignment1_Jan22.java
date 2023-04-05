package pkg1;

import java.util.Scanner;

public class Assignment1_Jan22 
{
	public int sum(int x1, int x2)
	{
	int c= x1+x2;
	return c;
	}
	public int sub(int x3, int x4)
	{
	int c= x3-x4;
	return c;
	}
	public int multi(int x5, int x6)
	{
		int result;
		result = x5 * x6;
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
		
		Assignment1_Jan22 ob=new Assignment1_Jan22();
		int sumresult1 = ob.sum(x1,x2);
		int sumresult2 = ob.sum(sumresult1,x3);
		int subresult = ob.sub(sumresult2,x4);
		int multiresult = ob.multi(subresult,x5);
		int result = ob.multi(multiresult, x6);
		
		System.out.println("final result is "+result);
		
	}

}
