public class firstProgram {
	static int v = 100; // this can be accessed by any function/method in the class
	// like - firstProgram.v and access it 
	void method() {
		int no = 90;
	}
	public enum colorsOfRainbow {Violet, Blue, Green, Black, Pink, Orange, Gray}
	public static void main(String[] args) // main is a standard function by java 
	{
		int v1 = 10, v2 = 20;
		System.out.print("Hello!");
		System.out.print("Java");
		System.out.print(v1);
		final int con = 10;
		for (colorsOfRainbow m: colorsOfRainbow.values())
			System.out.print(m);
		System.out.print(++v2);
		
		int m = 200;
		int n = 100;
		int min;
		min = (m<n) ? m : n;
		System.out.print(min);
		
	}
}
