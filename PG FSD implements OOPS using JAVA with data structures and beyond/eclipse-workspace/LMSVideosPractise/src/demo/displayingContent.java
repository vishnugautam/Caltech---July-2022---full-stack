package demo;
import java.util.Scanner;
public class displayingContent {

	public static void main(String[] args) {
		// factorial of a number 
		
		// Declaring all the variables here 
		int n;
		int fact_var = 1;// 1, 2, 6, 24, 120
		
		// Creating Scanner object here
		Scanner sc = new Scanner(System.in);
		
		// Reading input from the user
		System.out.println("Enter a number");
		n = sc.nextInt(); 
		
		// Calculating factorial 
//		for(int i = 1; i <= n; i++) { // for loop provides everything in 1 line so it is easier to identify 
//			fact_var = fact_var * i;
//		}
		
		int i = 1;
		while(i<=n) {
			fact_var *= i;
			i++;
		}
		System.out.println("Factorial of a number is:" + fact_var);
		

	}

}
