package demo;
import java.util.Stack;
import java.util.Scanner;
public class StackDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>(); // the elements in the stack will be on type string
		
		//Adding elements in stack
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");
		
		System.out.println("Initial Stack");
		System.out.println(stack);
		
		System.out.println("Enter a string to check?"); 
		String usr_string = sc.next(); // read the value that user types in the keyboard
		
		System.out.println(stack.search(usr_string)); // search returns the elements position but when the element is not
		// there it returns -1
		// checking if element exists in stack 
		if(stack.search(usr_string) != -1) {
			System.out.println("Given String " + usr_string + " exists in stack.");
		}
		else {
			System.out.println("Given string " + usr_string + " does not exist in stack.");
		}
		
		System.out.println("Getting top element from the stack: " + stack.peek()); // to get top elements from stack
		
		// removing elements from stacks
		stack.pop();
		stack.pop();
		System.out.println("Stack after poping two elements");
		System.out.println(stack);
		
		// popping elements from stack until there are no elements
		while(! stack.empty()) {
			stack.pop();
			System.out.println("Stack after poping one element: " + stack);
		}				
		System.out.println(stack);
	}
}
