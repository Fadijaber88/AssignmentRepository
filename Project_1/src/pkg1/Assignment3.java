package pkg1;

public class Assignment3 
    {
	
		public int divide(int d1, int d2)
		{
		int divider;
		divider= (d1/d2);

		System.out.println("divide result is "+divider);
		return divider;
		}
		
		public int sub(int s1, int s2)
		{
		int subr= s1 - s2;
		System.out.println("sub result is "+subr);
		return subr;
		}
	
		public int sum(int a, int b)
		{
		int sumr= a+b;
		System.out.println("sum result is "+sumr);
		return sumr;
		}
		
		public void multi(int m1, int m2)
		{
		int multir= m1*m2;
		System.out.println("final result is "+multir);
		}
	
	public static void main(String[] args)
{
		Assignment3 ref=new Assignment3();
	int divideresult = ref.divide(10, 2);
	int subresult = ref.sub(divideresult,2);
	int sumresult = ref.sum(subresult,2);
	int subresult2 = ref.sub(sumresult,2);
	ref.multi(subresult2,2);
}
}
