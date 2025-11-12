// String buffer or builder

class TestMutable
{
	public static void main(String args[])
	{
		String s1=new String("Hello");
		s1.concat("Lokesh");
		System.out.println(s1);

		StringBuffer s2=new StringBuffer("Hello");
		s2.append(" Lokesh");
		System.out.println(s2);

		StringBuilder s3=new StringBuilder("Hello");
		s3.append(" Lokesh");
		System.out.println(s3);


	}


}