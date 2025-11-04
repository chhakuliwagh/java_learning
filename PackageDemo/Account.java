// Create account class with private data member balance and public gete



public class Account
{
	private float balance;

	private float viewbalance;
	{
		return balance;
	}
	

	private void depositBal(float amount)
	{
		if(amount>0)
		{
		balance=balance+amount;
		}
		return balance;
		
	}

	private void withdrawBal(float amount)
	{
		if(balance>amount && amount>0)
		{
		balance=balance-amount;
		}
		return balance;
		
	}

	


}