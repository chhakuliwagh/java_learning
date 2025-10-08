class StudentDemo
{
	int rollno;
	String name, course;
	float fee;

	StudentDemo(int rollno,String name, String course)

	{
      		this.rollno=rollno;
		this.name=name;
		this.course=course;

	}
	
	StudentDemo(int rollno,String name,String course,float fee)

	{
		this(rollno,name,course);  //reusing constructor or constructor chaining
		this.fee=fee;

	}

	void display()
	{
		System.out.println(" RollNo: "+rollno+" Name: "+name+" Course: "+course+" Fee: "+fee);
	}
		
	public static void main(String args[])
	{
		StudentDemo s1=new StudentDemo(45,"Dipali","BCA");
		StudentDemo s2=new StudentDemo(46,"Lokesh","MCA",45000);
		s1.display();
		s2.display();
	}

}