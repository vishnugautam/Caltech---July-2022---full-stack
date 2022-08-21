import java.io.File;

import javax.print.DocFlavor.STRING;

public class ListOfFiles {

	public static void main(String[] args) {
		File directoryPath = new File("C:\\Users\\Vishnu\\Desktop\\full stack");
		// list() method lists all the files and directories in the folder
		// list() would return the content as array of String so we declare the contents as an array of String[]
		String[] contents = directoryPath.list();
		System.out.println("List of files in the directories in the specified directory.");
		
		for(int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
		}
	}

}
