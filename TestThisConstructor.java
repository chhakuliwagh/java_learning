// passing this keyword as a argument in constructor
// i can able to use one single object into multiple classes by passing the this keyword as argument to constructor

class ThisConstructor
 { 	
	TestThis obj;

	public ThisConstructor(A obj)
	{
		this.obj=obj;
	}
	void info()
	{
		System.out.println(obj.data);
	}
}
class TestThisConstructor
{
	int data=50;

	A()    // this called as anonymous class
	{
		ThisConstructor t1=new ThisConstructor(this);
		d1.info();

		ThatConstructor t2=new ThisConstructor(this);

		CircleConstructor c3=new CircleConstructor(this);

		

	}	
	public static void main(String args[])	
	{
		A a1=new A();
	}
}