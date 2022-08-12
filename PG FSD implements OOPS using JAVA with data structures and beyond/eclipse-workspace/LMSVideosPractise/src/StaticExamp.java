
public class StaticExamp {
	private double temp;
	public static double maxT = 0; // static means it maintains only one copy for the class
	
	public StaticExamp(double t) {
		temp = t;
		
		if(t > maxT) {
			maxT = t;
		}
	}

	public static void main(String[] args) {
		// maxT maintains the same copy for all the object instances
		StaticExamp t1 = new StaticExamp(55);
		StaticExamp t2 = new StaticExamp(100);
		StaticExamp t3 = new StaticExamp(85);
		
		System.out.println("Max temp: " + StaticExamp.maxT);

	}

}
