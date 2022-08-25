package junittesting;
import org.junit.Test;

public class SuiteTest2 {

	int a=10, b=10, c;
	
	@Test
	public void Multiplication() {
		c = a* b;
		System.out.println("Multiplication value = " + c);
	}
	
}

