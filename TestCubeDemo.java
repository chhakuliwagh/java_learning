class CalculateDemo
{
	static int cube(int x)
	{
		return x*x*x;
	}
}
public class TestCubeDemo
{
	public static void main(String args[])
	{
		int res=CalculateDemo.cube(5);
		System.out.println("Cube Of a number: "+res);
	}

}