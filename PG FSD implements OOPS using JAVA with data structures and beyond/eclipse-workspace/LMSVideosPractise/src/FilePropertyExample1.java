import java.io.File;
import java.io.IOException;

public class FilePropertyExample1 {

	public static void main(String[] a) throws IOException {
//				if (a.length == 0) {
//				    System.out.println("Error -- Allocation policy not specified.");
//				    return;
//				}
//				String filename = a[0];// command line argument 
		        String filename = "testfile1.txt"; 
		        // when you pass an argument to your main method 
		        File f1 = new File(filename);
		        boolean newFile = f1.createNewFile(); // this creates new empty file 
		        System.out.println(newFile); // returns true if the file does not exist and new file is created, if already exist
		        // it returns false 
		        System.out.println("Name of the file = " + f1.getName());
		        System.out.println("Path of the file = " + f1.getPath());
		        System.out.println("Absolute path of the file = " + f1.getAbsolutePath());
		        System.out.println("Parent of the file = " + f1.getParent());
		        System.out.println("Is file exists = " + f1.exists());
		        
		        if(f1.exists()){
		            System.out.println("Is it writable = " + f1.canWrite());
		            System.out.println("Is it readable = " + f1.canRead());
		            System.out.println("Is it a directory  = " + f1.isDirectory());
		            System.out.println("File size in bytes = " + f1.length());
		        }       
		    }
		}


