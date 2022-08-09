package simplilearn.test;

import simplilearn.domain.Account;
import simplilearn.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		// create the customer 
		System.out.println("Creating the customer Vishnu Gautam");
		Customer theCustomer = new Customer("Vishnu", "Gautam");
		
		System.out.println("Creating his account with $500 balance");
		Account account = new Account(500);
		theCustomer.setAccount(account);
		
		System.out.println("Withdraw 150.00 :" + account.withdraw(150.00));
		
		System.out.println("Deposit 22.50 :" + account.deposit(22.50));
		
		System.out.println("Customer [" + theCustomer.getFirstName() + "," + theCustomer.getLastName() + "] has a balance of " + theCustomer.getAccount().getBalance());
		
		
	}

}
