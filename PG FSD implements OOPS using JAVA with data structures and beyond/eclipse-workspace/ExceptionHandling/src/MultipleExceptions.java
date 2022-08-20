
public class MultipleExceptions {

	public static void main(String[] args) {
		// before Java 7
//		try {
//			int[] numbers = new int[10];
//			
//			numbers[10] = 100/0;
//			numbers[-1] = 20;
//		// catch block to handle the arithmetic exception 
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
		
		// after Java 7
		try {
			int[] numbers = new int[10];
			numbers[-1] = 100;
			numbers[10] = 100/0;
			// one catch block for 2 exceptions 
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
