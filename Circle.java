// Q. Write a java program usage of final variable and final class it should include final //constant class with contains final variable as PI

//next you have to use pi to calculate area of ciorcle in another class while is use to calculate //area of circle.



final class Constants
{
	final static double pi=3.14;
}
class Circle
{
	int radius;

	public Circle(int radius)
	{
		this.radius=radius;
	}

	public void area()
	{
		double result=Constants.pi*radius*radius;
	
		System.out.println("Area of circle is: "+result);
	}

	public static void main(String args[])
	{
		Circle c1=new Circle(5);
		c1.area();
	}

}