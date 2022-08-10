package simplilearn.domain;

// sub class
public class CheckingAccount extends Account{

	private double overDraftAmount;
	// it does not inherit the constructor
	//so define a constructor
	public CheckingAccount(double initBalance, double OverDraftAmount) {
		super(initBalance); // invoke parent class constructor 
		this.overDraftAmount = OverDraftAmount;
	}
	
	// more than 1 constructor in a class it is called constructor overloading
	// constructor #2
	// we can have only 1 parameter, so  the overdraft becomes 0.0
	public CheckingAccount(double initBalance) {
		this(initBalance, 0.0); // invoke a constructor present in same class
	}
	
	@Override
	public boolean withdraw(double amt) {
		boolean result = true;
		
		if(balance < amt) {
			double overDraftNeeded = amt - balance;
			if(overDraftAmount < overDraftNeeded) {
				result = false;
			} else {
				balance = 0.0;
				overDraftAmount -= overDraftNeeded;
			}
		} else {
			balance -= amt;
		}
		return result;
	}
}
