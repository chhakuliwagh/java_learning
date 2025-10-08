class ConsMethod
{
void display(int a)
{
 	System.out.println("Hello from display: "+a);
}
void show(int b)
{
	System.out.println("Hello from show: "+b);
	this.display(b);  //this.display()= display()
}

}
class Test
{

public static void main(String args[])
{
	ConsMethod c1=new ConsMethod();
		c1.show(10);

	ConsMethod c2=new ConsMethod();
		c2.show(20);


}

}