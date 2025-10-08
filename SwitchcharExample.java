class SwitchcharExample
{
 public static void main(String args[])
	{
		String ch;

		System.out.println("Sunday");
		System.out.println("Monday");
		System.out.println("Tuesday");
		System.out.println("Wednesday");
		System.out.println("Thrusday");
		System.out.println("Friday");
		System.out.println("saturday");
		
		//Enter your choice

		ch="Monday";

		switch(ch)
			{
				case "Sunday":
				System.out.println("Sunday (Ravivāra)Planet: Sun (Surya)Deity: Surya Bhagavan (Sun God)Significance:Associated with vitality, health, authority, and leadership");
				break;

				case "Monday":
				System.out.println("Monday (Somavāra)Planet: Moon (Chandra)Deity: Lord ShivaSignificance:Represents calmness, emotions, and the mind");
				break;

				case "Tuesday":
				System.out.println("Tuesday (Maṅgalavāra)Planet: Mars (Mangal / Kuja)Deity: Hanuman, Durga, Skanda (Kartikeya)Significance:Symbolizes strength, courage, and protection");
				break;

				case "wednesday":
				System.out.println("Wednesday (Budhavāra)Planet: Mercury (Budha)Deity: Lord Vishnu, Krishna, and Budha GrahaSignificance:Represents intelligence, communication, and business");
				break;

				case "Thrusday":
				System.out.println("Thursday (Guruvāra / Brihaspativāraa)Planet: Jupiter (Guru / Brihaspati)Deity: Lord Vishnu, Brihaspati (Guru), and Sai Baba (in modern practice)Significance:Associated with knowledge, wisdom, and prosperity");
				break;

				case "Friday":
				System.out.println("Friday (Shukravāra)Planet: Venus (Shukra)Deity: Goddess Lakshmi, Santoshi Mata, and Shukra GrahaSignificance:Represents love, wealth, beauty, and material comforts");
				break;

				case "Saturday":
				System.out.println("Saturday (Shanivāra)Planet: Saturn (Shani)Deity: Shani Dev, Hanuman, and Lord Vishnu (in some traditions)Significance:Associated with discipline, justice, hard work, and karmic balance");
				break;



				default:
				System.out.println("Invalid sports selected");
				break;

			}

	}
}