// we are going to store Student object in collection, in a set

public class Student implements Comparable{
	// Comparable interface has compareTo() method which is used to compare two values 
	public int compareTo(Object o) {
		double f = GPA - ((Student)o).GPA;
		if(f == 0.0) {
			return 0; // 0 signifies equals, both the GPA are same
		} else if (f < 0.0) {
			return -1; // negative value signifies it is less than
		} else {
			return 1; // positive value signifies it it greater than 
		}
	}
	
	String firstName, lastName;
	int studentID = 0;
	double GPA = 0.0;
	
	public Student(String firstName, String lastName, int studentID, double GPA) {
		if(firstName == null || lastName == null || studentID == 0 || GPA == 0.0) {
			// IllegalArgumentException is a class from java.lang package
			throw new IllegalArgumentException();
		} 
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.GPA = GPA;
	}
	
	public String firstName() {
		return firstName;
	}
	
	public String lastName() {
		return lastName;
	}
	
	public int studentID() {
		return studentID;
	}
	
	public double GPA() {
		return GPA;
	}
}
