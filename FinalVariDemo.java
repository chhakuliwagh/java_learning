class FinalVariDemo
{
	final int num=200;
	void display()
	{

		System.out.println("value of num: "+num);

		//num=100;

		System.out.println("value of num: "+num);
	}

	public static void main(String args[])
	{
	 FinalVariDemo v1=new FinalVariDemo();
		v1.display();

	}
	
}