import java.util.Scanner;

public class doWhileloop {

	public static void main(String[] args) {
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		s = sc.nextInt();
		
		do { // this loop will minimum execute one time 
			// even if you give 10 it prints 10 and then goes to the while 
			System.out.println(s);
			s++;
		}  while (s <=5);

	}

}
