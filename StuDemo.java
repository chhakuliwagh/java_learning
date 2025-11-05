class StuDemo
{
	int rollno;
	String name,course;
	float fee;

	StuDemo(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
		}
	StuDemo(int rollno,String name,String course)
		{
			this(rollno,name);  // reusing constructor or constructor chaining
			this.course=course;
		}
	
	StuDemo(int rollno,String name,String course,float fee)
		{
			this(rollno,name,course);  // reusing constructor or constructor chaining
			this.fee=fee;
		}
	void display()
	{
		System.out.println("RollNo: "+rollno+" Name: "+name+" course: "+course+" fee: "+fee);
	}

	public static void main(String args[])
	{
		StuDemo s1=new StuDemo(101,"Vasu","BCA");
		StuDemo s2=new StuDemo(101,"Tanvi","BBA",40000);
		s1.display();
		s2.display();
	}
}