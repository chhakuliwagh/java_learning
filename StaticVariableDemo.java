// static keyword use:-  1. use with variable 2. create a method 3.blocks 4. static nested class

class StaticVariableDemo
{
	int emp_id=10;
	String ename="Dipali";
	static String cname="FCTP";
	StaticVariableDemo(int emp_id,String ename)
	{
		this.emp_id=emp_id;
		this.ename=ename;
	}
	void show()
	{
		System.out.println("Emp Id: "+emp_id+" Emp Name: "+ename+" Company Name: "+cname);
	}
	public static void main(String args[])
	{
		StaticVariableDemo d1=new StaticVariableDemo(101,"Sachin");
		StaticVariableDemo d2=new StaticVariableDemo(103,"Lokesh");
		
			d1.show();
			d2.show();



	}

} 