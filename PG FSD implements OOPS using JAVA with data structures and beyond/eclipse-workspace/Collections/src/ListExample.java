import java.util.*;
public class ListExample {

	public static void main(String[] args) {
//		Arraylist is a class implementing the list interface
		// list is ordered 
		List list = new ArrayList();
		list.add("one");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		// duplicate is allowed 
		list.add("second");
		list.add("second");
		list.add(new Integer(4));
		System.out.println(list);
		

	}

}
