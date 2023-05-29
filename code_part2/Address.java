public class    Address {
	private String street;
	private int number;
	private String postalCode;
	
	/*
	 * Constructor function for an Address object. Creates an object of type Address.
	 * 
	 *Parameters: Street Name, Street Number and Postal Code
	 */
	public Address(String street, int number, String postalCode) {
		this.street = street;
		this.number = number;
		this.postalCode = postalCode;
	}
	/*
	 * Returns: A string that reads out the address including the street name, number and postal code.
	 */
	public String writeAddress() {
		return number + " " + street + ", " + postalCode;
	}

}
