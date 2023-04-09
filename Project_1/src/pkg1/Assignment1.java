package pkg1;

import java.nio.charset.MalformedInputException;

public class Assignment1 {
	
	public int sum(int a, int b)
	{
	int c= a+b;
	System.out.println("sum result is "+c);
	return c;
	}
	
	public int sub(int a1, int a2)
	{
	int r= a1-a2;
	System.out.println("sub result is "+r);
	return r;
	}
	
	public void multi(int s1, int s2)
	{
		int result;
		result = s1 * s2;
		System.out.println("final reslt is "+result);
	}
	public static void main(String[] args)
	{
		Assignment1 ref=new Assignment1();
	int sumresult = ref.sum(12, 2);
	int subresult = ref.sub(10, 2);
	ref.multi(sumresult, subresult);
	}
}
