package demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentRecord implements Comparable{
	String name;
	int rollNumber;
	String address;
	
	// constructor to initialize student name, roll number and address
	StudentRecord(String name, int rollNumber, String address){
		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;
	}
	
	// formatting rollnumber, name and address
	public String toString() {
		return this.rollNumber + " " + this.name + " " + this.address;
	}
	public static void main(String[] args)  {
		List stud = new ArrayList();
		
		// adding student record here
		// when we create an object automatically the constructor gets called and the instance variables name, roll, address gets assigned to the value given
		stud.add(new StudentRecord("Vishnu", 12345, "Tirupur")); 
		stud.add(new StudentRecord("Archana", 12453, "Kerala")); 
		stud.add(new StudentRecord("Ajit", 12543, "Banglore")); 
		stud.add(new StudentRecord("Pawan", 12369, "Africa")); 
		stud.add(new StudentRecord("Nivya", 12789, "Chennai"));
		stud.add(new StudentRecord("Shiksha", 16458, "Banglore"));
		stud.add(new StudentRecord("Harish", 13567, "Pune"));
		
		// sorting the student data
		Collections.sort(stud); // whenever we use collections.sort it will look into compareTo function 
		
		// sorting by rollNumber 
		System.out.println("After sorting based on roll number: ");
		for(int i=0; i<stud.size(); i++) { // to know the length of elements in a list we have to use size()
			System.out.println(stud.get(i)); // whenever we use get() the toString() function gets executed
		}
		
		@Override // we are overriding the method compareTo from Comparable
		public int compareTo(object o) {
			return this.rollNumber - ((studentRecord)o).rollNumber; // studentRecord of 0 the object instance which is stud
		}

	}

}
