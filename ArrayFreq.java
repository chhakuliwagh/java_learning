// find out the frequency of each element in java

class ArrayFreq
{
	public static void main(String args[])
	{
		int array[]={1,2,1,3,2,4,5,4,5};
		int freq[]=new int[9];
	
		int visited =-1;

		for(int i=0;i<array.length;i++)
		{
			int count=1;

			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
				count++;
				freq[j]=visited;
				}	
			}
		
			if(freq[i]!=visited)
			freq[i]=count;
			
		}
		for(int i=0;i<9;i++)
		{
			if(freq[i]!=visited)
			{

				System.out.println("Number: "+array[i]+" Frequency: "+freq[i]);
			}


		}
	}


}