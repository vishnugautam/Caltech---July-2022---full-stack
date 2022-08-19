package demo;

public class ConstructEx {
	int number;
	String name;
	public static void main(String[] args) {
		
		int number1;
		String name2;
		number1 = 10;
		name2 = "Vishnu";
		
		ConstructEx cx = new ConstructEx();
		System.out.println(cx.number + cx.name);
		
		System.out.println(number1 + name2);

	}

}
