package simplilearn.examples;

public class SwitchWithEnums {

	public static void main(String[] args) {
//		System.out.println(Month.JANUARY);
		Month month = Month.FEBRUARY;
		
		switch(month) {
		case JANUARY:
			System.out.println("Its the first month");
			break;
		case FEBRUARY:
			System.out.println("Its the second month");
			break;
		case MARCH:
			System.out.println("Its the third month");
			break;
			// default is not required as enum is finite 
		
		}
	}
}
