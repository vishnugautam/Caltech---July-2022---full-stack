
public class AddArguments {

	public static void main(String[] args) {
		int sum = 0;
		// accepts arguments from the command line 
		for (String arg: args) {
			// convert string 'arg' to int and add to sum
			// parseInt converts String into int 
			sum += Integer.parseInt(arg);
		}
		System.out.println("Sum = " + sum);
	}
}
