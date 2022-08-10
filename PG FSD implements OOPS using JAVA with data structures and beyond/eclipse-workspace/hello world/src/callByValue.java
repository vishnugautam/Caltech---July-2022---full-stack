
public class callByValue {
	int v = 500;
	void change(int v) {
		v = v + 100;
	}
	public static void main(String[] args) {
		callByValue o = new callByValue();
		System.out.println("Before making change " + o.v);
		o.change(500);
		System.out.println("After making change " + o.v); // call by value never affects the actual value of v which is 500
	}

}
