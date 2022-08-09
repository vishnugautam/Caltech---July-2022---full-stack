package simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchWithInts {

	public static void main(String[] args) {
		String input = getInput("Enter a number between 1 and 12: ");
		
		int month = Integer.parseInt(input);
		
		switch (month) {
		case 1:
			System.out.println("This month is January");
			break;
		case 2:
			System.out.println("This month is February");
			break;
		case 3:
			System.out.println("This month is March");
			break;
			
		default:
			System.out.println("You chose another month");
			break;
		}
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

}
