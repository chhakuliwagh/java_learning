class ThisConArgu
{
	TestThis obj;

	public ThisConArgu(TestThis obj)
	{
		this.obj=obj;

	}
	void info()
	{
	System.out.println("Lokesh: "+obj.data);
	}

}
class ThisConArgu1
{
	TestThis obj1;

	public ThisConArgu1(TestThis obj1)
	{
		this.obj1=obj1;

	}
	void info()
	{
	System.out.println("Divyesh: "+obj1.data);
	}

}


class TestThis
{
	int data=50;
	TestThis()
	{
		ThisConArgu d1=new ThisConArgu(this);
		d1.info();

		ThisConArgu1 d2=new ThisConArgu1(this);
		d2.info();
	}
	public static void main(String args[])
		{
		TestThis t1=new TestThis();
		}
}