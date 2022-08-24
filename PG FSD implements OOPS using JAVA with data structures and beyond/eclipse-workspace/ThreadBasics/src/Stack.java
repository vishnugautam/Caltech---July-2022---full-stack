import java.util.ArrayList;
import java.util.List;
public class Stack {
	// <Character> only characters are allowed and ArrayList class implements List interface 
	// buffer is holding the data
	private List<Character> buffer = new ArrayList<Character>();
	// synchronized keyword allows only one thread can access the particular stack
	// pop() removes one item from the stack 
	public synchronized char pop() {
		char c;
		// thread to wait till the stack has an item
		// buffer.size is 0 then wait till an item is added
		while(buffer.size() == 0) {
			try {
				// wait() method would place in pool
				this.wait();
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		// after an item is added it is removed using below line
		// remove the last element present in the stack 
		c = buffer.remove(buffer.size() - 1);
		return c;
	}
	
	public synchronized void push(char c) {
		// brings thread from wait pool to lock pool which means it executes the c variable 
		this.notify();
		// this method is used to add element in the buffer List 
		buffer.add(c);
	}
}
