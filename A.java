class A
{
 	A getA()
	{
		return this;
	}
	void message()
	{
		System.out.println("hello everuone:...");
	}
}
class TestA
{
	public static void main(String args[])
	{
		new A().getA().message();
	}
}