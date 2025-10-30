// Method overridding

class PolyDemo
{
	void display()
	{
		System.out.println("Method without arg Parent");
	}

}

class DynamicBinding extends PolyDemo
{
	void display()
	{
		System.out.println("Method without arg child");

	}
public static void main(String args[])
	{
		DynamicBinding d1=new DynamicBinding();
		d1.display();
	}
}