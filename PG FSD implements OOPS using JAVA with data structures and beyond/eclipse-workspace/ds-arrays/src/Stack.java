// creating stack from the scratch 
// creating our own stack 
// Stack algorithm 
public class Stack {
	int[] arr;
	int topStack;
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("the stack is empty!");
			return -1;
		} else {
			int topOfStack = arr[topStack];
			topOfStack--;
			return topOfStack;
		}
	}
	
	public Stack(int size) {
		this.arr = new int[size];
		this.topStack = -1; // stack is empty
		System.out.println("The stack is created with a size of " + size);
	}
	
	public boolean isEmpty() {
		if(topStack == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean isFull() {
		if(topStack == arr.length -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("The stack is full!");
		} else {
			arr[topStack + 1] = value;
			topStack++;
			System.out.println("the value is successfully inserted!");
		}
	}
}
