import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		// we can get filename from scanner 
		
		// create the file object for the current location
		File file = new File("newFile.txt");
		
		try {
			// from the file instance we have createNewFile() method which actually creates the file
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("The new file is created");
			} else {
				System.out.println("The file already exist");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
