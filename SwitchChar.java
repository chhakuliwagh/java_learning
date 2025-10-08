wclass SwitchChar
{
 public static void main(String args[])
	{
	      string ch="";

		System.out.println("Sunday");
		System.out.println("Monday");
		System.out.println("Tuesday");
		System.out.println("Wednesday");
		System.out.println("Thrusday");
		System.out.println("Friday");
		System.out.println("Saturday");

		//Enter your choice

		ch="Sunday";

		switch(ch)
			{
				case "Sunday":
				System.out.println(" Planet: Sun (Surya)
						   Deity: Surya Bhagavan (Sun God)
                                                   Significance:Associated with vitality, health, authority, and leadership.
                                                   Fasting on Sundays is believed to remove ailments, especially related to the eyes, bones, and skin.");
                                     break;

				case 'B':
				System.out.println("Planet: Moon (Chandra)
						    Deity: Lord Shiva
						    Significance:Represents calmness, emotions, and the mind.
                                                     Fasting on Mondays (Somavār Vrat) pleases Lord Shiva; 
                                                     popular among unmarried girls for getting a good spouse.")
			                break;

				case 'C':
				System.out.println("Tuesday (Maṅgalavāra)
							Planet: Mars (Mangal / Kuja)
							Deity: Hanuman, Durga, Skanda (Kartikeya)
							Significance:Symbolizes strength, courage, and protection.
							People fast on Tuesdays to reduce the malefic effects of Mars (Mangal Dosh).");
				break;

				case 'D':
				System.out.println("Planet: Mercury (Budha)
							Deity: Lord Vishnu, Krishna, and Budha Graha
							Significance:Represents intelligence, communication, and business.
							Wednesday fasts help improve memory, speech, and financial stability.
							Green-colored items and tulsi leaves are considered auspicious.");
				break;

				case 'E':
				System.out.println("Thursday (Guruvāra / Brihaspativāra)
					Planet: Jupiter (Guru / Brihaspati)
					Deity: Lord Vishnu, Brihaspati (Guru), and Sai Baba (in modern practice)
					Significance:Associated with knowledge, wisdom, and prosperity.
					Thursday fasting brings blessings of Guru and Vishnu.");
				break;

				case 'F':
				System.out.println("Friday (Shukravāra)
						Planet: Venus (Shukra)
						Deity: Goddess Lakshmi, Santoshi Mata, and Shukra Graha
						Significance:Represents love, wealth, beauty, and material comforts.
						Friday fasting is observed for prosperity, marital happiness, and removal of poverty.
						White and pink are considered auspicious; devotees offer sweets and milk.");
				break;

				case 'G':
				System.out.println("Saturday (Shanivāra)
					Planet: Saturn (Shani)
					Deity: Shani Dev, Hanuman, and Lord Vishnu (in some traditions)
					Significance:Associated with discipline, justice, hard work, and karmic balance.
					Saturday fasts and prayers help reduce the malefic effects of Shani (Sade-Sati, Dhaiya).");
				break;


				default:
				System.out.println("Invalid days selected");
				break;

			}

	}
}