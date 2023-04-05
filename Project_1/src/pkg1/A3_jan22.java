package pkg1;

//here swift is the child and Maruti is the Parent class
public class A3_jan22 extends Maruti

{
	int p;
	public void modelType1()
	{
		System.out.println("it is the father");
	}
	public static void main(String[] args) {
		Maruti re=new Maruti();
		re.price();
		re.price=111;
		System.out.println("Price is "+re.price);
		A3_jan22 rf=new A3_jan22();
		rf.p=100;
		rf.modelType1();
	}
	
}
