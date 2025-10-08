// write a program to print a number in a reverse order

class reverse
{
	public static void main(String args[])
	{
		int no=234,rev=0,digit;
		do
		{
		digit=no%10;
		rev=rev*10+digit;
		no/=10;
		
		}
		while(no!=0);
		System.out.println(rev);
	}
}