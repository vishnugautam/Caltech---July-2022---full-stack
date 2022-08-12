package demo;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilityPackageDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any sentence: ");
		
		String userString = sc.nextLine();
		// string is a set of words and each are seperated by space, until you press enter key the string is counted 
		
		// StringTokenizer library helps to break a string into tokens - tokens are nothing but words
		StringTokenizer st = new StringTokenizer(userString," "); // words seperated by empty space
		
		System.out.println(st);
		
		System.out.println("\n Vowel count for each word in given string are: ");
		
		while(st.hasMoreTokens()) { // till it has more tokens which means more words in a basket
			String word = st.nextToken(); 
			// each word is taken from st and the token count reduces in has MoreTokens()
			// here each word is added to the word variable and until all the tokens are done keep reading
			// its like words in a basket and each time it will give one word and when no word is left it will say false 
			System.out.println("Processing word: " + word);
			
			int vowelCount = 0;
			
			for(char c: word.toCharArray()) { // it will take the word and each location is one character 
				// for example this - t h i s - for each character in word 
				c = Character.toLowerCase(c); // convert each character to LowerCase
				
				if(c=='a' || c== 'e' || c== 'i' || c== 'o' || c== 'u') {
					vowelCount++;
				}
			}
			System.out.println("The word " + word + " has " + vowelCount + " vowels ");
		}
		

	}

}
