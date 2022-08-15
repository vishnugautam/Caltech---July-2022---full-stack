import java.io.FileInputStream;
public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("C:\\\\Users\\\\Vishnu\\\\Desktop\\\\Post graduation in full stack web development\\\\Caltech---July-2022---full-stack\\\\PG FSD implements OOPS using JAVA with data structures and beyond\\\\eclipse-workspace\\\\LMSVideosPractise\\\\testfile1.txt");
			
			int x = 0 ;
			while((x = f1.read()) != -1) { // read from the file where each time you read one one byte from it and signals -1 means end of file signal, f.read() will return till it reads till -1 
				System.out.println((char) x); // casting int x  into char x
			}
			f1.close();
		} catch (Exception er) {
			System.out.println(er);
		}
	}
}
