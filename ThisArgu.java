 // this keyword as a argument

class ThisArgu
{
	int id;
	String name;

	public ThisArgu(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void  display(ThisArgu obj)
	{
		System.out.println("Display Method Executed:");
		System.out.println(" ID: "+id+" Name: "+name);
	}
	void show()
	{
		System.out.println("Show Method executed:");
		display(this);
	}
	void info()
	{
		System.out.println("Info Method Executed:");
		display(this);
	}
	public static void main(String args[])
	{
 		ThisArgu t1=new ThisArgu(1,"Sonali");
		t1.show();


		ThisArgu t2=new ThisArgu(2,"Bhavesh");
		t2.info();
	}
}