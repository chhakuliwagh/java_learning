///Polumorphism example

class PolyDemo
{
void display()
{
	System.out.println("Display Mehtod get Executed");
}
void display(int a)
{
	System.out.println("Display method get executed"+a);
}
void display(String n)
{
	System.out.println("Display method get executed"+n);
}
public static void main(String args[])
{
	PolyDemo p1=new PolyDemo();
	p1.display();
	p1.display(10);
	p1.display("Ram");


}

}