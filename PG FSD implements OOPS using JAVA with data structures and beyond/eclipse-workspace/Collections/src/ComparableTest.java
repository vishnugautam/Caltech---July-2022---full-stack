import java.util.*;
public class ComparableTest {

	public static void main(String[] args) {
		//a TreeSet class is a class which implements the TreeSet interface which sorts the set
		// we are not telling the TreeSet() based on which to sort so we use Comparable interface in Student class
		// so the compareTo() method is invoked by the TreeSet() method automatically 
		TreeSet  set = new TreeSet();
		set.add(new Student("Mike", "Hoffman", 101, 4));
		set.add(new Student("John", "Kindle", 103, 3));
		set.add(new Student("Jim", "Max", 103, 3.6));
		set.add(new Student("Kelly", "Cuoco", 104, 2.3));
		
//		System.out.println(set); [Student@26f0a63f, Student@4361bd48, Student@53bd815b, Student@2401f4c3]
//		this gives Student object references for each student 

		// convert collection(treeSet) to array object 
		Object[] studentArray = set.toArray();
//		System.out.println(studentArray); // [Ljava.lang.Object;@26f0a63f, 
		// toArray() converts the set to array and puts it in the Object 
		Student s;
		
		// for eachElement in studentArray Object 
		for(Object eachElement: studentArray) {
			s =  (Student) eachElement; // casting eachElement in (Student) object 
//			System.out.println(s); // Student@26f0a63f, Student@2812cbfa, Student@2acf57e3, Student@506e6d5e
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", s.firstName(),s.lastName(),s.studentID(),s.GPA());
		}

	}

}
