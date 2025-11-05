// Largest and smallest element of the array


class LargeSmallNum
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];	
			}
			else
			{
				min=a[i];
			}
					
		}
		for (int j:a)
		{
			System.out.println(j);
			System.out.println(max);
			System.out.println(min);


		}

		System.out.println("Largest element"+max+"smallest element"+min);
		}



}