package simplilearn.examples;

public class Conditions {
	public static void main(String[] args) {
		int monthNumber = 8;
		
		if(monthNumber > 1 && monthNumber <= 3) {
			System.out.println("Your are in quater 1");
		} else if (monthNumber >= 4 && monthNumber <=6) {
			System.out.println("Your are in quater 2");
		}else {
			System.out.println("You are not in first half of the year");
		}
		
	}
}
