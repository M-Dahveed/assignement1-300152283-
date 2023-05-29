import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Address address1 = new Address("Queen", 48, "K1P1N2");
		Address address2 = new Address("King Edward", 800, "K1N6N5");
		
		Employee Falcao = new Employee("Falcao");
		Falcao.addAddress(address1);
		Falcao.addAddress(address2);
		
		ArrayList<Address> addressList = Falcao.getAddressList();
		String writtenAddressList = address1.writeAddress() + " & " + address2.writeAddress();
		
		
		System.out.println("Name: " + Falcao.getName());
		System.out.println("Hours worked: " + Falcao.getHours());
		System.out.println("Rate: " + Falcao.getRate());
		System.out.println("Address List: " + writtenAddressList);
	}

}
