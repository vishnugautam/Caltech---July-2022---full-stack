package simplilearn.domain;

public class Customer {
	
	/* declare three private instance variables
	 firstName, lastName, account */
	private String firstName;
	private String lastName;
	private Account account; // customer has an account
	
	// declare a public constructor that takes 2 parameters - (firstName and lastName)
	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
	}
	
	/* declare 2 public accessors for the object instance variables
	 accessors are getter method */
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;  
	}
	
	public Account getAccount() {
		return account;
	}
	
	// polymorphic argument 
	public void setAccount(Account acct) { 
		account = acct; 
		// java always has implicit return statement 
	}
}
