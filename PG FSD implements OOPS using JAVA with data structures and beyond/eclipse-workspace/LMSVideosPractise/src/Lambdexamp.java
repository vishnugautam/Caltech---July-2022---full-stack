
public class Lambdexamp {
	public static void main(String[] args) {
		// from the interface Display object we take the show method and in the place of int a we put int b and 
		// return the same b. 
		Display display = (int b) -> b; // this is a lambda expression, which just shows the a value 
		// which is the show method in the interface 
		System.out.println("Returns value from lambda expression = " + display.show(100));
		
		// lambda expression with multiple line and return statement
		// the lambda expression replaces the int a in the Display interface show method 
		Display statement = (int a) -> {
			return a;
		};
		System.out.println("Returns value from lambda expression = " + display.show(5));
		
	}

}
