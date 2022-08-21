import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
public class DeserialiseDate {
    
    public DeserialiseDate() {
        Date d = null;
        
        try {
        	// taking in the file "date.ser"
			// can also do the below using File class also 
            FileInputStream f = 
                    new FileInputStream("date.ser");
         // it is used to perform deserialisation, 
            //		input chaining 
            // readObject() method is only in ObjectInputStream()
            ObjectInputStream s =
                    new ObjectInputStream(f); //chaining
            
         // readObject() method read bytes and converts into date, cast it to (Date)
            d = (Date) s.readObject();
            s.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized Date object from date.ser");
        System.out.println("Date: " +d);
    }
    public static void main(String[] args) {
        new DeserialiseDate();
    }
}

