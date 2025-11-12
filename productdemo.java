class product
{
	int pid;
	String pname;
	float pprice;
	
	product(int pid,String pname,float pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
	}
	public void display()
	{
		System.out.println("Id: "+pid+" Name: "+pname+" Price: "+pprice);
	}
}
class productdemo
{

	public static void main(String args[])
	{
		product obj[]=new product[3]; //obj[] means=array[]
		obj[0]=new product(1,"iphone",300);
		obj[1]=new product(2,"tablet",500);
		obj[2]=new product(3,"watch",800);
		obj[0].display();
		obj[1].display();
		obj[2].display();

	}
}