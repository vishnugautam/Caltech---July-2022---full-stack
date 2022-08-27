
public class TestStackClass {

	public static void main(String[] args) {
		 Stack theStack = new  Stack(3);
		 
		 System.out.println("Empty: " + theStack.isEmpty());
		 
		 theStack.push(1);
		 theStack.push(2);
		 theStack.push(3);
//		 theStack.push(4); // the stack is full! the size is 3
		 
		 System.out.println("Popped element: " + theStack.pop());
		 

	}

}
