import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		
		// creating a File object instance 
		File file = new File("newFile.txt");
		
		// we are deleting the file using delete() method of File object 
		boolean value = file.delete();
		
		if(value) {
			System.out.println("The file is deleted");
		} else {
			System.out.println("The file is not deleted");
		}

	}

}
