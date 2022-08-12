package demo;

import java.util.Scanner;
public class quizProgram2 {

	public static void main(String[] args) {
		// Declaring variables here 
		int n;
		
		// Created a scanner object 
		Scanner sc = new Scanner(System.in);
		
		while (true){
		// Displaying set of quiz options
		System.out.println("Who is the founder of Blue Origin:");
		System.out.println("1. Bill Gates, 2. Tim Cook, 3. Sathya Nadalla, 4. Jeff Bezos, 5. Exit program");
		
		
		
		// Read input from user
		System.out.println("Enter choice: 1, 2, 3, 4, 5(to terminate)");
		n = sc.nextInt();
		
		
		
		// validating user choice 
		if(n == 4) {
			System.out.println("Congratulations, you have guessed the correct answer");
			break;
		} 
		else if (n == 5) {
			break;
		}
		else {
			System.out.println("Wrong choice please try again");
		}
		}		
	}
}