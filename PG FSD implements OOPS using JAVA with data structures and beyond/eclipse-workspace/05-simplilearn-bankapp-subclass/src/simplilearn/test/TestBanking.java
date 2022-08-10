package simplilearn.test;

import simplilearn.domain.Account;
import simplilearn.domain.Bank;
import simplilearn.domain.CheckingAccount;
import simplilearn.domain.Customer;
import simplilearn.domain.SavingsAccount;

public class TestBanking {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		System.out.println("Creating the customer Jane Smith");
		bank.addCustomer("Jane", "Smith");
		customer = bank.getCustomer(0);
		System.out.println("Creating her savings account with 500.00 balance");
		customer.setAccount(new SavingsAccount(500.00, 0.03));
		
		System.out.println("Creating the customer Owen Bryant");
		bank.addCustomer("Owen", "Bryant");
		customer = bank.getCustomer(1);
		System.out.println("Creating his checking account with a 500.00 balance and there is new overdraft production");
		customer.setAccount(new CheckingAccount(500.00));
		// Polymorphism concept:
		// using the same method for savings account and checking account
		// i don't have a seperate method for savings account and checking account
		// i use a common method 
		
		System.out.println("Creating the customer Vishnu Gautam");
		bank.addCustomer("Vishnu", "Gautam");
		customer = bank.getCustomer(2);
		System.out.println("Creating his savings account with 500.00 balance and also given 500.00 as overdraft production");
		customer.setAccount(new CheckingAccount(500.00,500.00)); // we have 2 constructor in the CheckingAccount which takes 500 as balance and 500 as overdraft
		
		System.out.println("Creating the customer Maria Soley");
		bank.addCustomer("Maria", "Soley");
		customer = bank.getCustomer(3);
		System.out.println("Maria shares her checking account with her husband Tim");
		customer.setAccount(bank.getCustomer(2).getAccount());
		
		// Test a standard Savings Account
		System.out.println("Retrieving the customer Jane Smith with her savings account");
		customer = bank.getCustomer(0);
		account = customer.getAccount();
		// perform some account transaction
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		// print out the final account balance 
		System.out.println("Customer [" + customer.getLastName() + " , " + customer.getFirstName() + "] has a balance of " + account.getBalance());
		
		System.out.println();
		System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft production");
		customer = bank.getCustomer(1);
		account = customer.getAccount();
		// perform some account transaction
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		// print out the final account balance 
		System.out.println("Customer [" + customer.getLastName() + " , " + customer.getFirstName() + "] has a balance of " + account.getBalance());
		
		System.out.println();
		System.out.println("Retrieving the customer Vishnu Gautam with his checking account with overdraft production");
		customer = bank.getCustomer(2);
		account = customer.getAccount();
		// perform some account transaction
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		// print out the final account balance 
		System.out.println("Customer [" + customer.getLastName() + " , " + customer.getFirstName() + "] has a balance of " + account.getBalance());
		
		System.out.println();
		System.out.println("Retrieving the customer Maria Soley with her joint checking account with husband Tim");
		customer = bank.getCustomer(3);
		account = customer.getAccount();
		// perform some account transaction
		System.out.println("Deposit 150.00: " + account.deposit(150.00));
//		System.out.println("Withdraw 750.50: " + account.withdraw(750.00));
		System.out.println("Withdraw 100.00: " + account.withdraw(100.00));
		// print out the final account balance 
		System.out.println("Customer [" + customer.getLastName() + " , " + customer.getFirstName() + "] has a balance of " + account.getBalance());
	}

}
