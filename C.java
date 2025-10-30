// Hybrid inheritance example

interface A
{
	int id=100;
}
interface B
{
	String name="Dipali";
}
class C implements A,B
{
	String city="Mumbai";

	public void display()
	{	
	System.out.println("Id: "+id+" Name: "+name+" City: "+city);
	}
}