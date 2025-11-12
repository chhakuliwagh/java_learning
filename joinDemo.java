// join() method: this metho join the group of string together as per specified separator .

class joinDemo
{
	public static void main(String args[])
	{
		String s1;
		s1=String.join(" ","Apple","Orange");
		System.out.println(s1);

		String s2;
		s2=String.join(" ","01",":","12",":","2016");
		System.out.println(s2);

		String s3;
		s3=String.join("::","12","20","10");
		System.out.println(s3);


		
	}

}