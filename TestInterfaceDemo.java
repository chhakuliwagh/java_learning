interface Shape
{
	void draw();
	void display();
	defaulte void run()
	{
		System.out.println("Executing difault method");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void display()
	{
		System.out.println("Show Circle");
	}
}
class TestInterfaceDemo
{
	public static void main(String args[])
	{
		Shape s=new Circle();
		s.draw();
		s.display();
		s.run();

	}


}