class ThisVerify
{
	void info()
	{
		System.out.println(this); // reference number
	}
	public static void main(String args[])
	{
		ThisVerify v1=new ThisVerify();
		System.out.println(v1); // reference number
		v1.info();

	}
}