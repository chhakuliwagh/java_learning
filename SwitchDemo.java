// Switch case statement

class SwitchDemo
{
 public static void main(String args[])
	{
		int ch;

		System.out.println("1.Cricket");
		System.out.println("2.Football");
		System.out.println("3.volleyball");
		System.out.println("4.Poker");
		System.out.println("5.Rugby");
		//Enter your choice

		ch=7;

		switch(ch)
			{
				case 1:
				System.out.println("My favourite sport is cricket");
				break;

				case 2:
				System.out.println("My favourite sport is Football");
				break;

				case 3:
				System.out.println("My favourite sport is volleyball");
				break;

				case 4:
				System.out.println("My favourite sport is Poker");
				break;

				case 5:
				System.out.println("My favourite sport is Rugby");
				break;

				default:
				System.out.println("Invalid sports selected");
				break;

			}

	}
}