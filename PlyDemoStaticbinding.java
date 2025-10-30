//Method overloading



class PlyDemoStaticbinding
{
	void display()
	{
		System.out.println("Method without arg");
	}
void display(int id)
	{
		System.out.println("Method with arg "+id);

	}
public static void main(String args[])
	{
		PlyDemoStaticbinding d1=new PlyDemoStaticbinding();
		d1.display();
		d1.display(10);
	}
}