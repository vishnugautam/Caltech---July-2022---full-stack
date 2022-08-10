package simplilearn.domain;

public class Bank {
	// Associations - 1 to many 
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() { // constructor of class Bank 
		//create an array of customers 
		customers = new Customer[10]; // create an array of Customer
		// we can use an array to create a class which is already created
		numberOfCustomers = 0;
	}
	
	public void addCustomer(String f, String l) {
		int i = numberOfCustomers++;
		customers[i] = new Customer(f,l);
		// create an object of Customer
		// in each array we insert an object of customer 
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int customer_index) {
		return customers[customer_index];
	}
}
