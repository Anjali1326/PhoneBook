//Raymond Adams
public class Address {
	//instance variables
	private int houseNumber;
	private String street, city, country;
	
	public Address(int n, String s, String ct, String cn){
		this.houseNumber = n;
		this.street = s;
		this.city = ct;
		this.country = cn;
	}
	
	//set method for houseNumber
	void setHouseNumber(int n){
		this.houseNumber = n;
	}
	//get method for houseNumber
	double getHouseNumber(){
		return this.houseNumber; 
	}
	
	//set method for street
	void setStreet(String s){
		this.street = s;
	}
	//get method for street
	String getStreet(){
		return this.street; 
	}
	//set method for city
	void setCity(String ct){
		this.city = ct;
	}
	//get method for city
	String getCity(){
		return this.city; 
	}
	//set method for country
	void setCountry(String cn){
		this.country = cn;
	}
	//get method for country
	String getCountry(){
		return this.country; 
	}
	
	//toString method that returns a String with the detailed address
	public String toString(){
		String address = "";
		address += this.houseNumber +  " : " + this.street + " : " + this.city + " : " + this.country ;
		return address;
	}
	
	
			
			
}
