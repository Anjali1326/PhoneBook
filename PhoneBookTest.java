//Raymond Adams
public class PhoneBookTest extends PhoneBookEntry{

	

	public static void main (String [] args){
		//This is an of PhoneBookEntry
		double PhoneBookEntry[] ;
		//This stores objects into PhoneBookEntry array
		PhoneBookEntry s1 = new PhoneBookEntry();
		PhoneBookEntry s2 = new PhoneBookEntry();
		PhoneBookEntry s3 = new PhoneBookEntry();
		PhoneBookEntry s4 = new PhoneBookEntry();
		PhoneBookEntry s5 = new PhoneBookEntry();

		s1.name = "Sherlock Holmes";
		s1.number = "123-456-7890";
		s1.address = "221 B Baker St London, UK";

		s2.name = "Bilbo Baggins";
		s2.number = "234-567-8901";
		s2.address = "1 Bagshot Row Hobbiton, Shire";

		s3.name = "Clark Kent";
		s3.number = "345-678-9012";
		s3.address = "1938 Sulivan Ln Metropolis, USA";

		s4.name = "Harry Potter";
		s4.number = "456-789-0123";
		s4.address = "4 Privet Drive Little Whinging, UK";

		s5.name = "Charles Francis Xavier";
		s5.number = "567-890-1234";
		s5.address = "1407 Graymalkin Lan North Salem, USA";


		System.out.println(s1.name + "\n" + "Phone Number: " + s1.number + "\n" + s1.address);
		System.out.println();
		System.out.println(s2.name + "\n" + "Phone Number: " + s2.number + "\n" + s2.address);
		System.out.println();
		System.out.println(s3.name + "\n" + "Phone Number: " + s3.number + "\n" + s3.address);
		System.out.println();
		System.out.println(s4.name + "\n" + "Phone Number: " + s4.number + "\n" + s4.address);
		System.out.println();
		System.out.println(s5.name + "\n" + "Phone Number: " + s5.number + "\n" + s5.address);
		System.out.println();









	}
}
