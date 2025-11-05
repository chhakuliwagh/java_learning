// you have to write a java program to perform sum of first 10 natural number using array and dynamic 


class NaturalNum
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int sum=0;
		System.out.println("my Command line array data:");

		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int j:a)
		{
			
			sum=sum+j;
			
		}
		System.out.println(sum);
	}



}