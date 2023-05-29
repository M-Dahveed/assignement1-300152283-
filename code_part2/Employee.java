import java.util.ArrayList;

public class Employee {
	private String name;
	private int hours = 40;
	private double rate = 15.50;
	private ArrayList<Address> addressList = new ArrayList<Address>();
	
	/*
	 * Constructor for an object of type Employee.
	 * Parameters: Name of Employee, Hours Worked, Wage Rate and List of Addresses
	 */
	public Employee(String name, int hours, double rate, ArrayList<Address> addressList) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		this.addressList = addressList;	
	}
	//returns name of employee
	public Employee(String name) {
		this.name = name;
	}
	

	 //@param address the address of employee

	public void addAddress(Address address) {
		addressList.add(address);
	}
	

	 // Returns: Name of the Employee

	public String getName() {
		return name;
	}


	  //Returns: Hours worked

	public int getHours() {
		return hours;
	}


	//Returns: The wage rate

	public double getRate() {
		return rate;
	}


	 //Returns list of address of the employee

	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	

	}
	
