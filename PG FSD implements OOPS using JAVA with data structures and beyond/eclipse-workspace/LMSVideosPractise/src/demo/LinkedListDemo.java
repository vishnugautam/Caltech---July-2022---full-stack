package demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>(); // we are String as a datatype 
		
		// adding elements in linked list 
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		li.add("five");
		li.add("four");
		li.add("seven");
		li.add("eight");
		li.add("four");
		li.add("ten");
		
		System.out.println("\n Elements in the linked list: " + li);
		
		Iterator it = li.iterator();
		
		// printing elements from linked list
		System.out.println("\n Printing each element from linked list");
		
		while(it.hasNext()) { // until there are elements in the Linked Lists
			System.out.println(it.next()); // print each element from the linked list
		}
		
		// printing elements in reverse order
		System.out.println("\n Printing elements in reverse order");
		it = li.descendingIterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// remove first element from the linked list
		System.out.println("\n elements in linked list: " + li);
		li.removeFirst();
		System.out.println("after removing first element" + li);
		
		// remove last element from the linked list
		System.out.println("\n elements in linked list: " + li);
		li.removeLast();
		System.out.println("after removing last element" + li);
		
		// remove first occurance from the linked list
		System.out.println("\n elements in linked list: " + li);
		li.removeFirstOccurrence("four"); // the first occurance of four will be removed 
		System.out.println("after removing first occurance in linked list: " + li);
		
		// remove last occurance from the linked list
		System.out.println("\n elements in linked list: " + li);
		li.removeLastOccurrence("three"); // the last occurance of three will be removed
		// if we have 3 three's then from the last 
		System.out.println("after removing last occurance: " + li);
		
		// clearing the linked list
		li.clear();
		System.out.println("\n elements in linked list: " + li);
	}
}
