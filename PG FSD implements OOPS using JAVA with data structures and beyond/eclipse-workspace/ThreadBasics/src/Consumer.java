// a consumer is a thread
// consumer would remove characters from a stack
// producer runs and consumer also runs parallelly, which means 2 different threads run parallely 
public class Consumer implements Runnable{
	private Stack stack;
	
	public Consumer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	// run() method is a method in Thread class which runs when start() method is initiated
	public void run() {
		char c;
		for(int i = 0; i < 200; i++) {
			c = stack.pop();
			System.out.println("Consumer : " + c);
			try {
			Thread.sleep((int) (Math.random() * 300)); // making the thread sleep for random time 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
