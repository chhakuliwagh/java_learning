class whileDemo
{
 public static void main(String args[])
	{
	int no=12345,digit=0;
	System.out.println("Reverse Number:");

	while(no!=0)
		{
		digit=no%10;
		no=no/10;
		System.out.println(" "+digit);
		}
	
	}
}