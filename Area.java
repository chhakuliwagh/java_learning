// arear of circle , square and rectangle

class Area
{
	void area(int l, int b)
	{
		System.out.println("the arear of square is : "+ (l*b));
		
	}

	void area(int l)
	{
		System.out.println(" the arear of reactangle is : "+ (l*l));
	}

	void area(flaot PI,float r,float r )
	{
		System.out.println("the arear of circle is : "+ (PI*r*r));
		
	}


	public static void main(String args[])
	{
		Area a1=new Area();
		a1.area(10);
		a1.area(10,20);
		a1.area(3.14,10,20);
		
	}

}