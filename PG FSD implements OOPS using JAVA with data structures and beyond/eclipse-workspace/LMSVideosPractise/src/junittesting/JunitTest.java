// this program is just for integratting two programs
package junittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	SuiteTest1.class,
	SuiteTest2.class,
})
public class JunitTest {

}
