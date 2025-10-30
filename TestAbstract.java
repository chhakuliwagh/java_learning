// Abstraction

abstract class Bike
{
	abstract void run();
	abstract void show();

	void display()
	{
		System.out.println("Non-Abstract Method...");
	}

}
 class Bajaj extends Bike
{
	void run()
	{
		System.out.println("Bike is running...");
	}
	void show()
	{
	}
}
class TestAbstract
{
	public static void main(String args[])
	{
		//Bajaj b1=new Bajaj();
           	Bike b1=new Bajaj();
		b1.run();
		b1.display();
	}
}