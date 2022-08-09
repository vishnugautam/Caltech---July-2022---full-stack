package simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
	
	public static void main(String[] args) {
		String s1 = getInput("Enter a numeric value: "); // getting the input using getInput()
		String s2 = getInput("Enter a numeric value: ");
		
		double d1 = Double.parseDouble(s1); // string is transformed to double 
		double d2 = Double.parseDouble(s2);
		
		double result = d1 + d2;
		System.out.println("The answer is " + result);
		
		double resultOfMultiple = addMultipleValues(1,2,3,4,5);
		System.out.println("The answer from multiple values is" + resultOfMultiple);
	}
	
	
	
	private static double addMultipleValues(double... values) { /// ... for dynamic arrays 
		double result = 0;
		for(double d: values) {
		result += d;
	}
		return result;
	}
	
	private static String getInput(String prompt) { 
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));// system.in is keyboard 
		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch(Exception e) {
			return "Error: " + e.getMessage();
		}
}
