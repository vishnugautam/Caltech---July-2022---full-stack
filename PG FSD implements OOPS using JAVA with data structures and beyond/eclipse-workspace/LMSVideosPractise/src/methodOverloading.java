
public class methodOverloading {
	static int add(int x, int y) {
		return x + y;
	}
	
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	
	static double add(double x, double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10.25,20.6));
	}

}
