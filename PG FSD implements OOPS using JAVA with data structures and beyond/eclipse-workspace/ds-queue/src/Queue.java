
public class Queue {
	int arr[];
	int topOfQueue;
	int beginningOfQueue;
	
	public int peek() {
		if(!isEmpty()) {
			// it returns the beginning of the queue value 
			// what element is present in the begining of the queue
			return arr[beginningOfQueue];
		} else {
			System.out.println("The queue is empty");
			return -1;
		}
	}
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("The Queue is full");
		} else if(isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("It was succefully inserted");
		} else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted " + value + " in the queue");
		}
	}
	// array cannot be modified 
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		} else {
			int result = arr[beginningOfQueue];
			beginningOfQueue++;
			if(beginningOfQueue > topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			return result;
		}
		
	}
	
	public Queue(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("The queue is successfully created with a size of " + size);
	}
	
	public boolean isFull() {
		if(topOfQueue == arr.length-1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean isEmpty() {
		if((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
			return true;
		} else {
			return false;
		}
	}
	
}
