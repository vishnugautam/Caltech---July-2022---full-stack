package junittesting;
import org.junit.Test;

public class Test1 {
	
	
	@Test (expected = ArithmeticException.class)
	
	public void testPrint() {
		System.out.println("Inside testPrintMessage");
		TestMessage.print();
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		
		test1.testPrint();
		

	}

}
