package chap6;

public class Address {
	private String country;
	private String province;
	private String city;
	private String street;
	
	public Address(String country, String province, String city, String street) {
		
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
	}
	
	public String toString()
	{
		return country+":"+province+":"+city+":"+street;
	}
}
