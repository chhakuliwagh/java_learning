// Mehtod overloading

class OverLoadDemo
{
	void show(int id)
	{
		System.out.println("Welcome to Method overloading: "+id);
	}

	void show(String name)
	{
		System.out.println(name+" Welcome to Method overloading");
	}

	void show(String name,String city)
	{
		System.out.println(name+" Welcome to Method overloading from "+city);
	}
	
	public static void main(String args[])
	{
		OverLoadDemo o1=new OverLoadDemo();
		o1.show(1);
		o1.show("Dipali");
		o1.show("Dipali","Mumbai");
	}

}