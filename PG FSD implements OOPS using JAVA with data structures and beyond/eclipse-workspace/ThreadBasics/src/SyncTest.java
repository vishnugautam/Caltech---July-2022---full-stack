// producer will push an item to the stack
// consumer removes the item 
public class SyncTest {

	public static void main(String[] args) {
		// shared objects between threads 
		// create an instance of the Stack() class
		Stack theStack = new Stack();
		
		// putting theStack instance in the producer thread
		// producer will add characters in theStack instance 
		Producer producer = new Producer(theStack);
		// Thread class implements Thread interface, and makes producer a Thread 
		Thread producerThread = new Thread(producer);
		// start() triggers the run() method in the producer
		producerThread.start();
		
		// putting theStack instance in the consumer thread 
		Consumer consumer = new Consumer(theStack);
		// Thread class implements Thread interface, and makes consumer a Thread 
		Thread consumerThread = new Thread(consumer);
		// start() triggers the run() method in the producer
		consumerThread.start();

	}

}
