import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in); // system input stream the default one is keyboard
		System.out.println("Enter the no of values");
		i = sc.nextInt();
		
		while (i<=5) {
			System.out.println(i);
			i++;
		}

	}

}
