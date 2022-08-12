
public class ThreadSample2 implements Runnable{
	public void run() { // we are overriding the Runnable class using run 
		System.out.println("Thread is activated");
	}
	public static void main(String[] args) {
		ThreadSample2 ts2 = new ThreadSample2();
		Thread th1 = new Thread(ts2); // we are passing ts2 inside the Thread object to start and run the thread 
		th1.start(); // this line invokes the run() 
	}
// this approach helps us extend other base classes 
// inbuilt methods are not available directly 
// objects can be shared among multiple threads 
}
