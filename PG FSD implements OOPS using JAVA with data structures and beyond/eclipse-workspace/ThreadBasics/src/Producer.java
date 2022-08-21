// a producer is a thread
// producer would produce characters and store it in a stack
public class Producer implements Runnable{
	private Stack stack;
	
	public Producer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		char c;
		for(int i = 0; i < 200; i++) {
			c = (char) (Math.random()* 26 + 'A');
			stack.push(c);
			System.out.println("Producer : " + c);
			try {
			Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
