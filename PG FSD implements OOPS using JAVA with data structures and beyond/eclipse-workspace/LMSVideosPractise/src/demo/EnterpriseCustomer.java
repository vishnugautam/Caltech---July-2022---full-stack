package demo;

public class EnterpriseCustomer extends Customer{
	
	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	EnterpriseCustomer(String custID, String custName, String custType, double amt){
		super(custID, custName, custType);
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
		this.amount = amt;
	}
	
	double getFinalAmount(double interest, int year) {
		double simpleInterest = this.amount * interest * year;
		double amount = this.amount + simpleInterest;
		
		amount = amount - 500;
		if (this.customerType == "SmallScale") {
			return amount - 100;
		}
		else if (this.customerType == "BigScale") {
			return amount;
		}
		return amount;
	}
}
