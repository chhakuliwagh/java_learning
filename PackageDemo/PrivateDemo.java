package package1;

public class PrivateDemo
{
	private int no=10;
	
	private void printDetails()
	{
		System.out.println("Printing Detailc from private method");
	}
		
	
	public static void main(String args[])
	{
		PrivateDemo d1=new PrivateDemo();
		System.out.println(d1.no);
		d1.printDetails();
	
	}

}