class DemoStatic
{
	static int a=50;
	final int b=50;
	public static void main(String args[])
	{
		System.out.println(a);
		System.out.println(b);

		a=100;
		b=200;
		System.out.println(a);
		System.out.println(b);

	}

}