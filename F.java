// multiple inheritance using interface

interface D
{
	int id=10;
}
interface E
{
	String name="Dipali";
}
interface G
{
	String color="Blue";
}
class F implements D,E,G
{
	String city="Pune";
	void display()
	{
	System.out.println("Id: "+id+" Name: "+name+" City: "+city+" color: "+color);
	}
	public static void main()
	{
		F f1=new F();
		f1.display();
	}
}
