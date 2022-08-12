package demo;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			// int num = 28/0;
			int arr[] = {10,20,30,40,302,34};
			//System.out.println(arr[10]);
			
			String str = null;
			System.out.println(str.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator should not be Zero while dividing numbers...");
			System.out.println("Actual error from Java: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User is trying to access index location outside the array boundary");
			System.out.println("Actual error from Java: " + e);
		}
		catch(NullPointerException e) {
			System.out.println("User is trying to perform operations on null value");
			System.out.println("Actual error from Java: " + e);
		}
		finally {
			System.out.println("This block always executes");
		}
		System.out.println("Exception handling Demo program ends here. ");

	}

}
