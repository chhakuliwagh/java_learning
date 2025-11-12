class Testmutabledemo
{

	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer(10);

		sb1.append("hello to fct dear all");

		System.out.println("Length: "+sb1.length());

		System.out.println("reverse String: "+sb1.reverse());

		System.out.println("Character of specific index: "+sb1.charAt(5));

		System.out.println("Add character of specific index: "+sb1.setCharAt(5));

		System.out.println("Delete char at: "+sb1.deleteCharAt(5));


	}
}