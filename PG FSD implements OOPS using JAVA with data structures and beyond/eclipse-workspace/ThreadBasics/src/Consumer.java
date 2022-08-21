// a consumer is a thread
// producer would remove characters from a stack
public class Consumer implements Runnable{
	private Stack stack;
	
	public Consumer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		char c;
		for(int i = 0; i < 200; i++) {
			c = stack.pop();
			System.out.println("Consumer : " + c);
			try {
			Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
