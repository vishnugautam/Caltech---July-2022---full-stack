import java.util.*;

public class GenericMapEx {

	public static void main(String[] args) {
		// map is like a dictionary so 2 args for <String, String>
		// TreeMap is a class which implements Map interface 
		// TreeMap keys are sorted
		Map<String, String> partList = new TreeMap<>();
		partList.put("S001", "Blue Polo Shirt");
		partList.put("S002", "Black Polo Shirt");
		partList.put("S003", "Duke Hat");
		
		partList.put("S002", "Black T-Shirt");
		Set<String> keys = partList.keySet();
		System.out.println("== Part List ==");
		
		for(String key: keys) {
			System.out.println("Part#:" + key);
			System.out.println("Value: " + " " + partList.get(key));
		}

	}

}
