// producer will push an item to the stack
// consumer removes the item 
public class SyncTest {

	public static void main(String[] args) {
		// shared objects between threads
		Stack theStack = new Stack();
		
		Producer producer = new Producer(theStack);
		
		Thread producerThread = new Thread(producer);
		producerThread.start();
		
		Consumer consumer = new Consumer(theStack);
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();

	}

}
