// 65-C, 75-B, 90-A  ,F

class marks
	{
	public static void main(String args[])
	{

	int marks=0;
	if((marks>75) && (marks<100))

	{
	System.out.println("Grade A");
	}

	else if((marks>65) && (marks<75))
	{
	System.out.println("Grade B");
	}

	else if((marks<65) && (marks<75))
	{
        System.out.println("Grade C");
	}

	else
	{
  	System.out.println("Fail");
	}

	}
}