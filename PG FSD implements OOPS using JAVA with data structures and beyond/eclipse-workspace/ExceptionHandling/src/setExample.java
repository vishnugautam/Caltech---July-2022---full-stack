import java.util.*;
public class setExample {

	public static void main(String[] args) {
		// HashSet is a class implementing Set interface 
		// we cannot create an object of set as it is an interface 
		// so we have to use HashSet class to implement the Set interface
		Set set = new HashSet();
	// set is unordered
		// can add anytype
		set.add("one");
		set.add("second");	
		set.add(new Integer(4));
		set.add(new Float(3.14F));
		// duplicates are not allowed
		set.add("second");
		set.add("Second");
		System.out.println(set);
	}

}
