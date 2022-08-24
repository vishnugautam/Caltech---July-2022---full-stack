import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		// try with resources - no need for a finally block 
//		try( resource (eg:file) declaration ) {
//			//use of the resource - can be a file system, database etc
//			
//		} catch(ExceptionType variable) {
//			//handle the exception 
//		}
		String line;
		// the resource will be closed as soon as the try catch block is executed 
		// A resource is an object that must be closed once your program is done using it. 
		// For example, a File resource or a Socket connection resource.
		try(BufferedReader br = new BufferedReader(new FileReader("FileDoesNotExist.txt")))
		{
//			BufferedReader br = new BufferedReader(new FileReader("FileDoesNotExist.txt"); same as putting the line here 
			// if file is existing read the line 
			while((line = br.readLine()) != null) {
				System.out.println("Line =>" + line);
			}
	} catch (IOException e) {
		System.out.println("IO exception in try block");
	}
		
	}

}
