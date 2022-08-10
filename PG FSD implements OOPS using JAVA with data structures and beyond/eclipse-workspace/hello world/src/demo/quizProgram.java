package demo;

import java.util.Scanner;
public class quizProgram {

	public static void main(String[] args) {
		// Declaring variables here 
		int n;
		
		// Displaying set of quiz options
		System.out.println("Who is the founder of Blue Origin:");
		System.out.println("1. Bill Gates, 2. Tim Cook, 3. Sathya Nadalla, 4. Jeff Bezos");
		
		// Created a scanner object 
		Scanner sc = new Scanner(System.in);
		
		// Read input from user
		System.out.println("Enter choice of 1 to 4");
		n = sc.nextInt();
		
		
		
		// validating user choice 
		if(n == 4) {
			System.out.println("Congratulations, you have guessed the correct answer");
			
		} else {
			System.out.println("Wrong choice please try again");
		}
		
	}

}
