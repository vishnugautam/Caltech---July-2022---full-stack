import java.util.ArrayList;
import java.util.List;
public class Stack {
	// only characters are allowed
	// buffer is holding the data
	private List<Character> buffer = new ArrayList<Character>();
	// synchronized keyword allows only one thread can access the particular stack
	public synchronized char pop() {
		char c;
		// thread to wait till the stack has an item
		while(buffer.size() == 0) {
			try {
				// wait() method would place in pool
				this.wait();
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		// remove the last element present in the stack 
		c = buffer.remove(buffer.size() - 1);
		return c;
	}
	
	public synchronized void push(char c) {
		// brings thread from wait pool to lock pool 
		this.notify();
		buffer.add(c);
	}
}
