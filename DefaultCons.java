// Constructor: special type of method which having same name as a class name ,we does not have a return type , we can have access modifier to control object creation, constructor can accept parameter same as normal java method


//type of constructor(optional): 1.default constructor 2. parameterized constructor

// default constructor example



class DefaultCons
{

	public DefaultCons()
	{
		System.out.println("Default Constructor Executed");
	}

	public static void main(String args[])
	{	
		DefaultCons d1=new DefaultCons();
		DefaultCons d2=new DefaultCons();
		DefaultCons d3=new DefaultCons();

	}

}