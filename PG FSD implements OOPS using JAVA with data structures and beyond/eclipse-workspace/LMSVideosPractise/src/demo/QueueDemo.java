package demo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>(); // each time i am going to add string
		
		queue.add("Person1");
		queue.add("Person2");
		queue.add("Person3");
		queue.add("Person4");
		queue.add("Person5");
		
		System.out.println("Elements in the queue are: " + queue); 
		
		System.out.println("Head of the element in the queue is: " + queue.element());// first one added will be the first one to come out
		//return null if queue is empty
		System.out.println("Head of the element in the queue is: " + queue.peek());// first one added will be the first one to come out but
		// it returns null if the queue is empty
		
		//inserting an element in queue
		queue.offer("Person6");
		
		// return null if queue is empty 
		queue.poll(); // first element will be removed 
		System.out.println("Queue after removing an element is: " + queue);
		
		queue.remove(); // first element will be removed 
		System.out.println("Queue after removing an element is: " + queue);
		
		// iterating through elements from queue
		Iterator itr = queue.iterator(); // using which we can iterate each element
		while(itr.hasNext()) { // if there are any elements
			System.out.println(itr.next()); // it will fetch one element at a time
		}
	}

}
