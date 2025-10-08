class Thiskey
{
	int id;
	String name;
	double marks;
	public Thiskey(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;

	}

	public void display()
	{
		System.out.println("Id:"+id+" Name: "+name+" Marks: "+marks);
	}

	public static void main(String args[])
	{	
		Thiskey t1=new Thiskey(101,"Dipali",80.55);
		t1.display();
		Thiskey t2=new Thiskey(102,"Gayatri",90.55);
		t2.display();

	}

} 