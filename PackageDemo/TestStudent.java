import package1.Student;
class TestStudent
{
	public static void main(String args[])
	{
		Student s1=new Student();
		// System.out.println(s1.id+" "+s1.name+" "+s1.city);
		s1.setId(10);
		s1.setName("Lokesh");
		s1.setCity("Mumbai");

		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCity());


	}
	
}