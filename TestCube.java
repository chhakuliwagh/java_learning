//static method example 2
class Calculate
{
	static int cube(int x)
	{
		return x*x*x;
	}
}
public class TestCube
{
public static void main(String args[])
	{
		int res=Calculate.cube(5);
		System.out.println("cube of a number:"+res);
	}


}