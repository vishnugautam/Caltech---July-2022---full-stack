
public class ThreadSample1 extends Thread {
	public void run() { // we have overridden the thread class 
		System.out.println("Thread is activated");
	}
	public static void main(String[] args) {
		ThreadSample1 ts1 = new ThreadSample1();
		ts1.start(); // this start will invoke your thread and run() will trigger 
	}
}
// after extending Thread class we cannot anyother class as Java doesnt support multiple inheritance
// basic functions using inbuild method like yield(), interrput(), etc are directly available 
// object shareing is not possible 