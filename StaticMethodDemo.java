// static method


class StaticMethodDemo
{
	int emp_id=10;
	String ename="Dipali";
	static String cname="FCTP";
	StaticMethodDemo(int emp_id,String ename)
	{
		this.emp_id=emp_id;
		this.ename=ename;
	}
	static void change()
	{
		emp_id=12;
		ename="Tulsi";
		cname="FCTS";

	}
	void show()
	{
		//cname="FCTB";
		System.out.println("Emp Id: "+emp_id+" Emp Name: "+ename+" Company Name: "+cname);
	}
	public static void main(String args[])
	{
		StaticMethodDemo d1=new StaticMethodDemo(101,"Sachin");
		StaticMethodDemo d2=new StaticMethodDemo(103,"Lokesh");
			change();
			d1.show();
			d2.show();



	}

} 