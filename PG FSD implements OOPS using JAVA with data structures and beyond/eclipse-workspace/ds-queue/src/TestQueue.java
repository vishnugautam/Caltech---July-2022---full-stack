

public class TestQueue {

	public static void main(String[] args) {
		Queue q = new Queue(2);
		// array cannot be modified 
		// in array we need to dequeue all the elements
		// list has the capability of growing and shrinking
		q.enQueue(1);
		q.enQueue(2);
		
		q.enQueue(3);
		System.out.println(q.deQueue());
		
		q.enQueue(4);
		
		System.out.println(q.peek());
	}

}
