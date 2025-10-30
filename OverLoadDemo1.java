class OverLoadDemo1
{
	int show(int id)
	{
		System.out.println("Welcome to Method overloading:");
		return 0;
	}

	String show(int id)
	{
		System.out.println(" Welcome to Method overloading");
		return null;
	}

	public static void main(String args[])
	{
		OverLoadDemo1 o1=new OverLoadDemo1();
		o1.show(10);
		
	}

}