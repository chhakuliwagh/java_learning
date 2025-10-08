class LightBillExa
{
public static void main(String args[])
	{
		int lightbill=400;

		if(lightbill<=100)
		{
		System.out.println("Low Usage");
		}

		else if((lightbill>=100) &&(lightbill<=300))               //else if((bill>100) && (bill<300))
		{
		System.out.println("Medium Usage");
		}

		else if(lightbill>=300)                                   //else if((bill>300) && (bill<500))
		{
		System.out.println("Heigh Usage");
		}

		else
		{
		System.out.println("Rest of the code..");
		}
	}
}