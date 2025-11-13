class ArrayIndexDemo
{

	public static void main(String args[])
	{
		int number[]={1,2,3,4,5};
		System.out.println("Welcome to exception handling");
		try
		{
			int i =10;
			System.out.println(number[i]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Rest of the code of my program");


	}

}