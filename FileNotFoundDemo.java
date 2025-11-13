//filenotfound exception example

import java.io.FileReader;
class FileNotFoundDemo
{

	public static void main(String args[])
	{

		try
		{
			FileReader fr=new FileReader("Missing.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}