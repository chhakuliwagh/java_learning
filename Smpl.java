class Smpl
{
	int id;
	String name;
	public Smpl(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display(Smpl obj)  // use integer keyword
	{
		System.out.println("Display Method Executed: ");
		System.out.println("Id: "+id+" Name: "+name);
	}
	void show()
	{
		System.out.println("Show Method Executed: ");

		display(this);  //call current class constructor//we can pass integer value
	}
	void info()
	{
		System.out.println("info Method Executed: ");
		display(this);  //call current class constructor//we can pass integer value
	}

	public static void main(String args[])
	{
		Smpl s1=new Smpl(101,"Rahul");
		s1.show();

		Smpl s2=new Smpl(102,"Jayesh");
		s2.info();
		
	}
}
