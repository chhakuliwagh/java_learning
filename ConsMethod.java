class ConsMethod
{
void display()
{
 	System.out.println("Hello from display");
}
void show()
{
	System.out.println("Hello from show");
	display();
}

}
class Test
{

public static void main(String args[])
{
	ConsMethod c1=new ConsMethod();
		c1.show();

}

}