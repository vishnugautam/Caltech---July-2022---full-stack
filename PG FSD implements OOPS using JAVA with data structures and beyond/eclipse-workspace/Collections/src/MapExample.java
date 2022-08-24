import java.util.*;


// a map is like a dictionary in python, key and value 
public class MapExample {

	public static void main(String[] args) {
		// HaspMap is a class that implements the Map interface
		// maps are not ordered 
		Map map = new HashMap();
		map.put("one", "1st");
		map.put("second", new Integer(2));
		map.put("third", "3rd");
		
		// overwrites the previous assignment
		map.put("third", "III");
		
		System.out.println(map);
		
		// the collections wont take primitive types so we have to use wrapper object
		// primitive datatypes are - int, byte, short, long, float, double, boolean and char.
		// non primitives such as String, Arrays, Classes, Interfaces
		// keySet() method is used to view only keys, which returns a Set 
		Set keys = map.keySet();
		System.out.println(keys);
		
		// values() is used to view only values
		Collection collection = map.values();
		// the return type of value method is Collection object
		System.out.println(collection);
		
		// entrySet() is used to show both key and value 
		Set all = map.entrySet();
		System.out.println(all); 
		
	}

}
