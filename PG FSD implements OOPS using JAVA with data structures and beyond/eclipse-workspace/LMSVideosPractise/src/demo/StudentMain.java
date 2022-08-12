package demo;

class Student{
	int registerNumber;
	String studentName;
	
	Student(int reg_no, String name){
		this.registerNumber = reg_no; 
		this.studentName = name;
	}
}

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] arr;
		
		arr = new Student[5];
		
		arr[0] = new Student(1234, "Vishnu");
		arr[1] = new Student(1235, "Archana");
		arr[2] = new Student(1236, "Pawan");
		arr[3] = new Student(1237, "Ajit");
		arr[4] = new Student(1238, "Shiksha");
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println("Students with registration no " + arr[i].registerNumber + " is " + arr[i].studentName);
		}
	}

}
