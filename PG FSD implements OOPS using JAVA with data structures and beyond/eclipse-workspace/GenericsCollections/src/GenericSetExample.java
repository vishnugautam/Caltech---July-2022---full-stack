import java.util.*;
public class GenericSetExample {
	public static void main(String[] args) {
		 // hashset is a class so we use () to call the constructor
		// <String> specifies the type, its called diamond operator 
		// specifying the type to the collection is called Generics
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("second");
		set.add("3rd");
//		set.add(new Integer(4)); // compiler error as generics is a homogenous collection 
		set.add("second"); // duplicates are not permitted and it is unordered
		System.out.println(set);
	}
}
