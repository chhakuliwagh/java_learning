// Super keyword

class Parent
{
	String message="Happy Diwali";

	void eat()
	{
		System.out.println("i am eating diwali sweets");
	}

}
class SuperKeyDemo extends Parent
{
	String message="Everyone";

	void eat()
	{
		super.eat();
		System.out.println("i like homemade sweets");
	}


	void showMessage()
	{
		System.out.println(super.message);
		System.out.println(message);
			
	}
	public static void main(String args[])
	{
		SuperKeyDemo d1=new SuperKeyDemo();
		d1.showMessage();
		d1.eat();
	}
}