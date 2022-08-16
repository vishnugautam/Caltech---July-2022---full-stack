package demo;
import java.util.*;

public class StudentRecord1 {
	public static void main(String[] args)  {
		ArrayList<Learner> arr = new ArrayList<Learner>(); // this arraylist will contain elements of type Learner 
		
		// adding student record here
		// when we create an object automatically the constructor gets called and the instance variables name, roll, address gets assigned to the value given
		arr.add(new Learner("Vishnu", 12345, "Tirupur")); 
		arr.add(new Learner("Archana", 12453, "Kerala")); 
		arr.add(new Learner("Ajit", 12543, "Banglore")); 
		arr.add(new Learner("Pawan", 12369, "Africa")); 
		arr.add(new Learner("Nivya", 12789, "Chennai"));
		arr.add(new Learner("Shiksha", 16458, "Banglore"));
		arr.add(new Learner("Harish", 13567, "Pune"));
		
		System.out.println("Data before sortring....");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		// sorting the student data by rollnumber
		Collections.sort(arr, new SortByRollno()); // whenever we use collections.sort it will look into compareTo function, but
		// here we are creating an instance to sortByRollbo class which implements from comparator which is of Learner type
		// based on the sorting happens in the compare() function collections.sort it
		System.out.println("Data after sorting...");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
// class which represents enrolled student data 
class Learner{
	String courseName;
	int rollno;
	String location;
	
	// constructor to initialize student name, roll number and address
	public Learner(String courseName, int rollNumber, String location){
		this.courseName = courseName;
		this.rollno = rollNumber;
		this.location = location;
	}
	
	// formatting rollnumber, name and address
	public String toString() {
		return this.rollno + " " + this.courseName + " " + this.location;
	}
}

class SortByRollno implements Comparator<Learner>{ // Comparator has compare() method 
	public int compare(Learner a, Learner b) {
		return a.rollno - b.rollno; // based on the diff, the difference will be sent to Collections to sort
	}
}

