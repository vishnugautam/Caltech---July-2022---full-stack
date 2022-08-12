package demo;

public class RegularCustomer extends Customer{
	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	RegularCustomer(String custID, String custName, String custType, double amt){
		super(custID, custName, custType);
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
		this.amount = amt;
	}
	
	double getFinalAmount(double interest, int year) {
		double simpleInterest = this.amount * interest * year;
		double amount = this.amount + simpleInterest;
		
		if (this.customerType == "Domestic") {
			return amount - 500;
		}
		else if (this.customerType == "Business") {
			return amount;
		}
		return amount;
	}
}
