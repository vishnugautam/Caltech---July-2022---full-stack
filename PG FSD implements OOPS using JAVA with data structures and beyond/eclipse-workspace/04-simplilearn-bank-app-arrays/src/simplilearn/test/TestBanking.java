package simplilearn.test;

import simplilearn.domain.Bank;
import simplilearn.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		// create an object of Bank
		Bank myBank = new Bank();
		
		myBank.addCustomer("Simms", "Jane");
		myBank.addCustomer("Vishnu", "Gautam");
		myBank.addCustomer("Archana", "Ashok");
		myBank.addCustomer("Ajit", "Jain");
		
		for(int i=0; i<myBank.getNumberOfCustomers(); i++) {
			Customer theCustomer = myBank.getCustomer(i);
			
			System.out.println(" Customer [" +(i+1)+ "] is " + theCustomer.getLastName() + ", " + theCustomer.getFirstName());
		}
		
	}

}
