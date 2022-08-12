package demo;

public abstract class Customer {
	String customerID;
	String customerName;
	String customerType;
	
	Customer(String custID, String custName, String custType){
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
	}
	
	void showCustomerDetails() {
		System.out.println("Customer ID: " + this.customerID);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Customer Type: " + this.customerType);
	}
	
	abstract double getFinalAmount(double interest, int year);
}
