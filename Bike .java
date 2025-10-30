class Vehical
{
	public void run()
	{
	System.out.println("Hello from parent class method");
	}

}


class Bike extends Vehical
{
	public void run()
	{
	System.out.println("Hello from child class method");
	}

	public static void main(String args[])
	{
		Vehical v1=new Vehical();
		v1.run();
	}

}