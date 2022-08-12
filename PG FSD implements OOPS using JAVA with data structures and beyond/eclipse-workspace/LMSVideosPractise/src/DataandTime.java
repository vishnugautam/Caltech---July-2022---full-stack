import java.util.Date;
import java.util.Calendar;

public class DataandTime {

	public static void main(String[] args) {
		Calendar objCalendar = Calendar.getInstance();
		// Display Date and time components 
		System.out.println("\n Date and Time components");
		System.out.println("Year:" + objCalendar.get(Calendar.YEAR));
		System.out.println("Month:" + objCalendar.get(Calendar.MONTH));
		System.out.println("Date:" + objCalendar.get(Calendar.DATE));
		
		System.out.println("Minute:" + objCalendar.get(Calendar.MINUTE));
		System.out.println("Minute:" + objCalendar.get(Calendar.SECOND));
		
		//Let us add 30 minutes to the current time
		objCalendar.add(Calendar.MINUTE, 30);
		Date objDate = objCalendar.getTime();
		System.out.println(objDate);
		
		
		
	}

}
