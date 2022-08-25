package junittesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SampleAssertion {

	
	@Test
	// the test case 
	public void sampleAssertion() {
		int val1 = 5;
		int val2 = 6;
		
		String str1 = new String("Welcome"); // String literals
		String str2 = new String("Welcome");
		String str3 = null;
		String str4 = "Welcome"; // string literals
		String str5 = "Welcome";
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		assertEquals(str1, str2);
		assertTrue(val1 < val2);
		assertFalse(val1 > val2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4, str5);
		assertNotSame(str1, str3);
		assertArrayEquals(expectedArray, resultArray);
		
	}
	
	public static void main(String[] args) {
		SampleAssertion sa = new SampleAssertion ();
		sa.sampleAssertion();

	}

}
