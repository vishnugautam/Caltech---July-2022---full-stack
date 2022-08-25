package junittesting;
import org.junit.Test;

public class SuiteTest1 {

		int a = 10, b = 10, c;
		@Test
		public void Addition() {
			c = a + b;
			System.out.println("Addition value: " + c);
		}
}
