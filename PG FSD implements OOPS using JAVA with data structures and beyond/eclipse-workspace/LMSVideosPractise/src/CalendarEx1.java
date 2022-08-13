import java.util.*;
import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar calins = Calendar.getInstance();
		// we cannot directly create an instance as it is an abstract class so we have to class this method 
		// which gives an object of the Calendar class
		System.out.println("The current date = " + calins.getTime());
		calins.add(Calendar.DATE, -15); // 15 days ago from the DATE 
		System.out.println("15 days ago = " + calins.getTime());
	}

}
