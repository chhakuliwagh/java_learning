// even and odd number beetween 1 to 50  


class EvenOdd
{
public static void main(String args[])
	{
	int i,number=50;
	//int even;
 	System.out.print("Even Number:");
	for(i=1;i<=50;i++)
		{
		if(i%2==0)
			{
			System.out.print(i+" ");
			}	
		}
	System.out.print("\n");
	System.out.print("\n");

	System.out.print("Odd Number:");
	for(i=1;i<=50;i++)
		{
		if(i%2!=0)
			{
			System.out.print(i+" ");
			}	
		}
	}
}