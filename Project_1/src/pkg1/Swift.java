package pkg1;

//here swift is the child and Maruti is the Parent class
public class Swift extends Maruti

{
	public void modelType()
	{
		System.out.println("it is the father");
	}
	public static void main(String[] args) {
		Swift re=new Swift();
		re.price();
		re.price=11;
		System.out.println("Price is "+re.price);
		re.modelType();
	
}
}