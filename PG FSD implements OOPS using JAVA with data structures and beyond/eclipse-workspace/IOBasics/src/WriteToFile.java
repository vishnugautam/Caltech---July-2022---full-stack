import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) {
		String data = "This is the data in the output file";
		
		try {
			// so this FileWriter creates a writable file 
			// the FileWriter class implements FileWriter interface 
			FileWriter output = new FileWriter("output.txt");
			
			//write() method of FileWrtier allows us to write into a file
			output.write(data);
			
			System.out.println("Data is written to the file");
			
			output.close();
					
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
