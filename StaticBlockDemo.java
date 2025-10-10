class StaticBlockDemo
{
	int a;
	static int b;
	StaticBlockDemo()
	{

	}

	static{b=10;System.out.println("static block executes....");}

	void show()
	{
		System.out.println("a: "+a+" b: "+b);
	}

	public static void main(String args[])
	{
		System.out.println("Main method executes...");
		StaticBlockDemo s1=new StaticBlockDemo();
			s1.show();
	}


}
