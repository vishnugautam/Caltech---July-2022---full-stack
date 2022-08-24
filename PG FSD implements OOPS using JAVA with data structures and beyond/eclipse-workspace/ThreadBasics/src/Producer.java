// a producer is a thread
// producer would produce characters and store it in the stack
// Runnable is another way of implementing Thread through interface 
// producer runs and consumer also runs parallelly, which means 2 different threads run parallely 
public class Producer implements Runnable{
	private Stack stack;
	
	// constructor to instantiate stack 
	public Producer(Stack stack) {
		this.stack = stack;
	}
	
	// run() method is a method in Thread class which runs when start() method is initiated
	@Override
	public void run() {
		char c;
		for(int i = 0; i < 200; i++) {
			c = (char) (Math.random()* 26 + 'A'); // c as casting (char) 
			stack.push(c); // push method from Stack class
			System.out.println("Producer : " + c);
			try {
			Thread.sleep((int) (Math.random() * 300)); // making the thread sleep for random time 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
