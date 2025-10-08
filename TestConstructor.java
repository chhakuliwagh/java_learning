class ConsMethod
{
public ConsMethod()
{
	this(10);
	System.out.println("Default Constructor: ");
	
}
public ConsMethod(int id)
{	
	    
 	System.out.println("Parameterized constructor: "+id);
}
}

class TestConstructor
{

public static void main(String args[])
{
	ConsMethod c1=new ConsMethod();
		
	

}

}