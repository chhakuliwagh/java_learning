class ATM
{
	public static void main(String args[])
	{
		Account a1=new Account();
		System.out.println(a1.viewbalance);
		System.out.println("Current Balance: "+a1.depositBal(10000));
		//System.out.println(" Available Balance"+a1.withdrawbal);
		

	}


}