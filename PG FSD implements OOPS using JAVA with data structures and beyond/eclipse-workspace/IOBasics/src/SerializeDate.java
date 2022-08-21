import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class SerializeDate {
	// constructor 
	public SerializeDate(){
		Date d = new Date();
		
		try { 
			FileOutputStream f = new FileOutputStream("date.ser");
			// wrtieObject() method is present in objectOutputStream
			// ObjectOutputStream helps to perform serialisation 
			ObjectOutputStream s = new ObjectOutputStream(f);
			// write the date to the particular file - convert date into bytes and store it 
			s.writeObject(d);
			s.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SerializeDate();

	}

}
