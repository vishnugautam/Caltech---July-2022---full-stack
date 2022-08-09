package simplilearn.examples;

public class Loops {

	static private String[] months = 
		{"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};
	public static void main(String[] args) {
		for( int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
		
		for(String month: months) { // for (each element : present in array/collection)
			System.out.println(month);
		}
		
		int i = 0;
		while(i < months.length) {
			System.out.println(months[i]);
			i++;
		}
		
		int x = 0;
		do {
			System.out.println(months[x]); // at least executes 1 time
			x++;
		} while(x < months.length); // this is my test expression 
	}
}
