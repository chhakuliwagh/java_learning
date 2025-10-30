final class FinalClassDemo1
{
	 void display()
	{

		System.out.println("final method of a parent class:");

	}

}

class FinalClassDemo extends FinalClassDemo1
{
	 void display()
	{

		System.out.println("final method of a child class:");

	}

	
	public static void main(String args[])

	{

	 FinalClassDemo v1=new FinalClassDemo();
	 v1.display();

	}
	
}