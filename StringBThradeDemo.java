//String Buffer=Thrade safe


class StringBThradeDemo
{
	public static void main(String args[])
	{	
		//String Buffer

		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Java");

		for(int i=0;i<150000;i++)
			{
			sb.append(" is easy");
			}
		System.out.println("Time taken by string buffer: "+(System.currentTimeMillis()-startTime));

		
		//String Builder

		 startTime=System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("Java");

		for(int i=0;i>50000;i++)
			{
			sb1.append(" is easy");
			}
		System.out.println("Time taken by string builder: "+(System.currentTimeMillis()-startTime));

	}

}