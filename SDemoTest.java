class SDemo
{
	static int square(int x)
	{
		return x*x;
	} 

}
public class SDemoTest
{
	public static void main(String args[])
	{
		int res=SDemo.square(5);
		System.out.println("Square Of a given number: "+res);

	}
}