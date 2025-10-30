class FinalMethodDemo1
{
	final void display()
	{

		System.out.println("final method of a parent class:");

	}

}

class FinalMethodDemo extends FinalMethodDemo1
{
	 void display()
	{

		System.out.println("final method of a child class:");

	}

	
	public static void main(String args[])

	{

	 FinalMethodDemo v1=new FinalMethodDemo();
	 v1.display();

	}
	
}