import java.util.Scanner;

//Raymond Adams
public class PhoneBookEntry  {
	//PhoneBook info = new PhoneBook();
	public String name;
	public String number;
	public static String address;
	
	
	//set method for name
	void setName(String n){
		this.name = n;
	}
	//get method for name
	String getName(){
		return name;
	}
	//set method for name
	void setNumber(String p){
		this.number = p;
		}
	//get method for name
	String getNumber(){
		return number;
		}
	
	
	public PhoneBookEntry(String n, String p, String a){
		this.name = n;
		this.number = p;
		this.address = a;
		
		
	}
	
	public PhoneBookEntry() {
		
	}
	public String toString(){
		String data = "";
		this.name +=  " : " + this.number ;
		return data;
	}
	
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of entries");
		int entrie = keyboard.nextInt();
		
		keyboard.nextLine();
		//stores object into array
		PhoneBookEntry[] info = new PhoneBookEntry[entrie];
		
		for(int i = 0; i <= entrie - 1; i++){
			System.out.println("Enter name:");
			String name = keyboard.nextLine();
			
			System.out.println("Enter number:");
			String number = keyboard.nextLine();
			
			//creates an object
			info[i] = new PhoneBookEntry(name, number, address);
		}
		
		System.out.println("Finished Entry.");
		System.out.println("Printing Phonebook");
		for(int i = 0; i <= entrie - 1; i++ ){
			System.out.println(info[i].getName() + " : " + info[i].getNumber());
		}
			
		
		
	
	

	}
	
	
}
