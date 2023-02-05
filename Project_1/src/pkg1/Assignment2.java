package pkg1;

import java.nio.charset.MalformedInputException;

public class Assignment2 {
	
	public int sum(int a, int b)
	{
	int sumr= a+b;
	System.out.println("sum result is "+sumr);
	return sumr;
	}
	
	public int sub(int s1, int s2)
	{
	int subr= s1 - s2;
	System.out.println("sub result is "+subr);
	return subr;
	}
	
	public int multi(int m1, int m2)
	{
	int multir= m1*m2;
	System.out.println("multi result is "+multir);
	return multir;
	}
	
	public void divide(int d1, int d2)
	{
		int divider;
		divider= (d1/d2);
		System.out.println("final result is "+divider);
	}
	public static void main(String[] args)
	{
		Assignment2 ref=new Assignment2();
	int sumresult = ref.sum(10, 2);
	int sumresult2 = ref.sum(sumresult,2);
	int subresult = ref.sub(sumresult2,2);
	int multi= ref.multi(subresult,2);
	ref.divide(multi,2);
	}
}
