class MethodDemo2
{

	public void display()   //non static method :use objecgt
		{
                    System.out.println("this is my userdefine method");
		}
	static void goOut()
		{
		  System.out.println("Userdefine Static method");
		}
 public static void main(String args[])
	{
            //System.out.println("2 raised to 2:-"+Math.pow(2,2));//predefine method

		MethodDemo2 m1=new MethodDemo2();
		m1.display();
		goOut();
  
	}
		



}