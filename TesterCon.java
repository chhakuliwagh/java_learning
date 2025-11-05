class MethodCons
{
void display(int a)
	{
		System.out.println("Void display method: "+a);
	}
void show(int b)
	{
		System.out.println("Void show method: "+b);
		//display();
		display(10);
		this.display(b); 
  // current instance of class,, this.dispaly()=dispaly() both callad as corrent class object
	}
}
class TesterCon
{
	public static void main(String args[])
	{
		MethodCons m1=new MethodCons();
		m1.show(10);

		MethodCons m2=new MethodCons();
		m2.show(20);

	}
}