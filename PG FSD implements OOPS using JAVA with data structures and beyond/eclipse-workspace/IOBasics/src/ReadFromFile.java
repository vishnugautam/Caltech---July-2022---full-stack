import java.io.FileReader;
public class ReadFromFile {
    public static void main(String[] args) {
        char[] array = new char[100];
        try
        {	// FileReader class takes an input which will create a file or read a file
            FileReader input = new FileReader("input.txt");
            
            // read() method will read the content in the file and put it inside an array
            input.read(array);
            System.out.println("Data in the file:");
            System.out.println(array);
            
            input.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

