import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamEx { // this class name and the import class name must not be the same other wise it throws error
//	Your own class is named Scanner and you are importing another class named Scanner. 
//	This means the compiler does not know which Scanner class you mean when you create a variable of type Scanner.
	public static void main(String[] args) {
		try {
			
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\Vishnu\\Desktop\\Post graduation in full stack web development\\Caltech---July-2022---full-stack\\PG FSD implements OOPS using JAVA with data structures and beyond\\eclipse-workspace\\LMSVideosPractise\\testfile1.txt");
			String s1 = "Welcome to learn IO stream";
			byte b1[] = s1.getBytes();
			f1.write(b1);
			f1.close(); // we are closing the connection with the os after writing the file 
			System.out.println("Completed");
		} catch (Exception er) {
			System.out.println(er);
		}
	}
}
