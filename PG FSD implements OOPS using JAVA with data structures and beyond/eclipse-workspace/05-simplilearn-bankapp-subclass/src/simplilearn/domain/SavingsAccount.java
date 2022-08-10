package simplilearn.domain;

// Account is a super class 
// SavingsAccount is a subclass of Account class which becomes (super class)
public class SavingsAccount extends Account{
	
	
	
	//additional property
	private double interestRate; // instance variable 
	
	// constructor from parent class is not inherited 
	// so we have to write a constructor for ourselves 
	public SavingsAccount(double initBalance, double interestRate) {
		// invoke a super class which is account in the  constructor 
		super(initBalance); // it is trying to invoke constructor in the super/parent class 
		// this keyword is solving name ambiguity 
		// since the instance variable's name and the parameter in the constructor is the same, we use this keyword
		this.interestRate = interestRate; // instance variable is assigned to a parameter 
	}
}
