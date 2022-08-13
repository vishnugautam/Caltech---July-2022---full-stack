import java.util.StringTokenizer;

public class StringTokenizerex1 {

	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("Java is a programming language", " ");
		// " " space is the seperator - will build string where it will split string based on space 
		while(st1.hasMoreTokens()) { // this is like an array 
			System.out.println(st1.nextToken()); // each token  ie words 
		}
	}
}
