import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// HaspMap is a class that implements the Map interface
		Map map = new HashMap();
		map.put("one", "1st");
		map.put("second", new Integer(2));
		map.put("third", "3rd");
		
		// overwrites the previous assignment
		map.put("third", "III");
		
		System.out.println(map);
		
		// the collections wont take primitive types so we have to use wrapper object
		
		// view only keys
		Set keys = map.keySet();
		System.out.println(keys);
		
		// view only values
		Collection collection = map.values();
		// the return type of value method is Collection object
		System.out.println(collection);
		
		Set all = map.entrySet();
		System.out.println(all); 
		
	}

}
