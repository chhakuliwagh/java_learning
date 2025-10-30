class Employee
{
	 int salary=40000;
	 String company_name="FCTP";

}
class Programmer extends Employee
{
	int bonus=10000;
	String name="Lokesh";
	String skill="Java";

}
class Tester extends Employee
{
	int bonus=5000;
	String name="Suresh";	
	String skill="slenium";
}
class TestInheritance
{
	public static void main(String args[])
	{

		 Programmer p1=new Programmer();
	        System.out.println("Name: "+p1.name+" Salary: "+p1.salary+" Bonus: "+p1.bonus+" Comapany: "+p1.company_name+" Skill: "+p1.skill);

		 Tester p=new Tester();
	        System.out.println("Name: "+p.name+" Salary: "+p.salary+" Bonus: "+p.bonus+" Comapany: "+p.company_name+" Skill: "+p.skill);



		// Jprogrammer p=new Jprogrammer();
		// System.out.println("Name: "+p.name+" Salary: "+p.salary+" Bonus: "+p.bonus+" Comapany: "+p.company_name+" Skill: "+p.skill);
	}
}