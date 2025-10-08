// this keyword :- 1. to access current instance ( variables methods)of a class,, 2. calling constructor this() 3 pass arguments to method and constrictor 4 return reference of current class 

class Student
{
	int id;
	String name;
	double marks;
	public Student(int id,String name,double marks)
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
		Student s1=new Student(101,"Dipali",80.55);
		s1.display();
		Student s2=new Student(102,"Gayatri",90.55);
		s2.display();

	}

} 