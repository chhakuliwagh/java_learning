class Stu
{
	int id;
	String name;
	double marks;

	public Stu(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public void display()
	{
		System.out.println("ID: "+id+" Name: "+name+" Marks: "+marks);

	}
	public static void main(String args[])
	{
		Stu s1=new Stu(1,"Dipali",90.00);
		s1.display();
		Stu s2=new Stu(2,"Lokesh",89.66);
		s2.display();	
		
	

	}

}