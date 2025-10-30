// Hybrid inheritance example

interface a
{
	int id=100;
}
interface b
{
	String name="Dipali";
}
class c implements a,b
{
	String city="Mumbai";
	public void display()
	{	
	System.out.println("Id: "+id+" Name: "+name+" City: "+city);
	}
}