
public class varArgs {
	static void display(String...values) { // can pass any number of arguments 
		System.out.println("Display method has been invoked");
	}
	public static void main(String[] args) {
		display();
		display("Hi", "Hello", "How", "are", "you");
	}

}
// System.out.println() is built using variable arguments 