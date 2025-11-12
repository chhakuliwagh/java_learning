 // 1) reusability
//  2) inheritance it is Is-a kind of relationship   
//  3)has-a kind of relationship
//  4) use extend keyword that callad as a Inheritance


class Address  
{
	String city,state,country;

	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;


	}
}        

class Employee
{
	int eid;
	String ename;
	Address eaddress;
		
	Employee(int eid,String ename,Address eaddress)
	{
		this.eid=eid;
		this.ename=ename;
		this.eaddress=eaddress;
	}
	void display()
	{
		System.out.println(eid+" "+ename);
		System.out.println(eaddress.city+" "+eaddress.state+" "+eaddress.country);

	}
}   
class TestAggregation
{
	public static void main(String args[])
	{
		Address a1=new Address("Pune","Maharashtra","India");
		Employee e1=new Employee(101,"Diapli",a1);
		e1.display();

	}

}                                                                                                                                                                                                                                                                                                                                      