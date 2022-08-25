package junittesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JunitannotationSample {
	int x = 5, y = 10, z;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all the classes");
	}
	// before the @Test i want this to be executed
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test cases");
	}
	
	// one test method - they are the actual test cases 
	@Test
	public void Addition() {
		z = x+y;
		// ix x + y = 15
		assertEquals(15,z);
		System.out.println("Addition value = " + z);
	}
	
	// one test method - they are the actual test cases 
	@Test
	public void Multiplication() {
		z = x*y;
		assertEquals(50,z);
		System.out.println("Multiplication value = " + z);
	}
	
	// dont execute this
	@Ignore
	public void IgnoreMessage() {
		String info = "JUnit Annotations";
		assertEquals(info, "JUnit Annotations");
		System.out.println("This is @Ignore annotation");
	}
	
	// after every test case you want to execute some code 
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test cases");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all the classes");
	}
	
	public static void main(String[] args) {
		JunitannotationSample jut = new JunitannotationSample();
		
		jut.Addition();
		jut.Multiplication();
	}
}
