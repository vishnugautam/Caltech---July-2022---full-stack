package demo;

import java.util.Scanner;

public class basicJavaProgramV2 {

	public static void main(String[] args) {
//		int num1 = 10, num2 = 20; // in program itself we gave input values - hard coding 
		int num1, num2;
		Scanner sc = new Scanner(System.in); // Scanner is a java package that will help you to read input from the console 
		// we are telling the Scanner to read the stream (Sytem.in) which is nothing but the keyboard
		
		System.out.println("Enter first number"); // System.out is an output stream 
		num1 = sc.nextInt(); // to read integers 
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		System.out.println("Arithmetic operations on the two numbers are: ");
		System.out.println("Sum of two numbers: " + (num1+num2));
		System.out.println("Subtraction of two numbers: " + (num1-num2));
		System.out.println("Multiplication of two numbers: " + (num1*num2));
		System.out.println("Division of two numbers: " + (num1 / num2));
		System.out.println("Modular of two numbers: " + (num1%num2));

	}

}
