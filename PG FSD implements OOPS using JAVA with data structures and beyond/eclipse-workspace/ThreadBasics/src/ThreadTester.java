
public class ThreadTester {
	// thread is a virtual CPU
	// thread is a small process runs in our application parallely 
	// tiny function among many functions 
	// when we create a thread - CPU + CODE + Data
	// main method is itself a thread, parent thread
	// browser is a multi-thread platform 
	// all browser based application are thread based application 
	public static void main(String[] args) {
		HelloRunner target = new HelloRunner();
		
		// create an object of thread
		Thread t = new Thread(target);
		// start automatically calls the run method
		t.start();

	}

}
