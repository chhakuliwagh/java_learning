class Sapdigit
{
 public static void main(String args[])
{
  int number=34567,digit=0;;
	while(number!=0)
		{
		  digit=number%10;
		  number=number/10;
		 System.out.println(""+digit);
		}
}
}