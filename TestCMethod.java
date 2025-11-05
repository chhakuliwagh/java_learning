class CMethod
{
	public CMethod()
	{
		System.out.println("Defualt");
	}
	public CMethod(int id)
	{
		this();
		System.out.println("Parameter "+id);
		
	}
}
class TestCMethod
{
	public static void main(String args[])
	{
		CMethod c1=new CMethod(10);
	}
}