package co.edureka;

public class Address {
	//Attributes
	String city;
	String division;
	int zipCode;
	
	//methods
	public Address(String city, String division, int zipCode) {
		super();
		this.city = city;
		this.division = division;
		this.zipCode = zipCode;
	} 
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getdivision() {
		return division;
	}
	
	public void setdivision(String division) {
		this.division = division;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", division=" + division + ", zipCode=" + zipCode + "]";
	}
	
}
