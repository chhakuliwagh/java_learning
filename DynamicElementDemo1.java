// Double

class DynamicElementDemo1
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		System.out.println("my Command line array data:");

		for(int i=0;i<args.length;i++)
		{
			a[i]=Double.parseDouble(args[i]);
		}
		for(Double j:a)
		{
			System.out.println(j);
		}
	}



}