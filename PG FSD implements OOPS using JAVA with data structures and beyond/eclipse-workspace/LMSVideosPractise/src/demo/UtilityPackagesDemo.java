 package demo;
 import java.util.*;
 import java.util.function.*;
 import java.util.*;
 
// Consumer can be used in all contexts where an object needs to be consumed,
// i.e. taken as input, and some operation is to be performed on the object without returning any result.
 // class MyConsumer with any type is implementing Consumer interface from util.function package
 class MyConsumer<T> implements Consumer<T>{
	 public void accepts(T cTask) { // accepts method accepts one value and performs the operation on the given argument
		 // this method takes in 1 parameter
		 // this method does not return any value 
		 System.out.println("Working on the number: " + cTask);
		 System.out.println("Adding 5 to the number is "+ ((int) cTask + 5));// type casting converting the cTask to int
	 }
 }

public class UtilityPackagesDemo {

	public static void main(String[] args) {
		ArrayList myList;
		myList = new ArrayList(5);
		
		MyConsumer mycons;
		
		mycons = new MyConsumer();
		
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		System.out.println(myList);
		myList.forEach(mycons);
	}

}
