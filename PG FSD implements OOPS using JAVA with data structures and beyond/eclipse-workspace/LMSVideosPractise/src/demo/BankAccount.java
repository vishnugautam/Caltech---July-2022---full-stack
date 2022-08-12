package demo;

public class BankAccount {

	public static void main(String[] args) {
		RegularCustomer regCustomer1 = new RegularCustomer("R123", "Krishna", "Domestic", 10000);
		RegularCustomer regCustomer2 = new RegularCustomer("R345", "Satish", "Business", 10000);
		
		RegularCustomer entCustomer1 = new RegularCustomer("E789", "Madhu", "SmallScale", 10000);
		RegularCustomer entCustomer2 = new RegularCustomer("E379", "Lahari", "BigScale", 10000);
		
		regCustomer1.showCustomerDetails();
		System.out.println("Final amount: " + regCustomer1.getFinalAmount(5, 8));
		regCustomer2.showCustomerDetails();
		System.out.println("Final amount: " + regCustomer2.getFinalAmount(5, 8));
		
		entCustomer1.showCustomerDetails();
		System.out.println("Final amount: " + entCustomer1.getFinalAmount(5, 8));
		entCustomer2.showCustomerDetails();
		System.out.println("Final amount: " + entCustomer2.getFinalAmount(5, 8));
	}

}
