class NumberFormatDemo
{

	public static void main(String args[])
	{
		String s="Dipali";
		System.out.println("Welcome to exception handling");
		try
		{
			int no=Integer.parseInt(s);
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Rest of the code of my program");


	}

}