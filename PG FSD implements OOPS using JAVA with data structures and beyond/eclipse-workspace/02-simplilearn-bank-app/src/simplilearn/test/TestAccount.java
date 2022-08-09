package simplilearn.test;
import simplilearn.domain.Account; // import statement tells that where to find the class 

// create a separate class for the main method is the best practice
// every java class if it wants to execute in a console it requires a main method

public class TestAccount {

	public static void main(String[] args) {
		
		// create an object of Account class(2 steps)
		
		// 1. declaration - a class is declared followed by variable name
		Account acct; 
		
		// 2. initialization - variable is assigned to new className/constructor and constructor would be same name as the class name
		acct = new Account(55.98); // invoke a constructor/another class we need to use new keyword, to create an object 		
		
//		acct.balance = 10.5;
//		System.out.println(acct.balance);
		
		acct.deposit(27.8);
		acct.withdraw(20.10);
		System.out.println(acct.getBalance());
	}

}
