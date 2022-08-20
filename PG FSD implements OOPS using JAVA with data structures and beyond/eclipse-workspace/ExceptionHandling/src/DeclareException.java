import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DeclareException {
	// declare rule where findFile() method throws an IOException which is handled in the main block
	// this method declared in the main block must be put in try and catch to handle it
	public static void findFile() throws IOException {
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
	}
	public static void main(String[] args) {
		// handle rule
		try {
		findFile();

	} catch(IOException e) {
		e.printStackTrace(); // detailed exception
		System.out.println(e.getMessage());
}
