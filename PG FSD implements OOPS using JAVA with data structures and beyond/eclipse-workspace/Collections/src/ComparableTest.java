import java.util.*;
public class ComparableTest {

	public static void main(String[] args) {
		//a TreeSet class is a class which implements the TreeSet which sorts the set
		// we are not telling the TreeSet() based on which to sort so we use Comparable in Student class
		TreeSet  set = new TreeSet();
		set.add(new Student("Mike", "Hoffman", 101, 4));
		set.add(new Student("John", "Kindle", 103, 3));
		set.add(new Student("Jim", "Max", 103, 3.6));
		set.add(new Student("Kelly", "Cuoco", 104, 2.3));
		
//		System.out.println(set);
		
		// convert collection(treeSet) to array object
		Object[] studentArray = set.toArray();
		Student s;
		
		for(Object eachElement: studentArray) {
			s = (Student) eachElement;
//			System.out.printf("Name = %s %s ID - %d GPA - %.1f\n", s.firstName(), s.lastName(), s.GPA(), s.studentID());
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", s.firstName(),s.lastName(),s.studentID(),s.GPA());
		}
		
		
		

	}

}
