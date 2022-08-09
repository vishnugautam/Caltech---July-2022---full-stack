package simplilearn.examples;

public class methodOverloading {

	public static void main(String[] args) {
		
		addValue(10,20);
		addValue(10,20,30);
		addValue("Hello", "World");

	}
/* a static method can call another static method without the use of the class name
	else you have to create a new object like addValue addValue = new addValue()*/
	private static void addValue( int x, int y) {
		int sum = x + y;
		System.out.println("Sum - " + sum);
	}
	
	private static void addValue( int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("Sum - " + sum);
	}
	
	private static void addValue( String x, String y) {
		String concat = x + y;
		System.out.println("concat - " + concat);
	}
}
