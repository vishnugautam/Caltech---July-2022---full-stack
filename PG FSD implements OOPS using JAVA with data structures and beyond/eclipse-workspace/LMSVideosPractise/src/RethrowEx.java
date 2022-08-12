
// exception propogation - where exception travels from one place to another 
public class RethrowEx {
	public static void first() throws Exception { // throws is throwing exception intentionally
		System.out.println("The exception in first() method"); // 3. this is printed 
		throw new Exception("thrown from first() method"); // 4. further throws an exception
		// since this first() does not have try catch block, it will give to the caller which is try in second()
	}
	
	int a = 5;
	a++;
	final int b = 6; // the b cannot be changed, not allowed to modify
//	b++;  throws an error 
	// when we use final on a class we cannot extend it
	// when we use final on a method we cannot override it
	// 1. Stop value changing, 2. Stop method overriding, 3. Stop inheritance 
	
	
	public static void second() throws Throwable {
		try {
			first(); // 2. first() is called by the try in main 
		}
		catch(Exception e) {
			System.out.println("Inside second method"); // 5. this line is printed 
			throw e; // 6. it throws another error which goes to the main try catch block
		}
	}
	public static void main(String[] args) throws Throwable {
		try {
			second(); // 1. second() is called by main so asks it do you have a catch block?
		}
		catch(Exception e) {
			System.out.println("This is caught in main"); // 7. this line is printed
		}
	}

}
