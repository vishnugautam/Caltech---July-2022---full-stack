// organize our classes
// in 1 package we can have multiple packages 
package simplilearn.domain;

// names given to a class variable or a method is an identifiers 
// keywords such as public, class, private, double 
// keywords are reserved words has a special purpose 
// also predefined words 
// null, true, false are also keywords 

public class Account { // Account is an identifier 
	
/*	double balance; double means decimal value with default access as it is without any modifier
	double is a java keyword - it is a primitive type 
	private double balance; private means only visible in this class - it is private access */
	
	protected double balance; 
	
	public boolean deposit(double amt) {
		balance = balance + amt;
		return true;
	}
	
	public boolean withdraw(double amt) { // access modifiers are public
		boolean result = false;
		if(amt <= balance) {
			balance = balance - amt;
			result = true; // operation was succeded 
		}
		return result;
	}
//	Account(double initBalance){ // 'initBalance' is called parameter 
//		balance = initBalance; 
	
	//constructor - it is a method/function - a special method 
	// 1. name should be same as class name = ClassName
	// 2. this method does not have a return type 
	protected Account(double initialBalance){
		if(initialBalance > 10) {
		balance = initialBalance;
		}
		else {
			System.err.println("Balance should be > than 10"); // to run in red in color
		}
	}
	
	//define a method to retrieve balance value
	public double getBalance(){
		return balance;
	}
		
}

/* - : private
 *   : default
 * # : protected
 * + : public
 */


