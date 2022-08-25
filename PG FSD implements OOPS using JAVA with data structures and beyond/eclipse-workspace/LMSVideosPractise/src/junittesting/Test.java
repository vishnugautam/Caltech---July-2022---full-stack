// triggered all the program from this class where main program is written
package junittesting;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test {
	public static void main(String[] args) {
		
		// run all the classes from the JunitTest.class
		Result r = JUnitCore.runClasses(JunitTest.class);
		
		// are there any failures?
		for(Failure f: r.getFailures()) {
			System.out.println(f.toString());
		}
		// if no failures
		System.out.println(r.wasSuccessful());
	}

}
