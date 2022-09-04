package junittesting;

// all to verify if your code is giving desirable exception or not 

public class TestMessage {
	
	public static void print() {
		System.out.println("Inside message");
		int a = 0;
		int b = 1/a;
		System.out.println("Divident value = " + b);
	}
}
